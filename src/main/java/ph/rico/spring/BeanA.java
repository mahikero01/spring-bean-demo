package ph.rico.spring;

public class BeanA {
	private int field1;
	private String field2;

	public BeanA(int parameter) {
		super();
		this.field1 = parameter;
		System.out.println("BeanA initialized");
	}

	public String getField2() {
		return field2;
	}

	public void setField2(String field2) {
		this.field2 = field2;
	}
	
	
}
