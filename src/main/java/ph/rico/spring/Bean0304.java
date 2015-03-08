package ph.rico.spring;

//creating a spring bean
public class Bean0304 {
	
	public Bean0304(String value) {
		System.out.println("Bean0304 created String Parameter");
		System.out.println(value);
	}
	
	public Bean0304(int value) {
		System.out.println("Bean0304 created Int Parameter");
		System.out.println(value);
	}
	
	public Bean0304(String value1, String value2) {
		System.out.println("Bean0304 created dual Parameter");
		System.out.println(value1);
		System.out.println(value2);
	}
	
}
