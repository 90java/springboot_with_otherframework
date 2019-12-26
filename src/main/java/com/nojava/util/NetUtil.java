package com.nojava.util;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Random;

public class NetUtil {
    /***
     *  true:already in using  false:not using
     * @param port
     */
    public static boolean isLoclePortUsing(int port){
        boolean flag = true;
        try {
            flag = isPortUsing("127.0.0.1", port);
        } catch (Exception e) {
        }
        return flag;
    }
    /***
     *  true:already in using  false:not using
     * @param host
     * @param port
     * @throws UnknownHostException
     */
    public static boolean isPortUsing(String host,int port) throws UnknownHostException {
        System.out.println("-----判断端口是否占用-------");
        boolean flag = false;
        InetAddress theAddress = InetAddress.getByName(host);
        try {
            Socket socket = new Socket(theAddress,port);
            System.out.println("-----此端口被占用-------");
            flag = true;
        } catch (IOException e) {

        }
        return flag;
    }

    public static int getAvailablePort(){
        int max = 60000;
        int min = 2000;
        Random random = new Random();
        int port  = random.nextInt(max)%(max-min+1)+min;
        boolean using = NetUtil.isLoclePortUsing(port);
        if(using){
            return getAvailablePort();
        }else{
            return port;
        }
    }

}
