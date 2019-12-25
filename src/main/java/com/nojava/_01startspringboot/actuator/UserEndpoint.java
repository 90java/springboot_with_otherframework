package com.nojava._01startspringboot.actuator;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 自定义端点 不是默认暴露，如果程序配置不是配置全部打开，则需要单独配置该端点暴露
 */
@Component
@Endpoint(id = "user")//user 端点
public class UserEndpoint {

    @ReadOperation
    public List<Map<String,String>> health(){
        List<Map<String,String>> list = new ArrayList<>();
        Map<String,String> map = new HashMap<>();
        map.put("userid","1111111111");
        map.put("name","lixiaofeng");
        list.add(map);
        return list;
    }

}
