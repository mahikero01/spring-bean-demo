package ph.rico.spring;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Bean0310SingletonContextAware implements ApplicationContextAware{
	
	private Bean0310Prototype prototypeBean;
	private ApplicationContext context;

	public Bean0310Prototype createProto() {
		return context.getBean("sprBnProto", Bean0310Prototype.class);
	}

	public void setPrototypeBean(Bean0310Prototype prototypeBean) {
		this.prototypeBean = prototypeBean;
	}

	
	public void setApplicationContext(ApplicationContext applicationContext)
			throws BeansException {
		this.context = applicationContext;
	}

}
