package com.strong.java.objectoriented.networkProgram;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketTimeoutException;

/**
 * @author: strong
 * @since: 2024/3/23 19:49
 * @description:
 */
public class GreetingServer extends Thread {
    private ServerSocket serverSocket;

    public GreetingServer(int port) throws IOException {
        try{
            serverSocket = new ServerSocket(port);
            serverSocket.setSoTimeout(100000);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void run(){
        while(true){
            try{
                System.out.println("等待远程连接，端口号为：" + serverSocket.getLocalPort() + "...");
                Socket server = serverSocket.accept();
                System.out.println("远程主机地址：" + server.getRemoteSocketAddress());
//                System.out.println("连接成功");
                DataInputStream in = new DataInputStream(server.getInputStream());
                System.out.println("从客户端读取数据: " + in.readUTF());
                DataOutputStream out = new DataOutputStream(server.getOutputStream());
                out.writeUTF("谢谢连接我：" + server.getLocalSocketAddress() + "\nGoodbye!");
                server.close();
            }catch (SocketTimeoutException s){
                System.out.println("Socket timed out!");
                break;
            }catch (IOException e){
                e.printStackTrace();
                break;
            }
        }
    }


    public static void main(String[] args){
        int port = Integer.parseInt(args[0]);
        try{
            Thread t = new GreetingServer(port);
            t.start();
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
