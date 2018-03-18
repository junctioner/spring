/**
 * Project Name:spring
 * File Name:Car.java
 * Package Name:com.jungle.spring
 * Date:2018年3月18日下午8:57:10
 * Copyright (c) 2018, jungle All Rights Reserved.
 */

package com.jungle.spring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Description: <br>
 * Date: 2018年3月18日 下午8:57:10 <br>
 * 
 * @author junctioner
 * @version
 * @see
 */
public class Car {

    private final static Logger log = LoggerFactory.getLogger(Car.class);

    private String name;

    public Car(String name) {
        super();
        this.name = name;
    }

    public void run() {
        log.debug("汽车{},跑起来了!", name);
    }
}

