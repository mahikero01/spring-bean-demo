package ph.rico.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("bean0303-context.xml");
		
		Bean0303 bean = context.getBean("bean", Bean0303.class);
	}
}
