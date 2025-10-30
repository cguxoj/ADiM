package chat;

import java.io.*;
import java.net.*;
import javax.swing.*;

public class ChatClient {
    private Socket socket;
    private BufferedReader in;
    private PrintWriter out;
    private Chat gui;
    private String username;

    public ChatClient(Chat gui) {
        this.gui = gui;
    }

    public boolean connect(String serverIp, int port, String username) {
        try {
            this.username = username;
            socket = new Socket(serverIp, port);
            out = new PrintWriter(socket.getOutputStream(), true);
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            new Thread(this::listen).start();

            String line = in.readLine();
            if ("LOGIN?".equals(line)) {
                out.println(username);
            }

            gui.addMessage("[Połączono z serwerem]");
            return true;
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Nie udało się połączyć z serwerem.");
            return false;
        }
    }

    public void sendMessage(String msg) {
        if (out != null) {
            out.println(msg);
        }
    }
    
    private void listen() {
        try {
            String line;
            while ((line = in.readLine()) != null) {
                // Obsługa wiadomości
                if (line.startsWith("/users ")) {
                    String[] users = line.substring(7).split(",");
                    gui.updateUserList(users);  // Wywołanie aktualizacji listy użytkowników
                } else {
                    gui.addMessage(line);  // Normalne wiadomości
                }
            }
        } catch (IOException e) {
            gui.addMessage("[Rozłączono z serwerem]");
        }
    }

    public void disconnect() {
        try {
            if (socket != null) socket.close();
        } catch (IOException ignored) {}
    }
}
