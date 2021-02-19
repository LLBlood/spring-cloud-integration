package cn.liulin.springclouddemo1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * eureka Client Demo信息
 * @author ll
 * @date 2021-02-19 17:51:02
 **/
@SpringBootApplication
@EnableEurekaClient
public class SpringCloudDemo1Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudDemo1Application.class, args);
    }

}
