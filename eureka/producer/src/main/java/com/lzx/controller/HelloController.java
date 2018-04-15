package com.lzx.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2018/4/5.
 */
@RestController
public class HelloController {
    @GetMapping("/hello")
    public String index(@RequestParam String name ){
        return  "hello" + name +",this is first message";
    }
}
