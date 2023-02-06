package org.springDemo.AnnoDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ){
    	
        System.out.println( "Hello World!" );
        //tight coupling , to be avoided
//        Samsung s = new Samsung();
//        s.config();
        
        ApplicationContext factory = new AnnotationConfigApplicationContext(AppConfig.class);
        Samsung s23= factory.getBean(Samsung.class);
        s23.config();
    }
}
//diff ways to get bean

