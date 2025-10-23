package czat;

import java.io.*;
import java.net.*;

public class Serwer {
    public static void main(String[] args) {
        try {
            ServerSocket serwer = new ServerSocket(2011);
            System.out.println("Uruchomiono serwer.");
            
            do {
                Socket socket = serwer.accept();
                InputStream input = socket.getInputStream();
                OutputStream output = socket.getOutputStream();
                
                boolean zakoncz = false;
                while (!zakoncz) {
                    labelCzyUruchiomony.setText("Uruchomiony");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
