package ph.rico.spring;

public class Bean0307A {
	private int age;
	private Bean0307B bean0307B;

	public Bean0307B getBean0307B() {
		return bean0307B;
	}

	public void setBean0307B(Bean0307B bean0307b) {
		bean0307B = bean0307b;
		System.out.println("Set bean0307B field in Bean0306A");
	}

	public void setAge(int age) {
		this.age = age;
		System.out.println("Set age field in Bean0307A");
	}
}
