package ph.rico.spring;

public class Bean0308CCustomFactory {
	public Bean0308CCustomFactory() {
		super();
		System.out.println("object Bean0308c Created");
	}
	
	
	public Bean0308B getInstanceOfBean0308B() {
		System.out.println("Return instance of Bean0308B");
		return new Bean0308B();
	}

}
