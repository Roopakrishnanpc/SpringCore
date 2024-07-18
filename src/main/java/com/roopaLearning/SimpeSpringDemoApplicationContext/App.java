package com.roopaLearning.SimpeSpringDemoApplicationContext;

/**
 * Hello world!
 *
 */
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.roopaLearning.SpringFirstDemo.bean.SprigDemo;

/**
 * Hello world!
 *
 */
//Ctrl + Left Click
public class App 
{
    public static void main( String[] args )
    {
    		//beanFactoryEg();
    		//applicationContextEg();
    		applicationContextEgPrototype();
    }
    private static void beanFactoryEg()
    {
    	//For this fileXML -> You can create the file anywhere in the main project itself but for Classpath you have to create in dedicated class path
        
    	
    	//BeanFactory factory=new FileSystemXmlApplicationContext("spring_demo.xml");
    	//The reason I created this is now because I have included my spring_demo.xml in the resources so to know 
    	//the path mentioned this. If file is outside or in the main project directory above line will work
    	BeanFactory factory=new FileSystemXmlApplicationContext("classpath:spring_demo.xml");
        //BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("beans.xml"));
        //BeanFactory bean=new ClassPathXmlApplicationContext(("spring.xml"));
    	//Even without running this file the object will be created for the classes mentioned in the xml file
    	//So basicaaly immediately you call BeanFactory or application context the object will be created
    	//Because inside JVM there is a special container which will have spring Beans
    	//Beans - any class with getters, seeters variables are bean
        SprigDemo obj=(SprigDemo) factory.getBean("sprngDemo");
        obj.code();
        //obj.age =16;
       // System.out.println(obj.age);
        //Even when you try to create a new object it will create same object which mean it won't create new object it gives the old obj data itself. which is only once it is created
        //Which is called singleton beans -> singleton design pattern -> by default spring will have this
        //        <!-- By default scope is singleton if we need multiple objects then we need to include prototype -->
//        SprigDemo obj1=(SprigDemo) factory.getBean("sprngDemo");
//        obj1.code();
//        System.out.println(obj1.age);
    }
    private static void applicationContextEg()
    {
    	//ApplicationContext context =new ClassPathXmlApplicationContext(("spring.xml"));
         ApplicationContext context = new FileSystemXmlApplicationContext("classpath:spring_demo.xml");
         //SprigDemo obj=context.getBean(SprigDemo.class);
         SprigDemo obj=(SprigDemo) context.getBean("sprngDemo");
         obj.code();
         obj.setAge(16);
         System.out.println(obj.getAge());
    }
    private static void applicationContextEgPrototype()
    {
    	//Protype in xml will help ypu create multiple objects
    	//ApplicationContext context =new ClassPathXmlApplicationContext(("spring.xml"));
    	//In singleton even if you don't ask for an object the container will create object for you only when you run the below line. 
    	//In prototype only when you ask new object will be create that is .getBean only when it is called.
         ApplicationContext context = new FileSystemXmlApplicationContext("classpath:spring_demo.xml");
         //SprigDemo obj=context.getBean(SprigDemo.class);
         SprigDemo obj=(SprigDemo) context.getBean("sprngDemo");
         obj.code();
         // obj1.age =16;
         obj.setAge(16); 
         System.out.println(obj.getAge());
         SprigDemo obj1=(SprigDemo) context.getBean("sprngDemo");
         //op:10 using xml file value=10
         //if no value set then 0
         obj1.code(); 
         System.out.println(obj1.getAge());
    }
}

