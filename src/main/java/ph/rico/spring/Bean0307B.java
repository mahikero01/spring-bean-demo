package ph.rico.spring;

public class Bean0307B {
	private String name;

	public Bean0307B(String name) {
		this.name = name;
		System.out.println("Bean0306B object has been created");
	}
	
	public void execute() {
		System.out.println("In Bean0306B");
	}

}
