package com.roopaLearning.SpringFirstDemo.bean;

import com.roopaLearning.SimpeSpringDemoApplicationContext.SpringInterfaceDemo;

public class SpringDemochild implements SpringInterfaceDemo {

	public void compile() {
		// TODO Auto-generated method stub
		System.out.println("In compliing SpringDemochild");
	}
	public SpringDemochild() {
		super();
		System.out.println("Child class object created");
	}
}
