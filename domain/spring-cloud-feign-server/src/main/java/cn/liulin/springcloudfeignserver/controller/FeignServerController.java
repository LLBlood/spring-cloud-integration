package cn.liulin.springcloudfeignserver.controller;

import cn.liulin.feignserverapi.client.FeignServerClient;
import org.springframework.web.bind.annotation.RestController;

/**
 * cn.liulin.springcloudfeignserver.controller$
 *
 * @author ll
 * @date 2021-02-20 10:15:19
 **/
@RestController
public class FeignServerController implements FeignServerClient {
    @Override
    public String getMsg() {
        return "渣渣";
    }
}
