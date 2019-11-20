package com.sale.box;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContex.xml");

        TestBean testBean = (TestBean) context.getBean("testBean", "TestBean.class");

        System.out.println(testBean.getString());

    }
}
