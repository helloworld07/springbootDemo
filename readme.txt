1.springboot有自己自动装配的操作数据库的，无需写sql语句即可完成增删改查的任务
    如：UserRepository.java中的几个方法，都是自带的
  如果需要自定义灵活的数据库操作，可以使用MyBatis等来进行数据库操作
    如：UserMapper.java中的自己来写sql语句，需要注意表名与实体名字的不同情况。

2.Swagger 是一个规范和完整的框架，用于生成、描述、调用和可视化 RESTful 风格的 Web 服务。
  总体目标是使客户端和文件系统作为服务器以同样的速度来更新。
  文件的方法，参数和模型紧密集成到服务器端的代码，允许API来始终保持同步。
  相关配置文件在config的Swagger2中，实例是UserController.java

3.引入了freemarker(jsp/html都可以用${}代替java传来的数据)
    freemarker前提：a.maven依赖
                    b.application.properties配置
                    c.直接引用对应名称即可

4.定时任务需要在启动类（SpringbootDemoApplication）里加@EnableScheduling注解才生效

5.缓存@Cacheable：
    a.需要pom依赖
    b.需要在WebConfiguration中配置注解@EnableCaching
    c.在对应方法上注解@Cacheable
    在application.properties中配置了打印sql语句后可以清楚的看到加了缓存的方法不再执行sql语句
    缓存会存入redis

6.elsearch还未完成