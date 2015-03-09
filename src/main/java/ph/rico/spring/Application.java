package ph.rico.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("app03-context.xml");
		
		/*
		//Bean0303 - Bean Intro
		Bean0303 bean = context.getBean("_bean1", Bean0303.class);
		Bean0303 bean2 = context.getBean("bean", Bean0303.class);
		Bean0303 bean3 = context.getBean("bean2", Bean0303.class);
		
		//this will print true since bean are singleton and reference to 1 bean
		System.out.println(bean == bean2);
		
		//this will print false since bean are singleton and reference to different bean
		System.out.println(bean == bean3);
		*/		
		
		
		
		/*
		//Spring0304 - Constructor Injection 1/2
				
		//This will create a bean with a constructor
		Bean0304 bean = context.getBean("bean", Bean0304.class);
		*/
		
		
		
		
		( (ClassPathXmlApplicationContext)context ).close();         
	}
}
