# 存储年月到数据库中

### 业务背景

* 业务上有一个字段是 `yyyy-MM` 的格式，如何将其存储到数据库中
* 使用 PostgreSQL
* ORM 框架使用 Mybatis-Plus

### 解决方法

* 将年和月拆开来用整数存储，前端传递的参数可以是字符串、 `YearMonth` 或者年和月两个整数，但是返回数据给前端时，此时需要做拼接（或者由前端拼接）
* 数据库用 `date` 存储，实体字段类型用 `LocalDate` ，字段上配置 `@JsonFormat(pattern="yyyy-MM")` ，但此时可能需要前端传递 `yyyy-MM-dd` 格式的数据过来
* 数据库用 `date` 存储，实体字段类型用 `YearMonth` ，需要配置 `TypeHandler` 。

这里实现的方式是上面的第三种方法