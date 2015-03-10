package ph.rico.spring;

public abstract class Bean0310SingletonMethodInject {
	private Bean0310Prototype prototypeBean;
	
	public abstract Bean0310Prototype createProto();

	public void setPrototypeBean(Bean0310Prototype prototypeBean) {
		this.prototypeBean = prototypeBean;
	}

	
}
