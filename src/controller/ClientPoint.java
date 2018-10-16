package controller;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ClientPoint extends Thread {
    private static int PORT = 8901;
    private Socket socket;
    private BufferedReader in;
    private PrintWriter out;
    private Controller myCtrl;

    public ClientPoint(String serverAddress, Controller controller) throws Exception {
        // Setup networking
        socket = new Socket(serverAddress, PORT);
        in = new BufferedReader(new InputStreamReader(
                socket.getInputStream()));
        out = new PrintWriter(socket.getOutputStream(), true);
        myCtrl = controller;
    }

    public void run() {
        String response;
        while (true) {
            try {
                response = in.readLine();
                if (response.startsWith("UPDATE"))
                    myCtrl.updateOrders();
            }
            catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void notifyServer() {
        out.println("UPDATE");
    }
}
