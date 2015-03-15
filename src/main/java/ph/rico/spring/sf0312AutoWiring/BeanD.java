package ph.rico.spring.sf0312AutoWiring;



public class BeanD  {

	private String name;

	public BeanD() {
		super();
		System.out.println("Constructor Called: public BeanD()");
	}

	public void setBeanName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

}