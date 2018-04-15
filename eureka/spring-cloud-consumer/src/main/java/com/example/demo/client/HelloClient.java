package com.example.demo.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by Administrator on 2018/4/5.
 */
@FeignClient(name= "spring-cloud-producer" )
public interface HelloClient {
    @GetMapping("/hello")
    String hello(@RequestParam("name") String name);
}
