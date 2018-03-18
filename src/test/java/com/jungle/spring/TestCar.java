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
        car = new Car("擎天柱");
        log.debug("手工创建一个实例");

        car.run();
    }

    @Test
    public void withContainer() {
        FileSystemXmlApplicationContext appContext = new FileSystemXmlApplicationContext("classpath:application.xml");
        try {
            Car car;
            car = appContext.getBean(Car.class);
            log.debug("通过spring容器，创建一个实例");
            car.run();
        } finally {
            appContext.close();
            log.debug("释放资源");
        }
    }
}
