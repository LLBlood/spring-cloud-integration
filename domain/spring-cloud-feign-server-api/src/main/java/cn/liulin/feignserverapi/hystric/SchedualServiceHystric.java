package cn.liulin.feignserverapi.hystric;

import cn.liulin.feignserverapi.client.FeignServerClient;
import org.springframework.stereotype.Component;

/**
 * cn.liulin.feignserverapi.hystric$
 *
 * @author ll
 * @date 2021-02-20 13:27:00
 **/
@Component
public class SchedualServiceHystric implements FeignServerClient {
    @Override
    public String getMsg() {
        return "sorry. i'm not";
    }
}
