package com.roopaLearning.SpringFirstDemo.bean;

import com.roopaLearning.SimpeSpringDemoApplicationContext.SpringInterfaceDemo;

public class SprigDemo {
	//public int age;
	private int age;
	//private static int age=10;
	//private int age=10;
	private SpringInterfaceDemo springInterfaceDemo;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		System.out.println("age assigned"+age);
		this.age = age;
	}
	//INSTEAD OF US CREATING OBJECT SPRING DOES THIS FOR US
	//SpringDemochild demo=new SpringDemochild();
	//This will obviously work as I have given the data of all these data in the xml so new objects will created and implemented but I want my interface to decide to which to run so that time steps change
//	SpringDemochild springDemochild;
//	SpringDemochild2 springDemochild2;
	public void code()
	{
		//springDemochild2.compile();
		//springDemochild.compile();
		springInterfaceDemo.compile();
		System.out.println("In Demo1Sample");
	}
//    public void setSpringDemochild(SpringDemochild demo) {
//        this.springDemochild = demo;
//    }
//    public void setSpringDemochild2(SpringDemochild2 springDemochild2) {
//        this.springDemochild2 = springDemochild2;
//    }
	public SprigDemo() {
		//super();
		System.out.println("Parent class object created");
		
	}	
    public SpringInterfaceDemo getSpringInterfaceDemo() {
		return springInterfaceDemo;
	}
	public void setSpringInterfaceDemo(SpringInterfaceDemo springInterfaceDemo) {
		this.springInterfaceDemo = springInterfaceDemo;
	}
	public SprigDemo(int age) {
		//super();
		System.out.println("Parent class constructor with fields object created");
		//this.age=age;
		this.age=14;
	}
}
