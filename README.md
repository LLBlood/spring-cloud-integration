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