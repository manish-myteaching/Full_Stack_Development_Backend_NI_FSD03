package com.professionalit.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class SpringBeanDemo implements InitializingBean, DisposableBean {

	public SpringBeanDemo() {
		System.out.println("Spring Bean Object Created..!");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("init ");
	}

	public void show() {
		System.out.println("Show-Business Logic");
	}

	public void display() {
		System.out.println("Display-Business Logic");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("destory ");
	}

}
