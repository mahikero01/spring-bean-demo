package ph.rico.spring.sf0312AutoWiring;

public class BeanB {

	private BeanD beanD;

	public BeanD getBeanD() {
		return beanD;
	}

	public void setBeanD(BeanD beanD) {
		System.out.println("Setter Called: public void setBeanD(BeanD beanD)");
		System.out.println("Injected Bean Name: " + beanD.getName());
		this.beanD = beanD;
	}

}