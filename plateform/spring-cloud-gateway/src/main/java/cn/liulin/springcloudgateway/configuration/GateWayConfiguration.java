package cn.liulin.springcloudgateway.configuration;

import org.springframework.cloud.gateway.filter.ratelimit.KeyResolver;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import reactor.core.publisher.Mono;

/**
 * cn.liulin.springcloudgateway$
 * Route 路由定义了路由断言、过滤器、路由地址及路由优先级等信息。当请求到达时
 * 在转发到代理服务之前，会依次经过路由断言匹配路由 和 网关过滤器处理。
 *
 * @author ll
 * @date 2021-02-20 14:20:20
 **/
@Configuration
public class GateWayConfiguration {

    @Bean
    public KeyResolver hostAddrKeyResolver() {
        return exchange -> Mono.just(exchange.getRequest().getRemoteAddress().getHostName());
    }

    @Bean
    public KeyResolver userKeyResolver() {
        return exchange -> Mono.just(exchange.getRequest().getQueryParams().getFirst("userId"));
    }

    @Bean
    KeyResolver apiKeyResolver() {
        return exchange -> Mono.just(exchange.getRequest().getPath().value());
    }

    @Bean
    public RouteLocator myRoutes(RouteLocatorBuilder builder) {
        return builder.routes()
                .route(
                        p -> p.path("/get")
                        .uri("http://127.0.0.1:8762/getDemoInfo")
                )
                .build();
    }
}
