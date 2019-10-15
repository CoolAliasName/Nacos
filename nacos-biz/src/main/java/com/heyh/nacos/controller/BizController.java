package com.heyh.nacos.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("biz")
public class BizController {

    @RequestMapping(value = "test", method = RequestMethod.GET)
    public String test() {
        return "Hello nacos-biz!";
    }

}
