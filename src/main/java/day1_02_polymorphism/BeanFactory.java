package day1_02_polymorphism;

public class BeanFactory {

	public Object getBean(String beanName) {
		if(beanName.equals("samsung")) {
			return new SamsungTV2();
		} else if(beanName.equals("lg")) {
			return new LgTV2();
		}
		return null;
	} //getBean
} //end class
