#项目如何搭建？
考虑使用不使用Maven？ 依赖，Jar包

#项目搭建准备工作
- 1.搭建一个maven web项目。
    - pom.xml:删除无用信息，留下gav和打包方式
    - web-xml：头文件改成最新的（4.0
    - 补齐项目结构（java、resources
- 2.配置Tomcat, 注意application context
- 3.测试项目是否能跑起来 
- 4.导依赖
- 5.创建项目包结构
    - main
        - java
            - com.xhq
                - dao
                - filter
                - pojo
                - service
                - servlet
                - util
            - resources
        - webapp
- 6.编写实体类
    - ORM映射：表-类映射
- 7.编写基础公共类
    - db.properties(resources目录下)
    - BaseDao：操作数据库的公共类
    - CharacterEncodingFilter
- 8.导入静态资源（webapp目录下）

# 登录功能实现
- 1.编写前端页面
- 2.设置欢迎页面，<welcome-file-list>
- 3.编写dao层，得到用户登录的接口
- 4.编写dao接口的实现类
- 5.业务层接口
- 6.业务层实现类
- 7.编写LoginServlet（接收参数，调用业务层，转发视图
- 8.注册LoginServlet

#注销及权限过滤
- 1.注销功能，思路：移除Session，返回登录页面
    - 编写LogoutServlet, 注册LogoutServlet
- 2.登录拦截（权限过滤
    - SysFilter"# smbms" 
