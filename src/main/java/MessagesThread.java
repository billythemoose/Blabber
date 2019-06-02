package main.java;

import java.awt.event.ActionEvent;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class MessagesThread extends Thread
{
    private MessagesThread messagesThread;
    private Socket socket;
    public MessagesThread(Socket socket)
    {
        this.messagesThread = messagesThread;
        this.socket = socket;
    }

    public MessagesThread(MessagesGUI messagesGUI, int i) {
    }

    @Override
    public void run()
    {
        try
        {
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            while(true)
            {
                try
                {
                    System.out.println("hello!!!!");
                    String message = in.readLine();
                    MessagesGUI.updateView(message);
                }
                catch(IOException e)
                {
                    e.printStackTrace();
                }
            }
        }
        catch(IOException e1)
        {
            e1.printStackTrace();
        }
    }

    private void updateView(String message) {
    }
}