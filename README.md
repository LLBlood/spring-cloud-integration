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

注意：

​	当使用eureka集群时，只需要更改defaultZone后面的url，并以，分隔

​	且本地若想多个eureka集群，则需更改host映射

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

​	2.RequestRateLimiter GatewayFilter Factory添加redis限流需要加入依赖，并且配置redis信息

​	3.redis如果有密码，就一定要配置上，否则限流会失效，且无异常信息

[使用gateway作为服务网关-服务注册与发现](https://blog.csdn.net/qq_43479628/article/details/114011123)

需要注意

​	如果同时使用predicate和gateway开启服务注册和发现的功能，那么两个url都会生效

### 七、使用配置中心springCloudConfig

详见创建过程：

[SpringCloudConfig的配置及使用](https://blog.csdn.net/qq_43479628/article/details/114021607)

优点，各个配置文件可以统一被管理，而且配置更新后，无需重启服务，且配置中心可进行高可用集群

需要注意

​	1、客户端需要使用bootstrap.yml

​	2、客户端配置中心服务url有两种方式，直接Url和discovery，discovery的前提是该客户端已被注册到eureka中

### 八、SpringCloudBus消息总线的配置及使用

详见创建过程：

[SpringCloudBus消息总线的配置及使用](https://blog.csdn.net/qq_43479628/article/details/114121237)

注意：

​	刷新url需要使用post请求