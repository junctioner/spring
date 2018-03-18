# 如何看spring源码

## 一、先搞清楚几个问题

    1. spring 是做什么的？ 解决什么问题？
        1. 一句话描述spring
            一个java类管理容器（[示例](https://github.com/junctioner/spring/blob/master/src/test/java/com/jungle/spring/TestCar.java)）。
    2. spring 出现之前，有没有什么技术解决相同或者类似问题？为什么spring能一直“活”到现在？
    3. 反推：不用spring，我们能怎么做？

## 参考资料

   1. [Spring IOC设计原理解析](https://www.cnblogs.com/ITtangtang/p/3978349.html)
   2. [Spring 源码分析(一) —— 迈向Spring之路 ***](https://my.oschina.net/kaywu123/blog/610825)
   3. [Spring 源码分析(二) —— 核心容器 **](https://my.oschina.net/kaywu123/blog/614325)
   4. [Spring 源码分析(三) —— AOP（一）AOP原理 ***](https://my.oschina.net/kaywu123/blog/626135)
   5. [Spring 源码分析(三) —— AOP（二）Spring AOP 整体架构](https://my.oschina.net/kaywu123/blog/632486)
   6. [Spring 源码分析(三) —— AOP（三）实现思路](https://my.oschina.net/kaywu123/blog/632487)
   7. [Spring 源码分析(三) —— AOP（四）获取指定增强](https://my.oschina.net/kaywu123/blog/632488)
   8. [Spring 源码分析(三) —— AOP（五）创建代理](https://my.oschina.net/kaywu123/blog/638181)
   9. [Spring 源码分析(三) —— AOP（六）源码分析与总结 ***](https://my.oschina.net/kaywu123/blog/639281)
   10. [Spring 源码分析(四) ——MVC（一）Web 基础 ***](https://my.oschina.net/kaywu123/blog/644836)
   11. [Spring 源码分析(四) ——MVC（二）概述 **](https://my.oschina.net/kaywu123/blog/646278)
   12. [Spring 源码分析(四) ——MVC（三）源码入口](https://my.oschina.net/kaywu123/blog/648743)
   13. [Spring 源码分析(四) ——MVC（四）核心逻辑](https://my.oschina.net/kaywu123/blog/648744)
   14. [Spring 源码分析(四) ——MVC（五）初始化阶段](https://my.oschina.net/kaywu123/blog/651838)
   15. [Spring 源码分析(四) ——MVC（六）M 与 C 的实现](https://my.oschina.net/kaywu123/blog/651841)
   16. [Spring 源码分析(四) ——MVC（七）视图呈现](https://my.oschina.net/kaywu123/blog/651842)
   17. [Spring 源码分析(四) ——MVC（八）总结](https://my.oschina.net/kaywu123/blog/652471)