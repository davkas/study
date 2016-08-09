package com.davkas.nio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Date;

/**
 * Created by hzzhengxianrui on 2016/7/18.
 */
public class BioTimeServerHandler implements Runnable{
    private Socket socket;
    BioTimeServerHandler(Socket socket) {
        this.socket = socket;
    }


    @Override
    public void run() {
        BufferedReader in = null;
        PrintWriter out = null;
        try {
            in = new BufferedReader(new InputStreamReader(this.socket.getInputStream()));
        } catch (IOException e) {
            e.printStackTrace();
        }
        String body = null;
        String currentTime = null;
        while (true){
            try {
                body = in.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            if(body == null){
                break;
            }
            System.out.println("The time server receive order :" + body);
        }
    }
}
