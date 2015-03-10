package ph.rico.spring;

public class Bean0310Singleton {
	private Bean0310Prototype prototypeBean;
	
	public Bean0310Prototype createProto() {
		return prototypeBean;
	}

	public void setPrototypeBean(Bean0310Prototype prototypeBean) {
		this.prototypeBean = prototypeBean;
	}

	
}
