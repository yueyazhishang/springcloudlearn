package com.lzx.api;

import com.lzx.client.HelloClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2018/4/5.
 */
@RestController
public class HelloApi {
    @Autowired
    private HelloClient helloClient ;
    @GetMapping("/hello/{name}")
    public String index(@PathVariable String name){
        return helloClient.hello(name);
    }
}
