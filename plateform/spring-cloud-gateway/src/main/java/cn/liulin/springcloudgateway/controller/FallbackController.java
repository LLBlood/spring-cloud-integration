package cn.liulin.springcloudgateway.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * cn.liulin.springcloudgateway.controller$
 *
 * @author ll
 * @date 2021-02-22 14:17:37
 **/
@RestController
public class FallbackController {

    @RequestMapping("/fallback")
    public String fallback(){
        return "error";
    }
}
