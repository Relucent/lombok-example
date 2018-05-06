## Lombok是什么
Lombok 是一个可以通过简单的注解形式来帮助我们简化消除一些必须有但显得很臃肿的Java代码的工具，通过使用对应的注解，可以在编译源码的时候生成对应的方法.  

官方地址： [https://projectlombok.org/](https://projectlombok.org/)   
github地址： [https://github.com/rzwitserloot/lombok](https://github.com/rzwitserloot/lombok) 

## Lombok安装
1. 下载 Lombok （1.16.20）
2.  在 eclipse.ini 文件末尾添加  

	-javaagent:lombok-1.16.20.jar  

## 添加maven项目依赖

    <dependency>
        <groupId>org.projectlombok</groupId>
        <artifactId>lombok</artifactId>
        <version>1.16.20</version>
    </dependency>

## Lombok 常用注解

### [@val](https://my.oschina.net/valray) [@var](https://my.oschina.net/u/1030343) 
弱类型定义变量；val注解变量申明是final类型，var注解变量是非final类型

### [@NonNull](https://my.oschina.net/u/2981441) 
在方法或构造函数的参数上使用[@NonNull](https://my.oschina.net/u/2981441)，lombok将生成一个空值检查语句  

### [@Getter](https://my.oschina.net/u/3288663) @Setter @Accessors
给类增加 Get 和 Set 方法，使用 @Accessors 注解可以让set方法返回类本身，从而实现链式风格编程  

### @ToString  
给类增加 toString 方法  

### @EqualsAndHashCode  
给类增加equals和hashCode方法

### @NoArgsConstructor  
给类增加无参构造器  

### @RequiredArgsConstructor  
给类增加指定参数的构造器   

### @AllArgsConstructor  
给类增加包含所有参数的构造器   

### @Data  
等同于 @ToString + @EqualsAndHashCode  +  @Getter + @Setter + @RequiredArgsConstructor

### @Value
提供final变量的 @Getter  

### @Builder  
提供建筑者模式  

### @SneakyThrows
转换checked异常为unchecked异常  

### @Synchronized  
类似 Synchronized 关键字，但是可以隐藏同步锁 (会生成一个内部final对象，锁会加这个内部变量，而不是类本身)

### @Log @Slf4j  @CommonsLog  
生成各种log对象