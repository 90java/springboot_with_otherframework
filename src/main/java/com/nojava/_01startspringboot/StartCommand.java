package com.nojava._01startspringboot;

import com.nojava.util.NetUtil;
import org.springframework.util.StringUtils;

/**
 * 启动参数设置类
 *
 *
 */
public class StartCommand {
    public StartCommand(String[]  args) {

        Boolean isServerPort = false;
        String serverPort = "";
        if(args!=null){
            for(String s: args){
                if(StringUtils.hasText(s)&&s.startsWith("--server.port")){
                    isServerPort=true;
                    serverPort = s;
                    break;
                }
            }
        }
        if(!isServerPort){
            int port = NetUtil.getAvailablePort();
            System.out.println("current port-:"+port);
            System.setProperty("server.port",String.valueOf(port));
        }else{
            System.out.println("current port:"+serverPort.split("=")[1]);
            System.setProperty("server.port",serverPort.split("=")[1]);
        }



    }


}
