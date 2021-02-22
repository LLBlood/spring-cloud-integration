# spring-cloud-integration
SpringCloud模块聚合学习

### 一、创建父类Maven工程

其中pom内容如pom.xml所示

详见创建过程：

[创建父类maven工程](https://blog.csdn.net/qq_43479628/article/details/113863725)

### 二、创建注册中心eureka工程

其中pom内容如pom.xml所示

详见创建过程：

[创建注册中心eureka工程](https://blog.csdn.net/qq_43479628/article/details/113865942)

注意test测试类导入test包错误

application.properties更改为application.yml，并写入配置文件信息

配置文件详见：spring-cloud-integration\plateform\spring-cloud-eureka\src\main\resources\application.yml

### 三、创建eureka客户端demo1工程

其中pom内容如pom.xml所示

详见创建过程：

[创建eureka客户端demo1工程](https://blog.csdn.net/qq_43479628/article/details/113868969)

注意test测试类导入test包错误

application.properties更改为application.yml，并写入配置文件信息

配置文件详见：spring-cloud-integration\domain\spring-cloud-demo1\src\main\resources\application.yml

### 四、创建Feign进行服务端调用

其中pom内容如pom.xml所示

详见创建过程：

[创建Feign进行服务端调用](https://blog.csdn.net/qq_43479628/article/details/113876501)

注意test测试类导入test包错误

application.properties更改为application.yml，并写入配置文件信息

服务端调用涉及到三个项目

spring-cloud-feign-server-api, spring-cloud-feign-server, spring-cloud-feign-client

其中spring-cloud-feign-server-api是普通maven项目，仅用于定义feign调用及调用地址

spring-cloud-feign-server用于内部实现spring-cloud-feign-server-api定义的feign接口，过滤重复调用

spring-cloud-feign-client则是正常调用服务

### 五、在Feign中使用Hystric断路器

详见创建过程：

[在Feign中使用Hystric断路器](https://blog.csdn.net/qq_43479628/article/details/113880242)

注意此时server未启动，所以开启断路器需要在client端进行

且由于spring-cloud-feign-server-api与spring-cloud-feign-client虽然有关联，但是spring-cloud-feign-client无法直接扫描到Hystric类，需要在configuration中添加扫描信息

当正常启动时，不会触发fallback

但是server服务挂掉时，访问就会触发fallback

### 六、搭建网关gateway

详见创建过程：

[使用gateway作为服务网关-predicate](https://blog.csdn.net/qq_43479628/article/details/113882426)

网关作用

- 协议转换，路由转发
- 流量聚合，对流量进行监控，日志输出
- 作为整个系统的前端工程，对流量进行控制，有限流的作用
- 作为系统的前端边界，外部流量只能通过网关才能访问系统
- 可以在网关层做权限的判断
- 可以在网关层做缓存

predicate：路由断言，用来匹配参数进行路径转发

[使用gateway作为服务网关-filters](https://blog.csdn.net/qq_43479628/article/details/113939461)

需要注意

​	1.Hystrix FallbackHeaders GatewayFilter Factory添加断路器需要加入依赖，并且新增fallback控制层