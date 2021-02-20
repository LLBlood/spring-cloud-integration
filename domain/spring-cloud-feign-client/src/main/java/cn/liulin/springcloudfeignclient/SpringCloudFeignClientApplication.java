package cn.liulin.springcloudfeignclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Feign客户端<br/>
 * EnableFeignClients 扫描和注册feign客户端bean定义
 * @author ll
 * @date 2021-02-20 10:30:27
 **/
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = {"cn.liulin.feignserverapi.client"})
public class SpringCloudFeignClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudFeignClientApplication.class, args);
    }

}
