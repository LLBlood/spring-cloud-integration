package cn.liulin.feignserverapi.client;

import cn.liulin.feignserverapi.hystric.SchedualServiceHystric;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * cn.liulin.feignserverapi.client$
 *
 * @author ll
 * @date 2021-02-20 09:57:20
 **/
@FeignClient(value = "spring-cloud-feign-server", fallback = SchedualServiceHystric.class)
public interface FeignServerClient {

    /**
     * 获取信息数据
     * @author ll
     * @date 2021-02-20 10:13:29
     * @return java.lang.String
     **/
    @RequestMapping("/getMsg")
    String getMsg();
}
