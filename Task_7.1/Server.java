package Server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class Server {
    static ArrayList<Socket> clients = new ArrayList<>();
    static ArrayList<Socket> name = new ArrayList<>();
    public static void main(String[] args) {
        Socket socket = null;
        try {
            ServerSocket serverSocket = new ServerSocket(8189);
            System.out.println("Сервер запущен");
            while (true){
                socket = serverSocket.accept();
                clients.add(socket);
                DataInputStream in = new DataInputStream(socket.getInputStream());
                DataOutputStream out = new DataOutputStream(socket.getOutputStream());
                out.writeUTF("Ваше имя?");
                String name = in.readUTF();
                UserName(name);
                System.out.println("Подключился клиент "+name);
                Thread thread = new Thread(new Runnable() {
                    @Override
                    public void run() {
                        try {
                            while (true){
                                String str = in.readUTF();
                                broadcastMsg(str);
                                System.out.println(name+": "+str);
                            }
                        }catch (IOException e){
                            e.printStackTrace();
                        }
                    }
                });
                thread.start();
            }
        }catch (IOException ex){
            ex.printStackTrace();
        }
    }

    public static void broadcastMsg(String str) throws IOException{
        DataOutputStream out;
        for (Socket socket : clients){
                out = new DataOutputStream(socket.getOutputStream());
                out.writeUTF(name + ": " + str);
        }
    }
    public static void UserName(String str) throws IOException{
        DataInputStream input;
        for (Socket socket : name){
            input = new DataInputStream(socket.getInputStream());
            name.add(socket);
        }
    }
}
