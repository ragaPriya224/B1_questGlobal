package com.quest.global;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ){
//    	Vehicle c = new Car(); //tight coupling.. it must be avoided 
//    	c.drive();
        System.out.println( "Hello World!" );
        
        ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
//        Vehicle  obj = (Vehicle) context.getBean("car");//car available, car. bike na, bike 
//        obj.drive();
        
        Tyre t = (Tyre) context.getBean("tyre");
        System.out.println(t);
    }
}


//2 ways to get bean??
//		bean factory or app context

//types of configuration???
//xml based, @, java based