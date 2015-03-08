package ph.rico.spring;

public class Bean0305A {
	
	public Bean0305A (Bean0305B bean) {
		System.out.println("Bean0305A");
		bean.execute();
	}
}
