package ph.rico.spring;

import java.util.Calendar;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("app03-context.xml");
		
		/*
		//Bean0303 - Bean Intro
		 
		//bean creation 
		Bean0303 bean = context.getBean("_bean1", Bean0303.class);
		Bean0303 bean2 = context.getBean("bean", Bean0303.class);
		Bean0303 bean3 = context.getBean("bean2", Bean0303.class);
		
		//this will print true since bean are singleton and reference to 1 bean
		System.out.println(bean == bean2);
		
		//this will print false since bean are singleton and reference to different bean
		System.out.println(bean == bean3);
		*/		
		
		
		
		/*
		//Bean0304 - Constructor Injection 1/2
				
		//This will create a bean with a constructor
		Bean0304 bean = context.getBean("bean", Bean0304.class);
		*/
		
		
		
		/*
		//Bean0305 - Constructor Injection 2/2
		 
		//This will create a bean with a constructor
		Bean0305A bean = context.getBean("bean0305A", Bean0305A.class);
		 */
		
		
		
		/*
		//Bean0306 - Setter Injection
		 
		//This will create a bean with properties
		Bean0306A bean = context.getBean("bean0306A", Bean0306A.class);
		bean.getBean0306B().execute(); 
		*/
		
		
		
		/*
		//Bean0307 - C and P Namespace
		
		//This will create a bean with properties
		Bean0307A bean = context.getBean("bean0307A", Bean0307A.class);
		bean.getBean0307B().execute(); 
		*/
		
		
		
		/*
		 * Bean0308 - Bean Instantiation with Factories
		 
		Bean0308A bean = context.getBean("sprBean0308A", Bean0308A.class);
		System.out.println(bean.getYear());
		
		Bean0308B bean2 = context.getBean("sprBean0308B", Bean0308B.class);
		*/
		
		
		
		/*
		 * Bean0309 - Bean Scope
		 */ 
		 Bean0309ProtoType bean = context.getBean("sprBeanProto", Bean0309ProtoType.class);
		 Bean0309ProtoType bean2 = context.getBean("sprBeanProto", Bean0309ProtoType.class);
		 
		 Bean0309Singleton bean3 = context.getBean("sprBnSingleton", Bean0309Singleton.class);
		 Bean0309Singleton bean4 = context.getBean("sprBnSingleton", Bean0309Singleton.class);
		 
		 //this should be false due to both bean has different instance
		 System.out.println(bean == bean2);
		 
		 //this should be true due to both bean has only one instance
		 System.out.println(bean3 == bean4);
		 
		( (ClassPathXmlApplicationContext)context ).close();         
	}
}
