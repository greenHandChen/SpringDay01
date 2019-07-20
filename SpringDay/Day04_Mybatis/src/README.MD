引入依赖

创建表中对应的4个实体类

创建OrdersExt拓展类

拷贝mybatis主配置文件、数据库配置文件

写mapper文件：针对OrdersExt

写Mapper接口

- 普通写法：OrderExt
- 一对一写法：OrdersExt

一对多映射


---

mybatis 映射当中得column属性有点多变。
它是根据sql查询后得列名来匹配得，也就是说如果用别名来代替得话，column属性值就需要同步得改变。
这样得好处有：在列名重名得情况下，可以使用别名来修改。
















