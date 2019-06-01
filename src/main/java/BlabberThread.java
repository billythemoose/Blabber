package main.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class BlabberThread extends Thread
{
    private BlabberApplication blabberApplication;
    private Socket socket;
    public BlabberThread(BlabberApplication blabberApplication, Socket socket)
    {
        this.blabberApplication = blabberApplication;
        this.socket = socket;
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
                    String message = in.readLine();
                    blabberApplication.updateView(message);
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
}
