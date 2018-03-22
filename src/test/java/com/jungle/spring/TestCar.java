/**
 * Project Name:spring
 * File Name:NoContainer.java
 * Package Name:com.jungle.spring
 * Date:2018年3月18日下午8:34:52
 * Copyright (c) 2018, jungle All Rights Reserved.
 */
package com.jungle.spring;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Description: <br>
 * Date: 2018年3月18日 下午8:34:52 <br>
 * 
 * @author junctioner
 * @version
 * @see
 */
public class TestCar {

    private final static Logger log = LoggerFactory.getLogger(TestCar.class);

    @Test
    public void noContainer() {

        Car car;
        car = new Car("擎天柱");// 耦合性高，如果想用其它实现类，需要重新new实例对象；
        log.debug("手工创建一个实例");

        car.run();
        // 类对象的创建、维护，消毁，都需要程序员管理；
    }

    @Test
    public void withContainer() {
        // 创建一个容器
        ApplicationContext appContext;
        appContext = new FileSystemXmlApplicationContext("classpath:application.xml");
        // appContext = new ClassPathXmlApplicationContext("application.xml");
        try {
            Car car;
            car = appContext.getBean(Car.class);// 通过容器获取类实例
            log.debug("通过spring容器，创建一个实例");
            car.run();

            // 类对象的创建、维护，消毁，由容器管理；
        } finally {
            ((FileSystemXmlApplicationContext) appContext).close();
            log.debug("释放资源");
        }
    }

    /**
     * 不用AOP所做的处理，完全是侵入业务代码中<br>
     * Description: <br>
     *
     * @author thinkpad
     */
    public void testAop() {

        log.debug("事前处理");

        log.debug("A业务逻辑");

        log.debug("事后处理");
    }

    public void bizFn() {
        log.debug("A业务逻辑");
    }
}
