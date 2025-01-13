import java.io.*;
import java.net.*;

public class Client {
    public static void main(String[] args) {
        String host = "server";
        int port = 8080;

        try (Socket socket = new Socket(host, port)) {
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            out.println("Hello from Client!");
            String response = in.readLine();
            System.out.println("Response from server: " + response);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
