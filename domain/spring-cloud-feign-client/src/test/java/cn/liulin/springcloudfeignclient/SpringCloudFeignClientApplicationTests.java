package cn.liulin.springcloudfeignclient;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.ZonedDateTime;

public class SpringCloudFeignClientApplicationTests {

    @Test
    public void contextLoads() {
    }

    @Test
    public void getChinaTime() {
        ZonedDateTime now = ZonedDateTime.now(); //默认时区
        System.out.println(now);
    }

}
