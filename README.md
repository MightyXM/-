# 数据库系统实验期末课程源码说明

component-demo-v2是前端源代码，基于vue框架所搭建

mpdemo是后端源码，基于springboot框架所搭建

数据库基于mysql，包含创建该系统所需数据库和表的源码

- jdk17
- mysql8
- vue2
- springboot3

vue依赖：

```json
"dependencies": {
    "axios": "^1.6.2",
    "core-js": "^3.8.3",
    "element-ui": "^2.15.14",
    "less": "^4.1.2",
    "less-loader": "^6.0.0",
    "vue": "^2.6.14",
    "vue-router": "^3.6.5",
    "vuex": "^3.6.2"
  },
```

springboot依赖：

```xml
<dependencies>
<dependency>
<groupId>org.springframework.boot</groupId>
<artifactId>spring-boot-starter-web</artifactId>
</dependency>
<dependency>
<groupId>org.springframework.boot</groupId>
<artifactId>spring-boot-starter-test</artifactId>
<scope>test</scope>
</dependency>
<!--         MyBatisPlus依赖 -->
<dependency>
<groupId>com.baomidou</groupId>
<artifactId>mybatis-plus-boot-starter</artifactId>
<version>3.5.4</version>
</dependency>
<!--         mysql驱动依赖 -->
<!--  https://mvnrepository.com/artifact/com.mysql/mysql-connector-j  -->
<dependency>
<groupId>com.mysql</groupId>
<artifactId>mysql-connector-j</artifactId>
<version>8.2.0</version>
</dependency>
<!--         数据连接池 -->
<dependency>
<groupId>com.alibaba</groupId>
<artifactId>druid-spring-boot-starter</artifactId>
<version>1.2.15</version>
</dependency>
<!--  https://mvnrepository.com/artifact/org.mybatis/mybatis-spring  -->
<dependency>
<groupId>org.mybatis</groupId>
<artifactId>mybatis-spring</artifactId>
<version>3.0.3</version>
</dependency>
<!-- 热部署 -->
<!--         <dependency> -->
<!--             <groupId>org.springframework.boot</groupId> -->
<!--             <artifactId>spring-boot-devtools</artifactId> -->
<!--             <optional>true</optional> -->
<!--         </dependency> -->
</dependencies>
```

