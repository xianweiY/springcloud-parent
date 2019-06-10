/**
 * Copyright (C), 2015-2019, 深圳市启明星电子商务有限公司
 *
 * @Title: Person
 * @Package com.atguigu.demo.bean
 * @author: YangXianWei
 * @date: 2019/6/10 16:21
 * @since JDK 1.8
 */
package com.atguigu.demo.bean;

import java.io.Serializable;

/**
 *
 * @ClassName : Person
 * @AUTHOR :  YangXianWei
 * @DATE :    2019/6/10 16:21  
 * @DESCRIPTION : TODO(用一句话描述该类做什么)   
 * @since JDK 1.8
 */
public class Person implements Serializable {
    private String name;
    private String age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
