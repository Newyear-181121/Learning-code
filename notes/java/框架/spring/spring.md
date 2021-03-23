Spring框架的组成结构图如下所示：

![spring-overview](images/springframework.png)



# spring 是什么

​      Spring是一个基于IOC容器和AOP结构的J2EE系统的框架

其中最重要的是Spring框架的控制反转（IoC）容器。

 

目的：<font color="#6Ee152">简化开发</font>

##  IOC

IOC <font color="#4EC132">反转控制</font> 是Spring的基础，Inversion Of Control
简单说就是创建对象由以前的程序员自己new 构造方法来调用，变成了交由Spring创建对象
DI 依赖注入 Dependency Inject. 简单地说就是拿到的对象的属性，已经被注入好相关值了，直接使用即可。

IOC 控制反转：

	- 把原来由应用直接创建被依赖类的对象交有 spring容器创建。

##  AOP

AOP 即 Aspect Oriented Program<font color="#4EC132"> 面向切面编程</font>
首先，在面向切面编程的思想里面，把功能分为**核心业务功能**，和**周边功能**。
所谓的核心业务，比如登陆，增加数据，删除数据都叫核心业务
所谓的周边功能，比如性能统计，日志，事务管理等等

周边功能在Spring的面向切面编程AOP思想里，即被定义为**切面**

在面向切面编程AOP的思想里面，核心业务功能和切面功能分别**独立进行开发**
然后把切面功能和核心业务功能 **"编织"** 在一起，这就叫AOP

## beans

在Spring中，构成应用程序主干并<font color="#4EC132">由Spring IoC容器管理的对象</font>称为bean。
Bean是由Spring IoC容器实例化，组装和管理的对象。否则，bean仅仅是应用程序中许多对象之一。
Bean及其之间的依赖关系反映在容器使用的配置元数据中。



