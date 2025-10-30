package chat;

import java.io.*;
import java.net.*;
import java.util.*;

public class ChatServer {
    private ServerSocket serverSocket;
    private boolean running = false;
    private Set<ClientHandler> clients = Collections.synchronizedSet(new HashSet<>());
    private Chat gui;

    public ChatServer(Chat gui) {
        this.gui = gui;
    }

    public void startServer(int port) {
        new Thread(() -> {
            try {
                serverSocket = new ServerSocket(port);
                running = true;
                gui.updateServerStatus("Włączony");

                while (running) {
                    Socket socket = serverSocket.accept();
                    ClientHandler client = new ClientHandler(socket);
                    clients.add(client);
                    new Thread(client).start();
                }

            } catch (IOException e) {
                gui.updateServerStatus("Błąd: " + e.getMessage());
            } finally {
                stopServer();
            }
        }).start();
    }

    public void stopServer() {
        running = false;
        try {
            if (serverSocket != null) serverSocket.close();
        } catch (IOException ignored) {}
        gui.updateServerStatus("Wyłączony");
    }

    private void broadcast(String message) {
        synchronized (clients) {
            for (ClientHandler client : clients) {
                client.sendMessage(message);
            }
        }
    }

    private void updateUserList() {
        StringBuilder userList = new StringBuilder("/users ");
        synchronized (clients) {
            for (ClientHandler c : clients) {
                if (c.username != null) {
                    userList.append(c.username).append(",");
                }
            }
        }
        broadcast(userList.toString());
    }

    private class ClientHandler implements Runnable {
        private Socket socket;
        private PrintWriter out;
        private BufferedReader in;
        private String username;

        ClientHandler(Socket socket) {
            this.socket = socket;
        }

        @Override
        public void run() {
            try {
                in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                out = new PrintWriter(socket.getOutputStream(), true);

                out.println("LOGIN?");
                username = in.readLine();

                gui.addUser(username);
                broadcast("[" + username + "] dołączył do czatu!");
                updateUserList();

                String message;
                while ((message = in.readLine()) != null) {
                    if (message.startsWith("/w ")) {
                        String[] parts = message.split(" ", 3);
                        if (parts.length >= 3) {
                            String target = parts[1];
                            String msg = parts[2];
                            sendPrivate(target, msg);
                        }
                    } else {
                        broadcast(username + ": " + message);
                    }
                }

            } catch (IOException e) {
                gui.removeUser(username);
                broadcast("[" + username + "] opuścił czat.");
                updateUserList();
            } finally {
                try { socket.close(); } catch (IOException ignored) {}
                clients.remove(this);
            }
        }

        void sendMessage(String msg) {
            out.println(msg);
        }

        void sendPrivate(String target, String msg) {
            synchronized (clients) {
                for (ClientHandler c : clients) {
                    if (c.username != null && c.username.equals(target)) {
                        c.sendMessage("(priv od " + username + "): " + msg);
                        out.println("(priv do " + target + "): " + msg);
                        return;
                    }
                }
            }
            out.println("Nie znaleziono użytkownika: " + target);
        }
    }
}
