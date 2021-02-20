package cn.liulin.springcloudfeignclient.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * cn.liulin.springcloudfeignclient.configuration$
 *
 * @author ll
 * @date 2021-02-20 13:42:50
 **/
@Configuration
@ComponentScan(basePackages = {"cn.liulin.feignserverapi.hystric"})
public class FeignClientConfiguration {

}
