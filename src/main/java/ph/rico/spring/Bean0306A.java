package ph.rico.spring;

public class Bean0306A {
	private int age;
	private Bean0306B bean0306B;

	public Bean0306B getBean0306B() {
		return bean0306B;
	}

	public void setBean0306B(Bean0306B bean0306b) {
		bean0306B = bean0306b;
		System.out.println("Set bean0306B field in Bean0306A");
	}

	public void setAge(int age) {
		this.age = age;
		System.out.println("Set age field in Bean0306A");
	}
}
