package com.heyh.nacos.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("biz")
public class BizController {

    @RequestMapping("test")
    public String test() {
        return "Hello nacos-biz!";
    }

}
