package com.whx.jar.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @BelongsPackage: com.whx.jar.controller
 * @Author: whx
 * @CreateTime: 2023-10-17 14:29
 * @Description: TODO
 */

@RestController
@RequestMapping("/")
public class HelloController {

    @RequestMapping("/data")
    public String data(){
        System.out.println("**********data**************");
        return "hello word";
    }
}
