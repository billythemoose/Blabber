package main.java;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class BlabberApplication
{
    private String chatLog = "";
    private JTextArea chatTxt = new JTextArea(20,3);
    private JTextField msgTxt = new JTextField(20);

    public BlabberApplication(int port)
    {
        try
        {
            Socket socket = new Socket("localhost", port);
            System.out.println("Blabber application connected... ");
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
            msgTxt.addKeyListener(new KeyListener()
            {
                @Override
                public void keyTyped(KeyEvent e) {}

                @Override
                public void keyReleased(KeyEvent e)
                {
                    if(e.getKeyCode() == KeyEvent.VK_ENTER)
                    {
                        String message = msgTxt.getText();
                        PrintWriter outStream;
                        try
                        {
                            outStream = new PrintWriter(socket.getOutputStream());
                            outStream.println(message);
                            outStream.flush();
                        }
                        catch(IOException e1)
                        {
                            e1.printStackTrace();
                        }
                    }
                }

                @Override
                public void keyPressed(KeyEvent e){}
            });
            BlabberThread blabberThread = new BlabberThread(this, socket);
            blabberThread.start();
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LoginGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                LoginGUI login = new LoginGUI();
                login.setVisible(true);
            }
        });
    }

    public void updateView(String message)
    {
        chatLog += message + "\n";
        chatTxt.setText(chatLog);
    }

    public static void main(String args[])
    {
        BlabberApplication blabberApplication = new BlabberApplication(1234);
    }
}
