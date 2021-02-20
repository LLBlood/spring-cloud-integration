package cn.liulin.springcloudfeignserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * feign服务提供
 * @author ll
 * @date 2021-02-20 10:04:31
 **/
@SpringBootApplication
@EnableEurekaClient
public class SpringCloudFeignServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudFeignServerApplication.class, args);
    }

}
