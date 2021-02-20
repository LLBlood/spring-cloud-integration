package cn.liulin.springcloudfeignclient.controller;

import cn.liulin.feignserverapi.client.FeignServerClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * cn.liulin.springcloudfeignclient.controller$
 *
 * @author ll
 * @date 2021-02-20 10:34:25
 **/
@RestController
public class FeignClientController {

    @Resource
    private FeignServerClient feignServerClient;

    /**
     * 获取对应数据
     * @author ll
     * @date 2021-02-20 10:35:24
     * @return java.lang.String
     **/
    @RequestMapping("/getInfo")
    public String getInfo() {
        return feignServerClient.getMsg();
    }
}
