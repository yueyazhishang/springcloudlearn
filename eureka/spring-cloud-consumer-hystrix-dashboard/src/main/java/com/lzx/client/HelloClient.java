package com.lzx.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by Administrator on 2018/4/5.
 */
@FeignClient(name= "spring-cloud-producer",fallback = HelloRemoteHystrix.class )
public interface HelloClient {
    @GetMapping("/hello")
    String hello(@RequestParam("name") String name);
}

@Component
 class HelloRemoteHystrix implements HelloClient{
    @Override
    public String hello(@RequestParam(value = "name") String name) {
        return "hello" +name+", this messge send failed ";
    }
}
