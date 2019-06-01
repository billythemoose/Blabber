package main.java;

import java.net.ServerSocket;
import java.io.IOException;
import java.net.Socket;
import java.util.HashMap;
import java.util.Iterator;
import java.io.PrintWriter;

public class Server
{
    private ServerSocket server;
    private HashMap<Socket, PrintWriter> outStreams = new HashMap<Socket, PrintWriter>();

    public Server(int port)
    {
        try
        {
            server = new ServerSocket(port);
            System.out.println("Server is ready!");
            while(true)
            {
                Socket socket = server.accept();
                // Blabber is connected.
                PrintWriter outStream = new PrintWriter(socket.getOutputStream());
                outStreams.put(socket, outStream);
                ServerThread serverThread = new ServerThread(this, socket);
                serverThread.start();
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public void broadcast(String message)
    {
        for(Iterator iterator = outStreams.keySet().iterator(); iterator.hasNext();)
        {
            Socket socket = (Socket) iterator.next();
            PrintWriter outStream = outStreams.get(socket);
            outStream.println(message);
            outStream.flush();
        }
    }

    public static void main(String[] args)
    {
        Server server = new Server(1234);
    }
}