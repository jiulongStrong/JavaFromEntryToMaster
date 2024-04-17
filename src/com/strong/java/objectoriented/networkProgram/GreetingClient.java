package com.strong.java.objectoriented.networkProgram;

import java.io.*;
import java.net.Socket;

/**
 * @author: strong
 * @since: 2024/3/23 19:35
 * @description:
 */
public class GreetingClient {

    public static void main(String[] args) {
        String serviceHost = args[0];
        int servicePort = Integer.parseInt(args[1]);
        try
        {
            System.out.println("连接主机："+serviceHost + " 端口：" + servicePort);
            Socket client = new Socket(serviceHost, servicePort);
            System.out.println("远程主机地址：" + client.getRemoteSocketAddress());
            OutputStream outToServer = client.getOutputStream();
            DataOutputStream out = new DataOutputStream(outToServer);

            out.writeUTF("Hello from " + client.getLocalSocketAddress());
            InputStream inFromServer = client.getInputStream();
            DataInputStream in = new DataInputStream(inFromServer);

            System.out.println("Server says: " + in.readUTF());
            client.close();
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
