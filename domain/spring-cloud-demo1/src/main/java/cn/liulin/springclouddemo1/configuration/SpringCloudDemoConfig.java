package cn.liulin.springclouddemo1.configuration;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

/**
 * cn.liulin.springclouddemo1.configuration$
 *
 * @author ll
 * @date 2021-02-24 16:17:24
 **/
@Configuration
@Data
public class SpringCloudDemoConfig {

    @Value("${name}")
    private String name;

    @Value("${age}")
    private Integer age;

    @Value("${sex}")
    private String sex;

    @Value("${version}")
    private String version;

    @Override
    public String toString() {
        return "SpringCloudDemoConfig{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", version='" + version + '\'' +
                '}';
    }
}
