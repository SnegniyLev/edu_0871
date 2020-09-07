package sample;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Arrays;

public class Controller {
    public Socket socket;
    public DataInputStream in;
    public DataOutputStream out;

    @FXML
    TextArea messageWindow;

    @FXML
    TextArea userList;

    @FXML
    TextField textField;

    @FXML
    private void send(){
        String str = textField.getText();
        try {
            out.writeUTF(str);
            textField.clear();
            textField.requestFocus();
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }

    public void startClient(){
        try {
            socket = new Socket("localhost",8188);
            in = new DataInputStream(socket.getInputStream());
            out = new DataOutputStream(socket.getOutputStream());
            String response = in.readUTF();
            messageWindow.appendText("\n"+response);
            Thread responseThread = new Thread(new Runnable() {
                @Override
                public void run() {
                    while (true){
                        String response = null;
                        try {
                            response = in.readUTF();
                            String response2 = response.substring(1);
                            String[] responseArray = response2.split("]##");
                            messageWindow.appendText("\n"+responseArray[1]);
                            userList.clear();
                            String[] Array = responseArray[0].split(", ");
                            for (int i = 0; i < Array.length; i++) {
                                userList.appendText(Array[i]+"\n");
                            }
                        } catch (IOException exception) {
                            System.out.println("ERROR");
                        }
                    }
                }
            });
            responseThread.start();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
