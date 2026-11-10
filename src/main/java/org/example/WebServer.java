package org.example;

import java.io.*;
import java.net.*;

public class WebServer {
    public static void main(String[] args) {
        int port = 1989;

        try (ServerSocket serverSocket = new ServerSocket(port)) {
            System.out.println("Web sunucusu baslatildi. Tarayicidan erismek icin: http://localhost:" + port);

            while (true) {
                // Tarayıcıdan gelen bağlantıyı kabul et
                Socket clientSocket = serverSocket.accept();

                // Okuma ve yazma akışlarını oluştur
                BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);

                // Tarayıcının gönderdiği HTTP istek satırlarını oku
                String line = in.readLine();
                if (line != null) {
                    System.out.println("Gelen istek: " + line);
                }

                // HTTP header sonuna kadar oku
                while ((line = in.readLine()) != null && !line.isEmpty()) {
                    // Header bitti
                }

                // HTML içeriğini al
                String htmlBody = HtmlContent.getPage();
                byte[] htmlBytes = htmlBody.getBytes("UTF-8");

                // HTTP Yanıtını tarayıcıya gönder
                out.println("HTTP/1.1 200 OK");
                out.println("Content-Type: text/html; charset=UTF-8");
                out.println("Content-Length: " + htmlBytes.length);
                out.println(); // Header ile Body arasına boşluk bırakılır

                // Gövdeyi yazdır
                out.println(htmlBody);

                // Bağlantıyı kapat
                clientSocket.close();
            }

        } catch (IOException e) {
            System.err.println("Sunucu hatasi: " + e.getMessage());
        }
    }
}
