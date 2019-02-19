package day1._04._4collection_object;

import java.util.Properties;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class CollectionBeanClient {

	public static void main(String[] args) {
		AbstractApplicationContext factory = 
				new GenericXmlApplicationContext("day1_04/applicationContext4.xml");
		
		
		CollectionBean bean = (CollectionBean) factory.getBean("collectionBean");
		
		/*List<String> addressList = bean.getAddressList();
		for(String address : addressList) {
			System.out.println(address.toString());
		}*/
		
		/*Set<String> set = bean.getAddressSet();
		for(String address : set) {
			System.out.println(address.toString());
		}*/
		
//		Map<String, String> map = bean.getAddressMap();
//		for(String key : map.keySet()) {
//			System.out.println(key + ", " + map.get(key));
//		}
		
		Properties props = bean.getAddressProps();
		for(Object key : props.keySet()) {
			System.out.println(key + ", " + props.get(key));
		}
		
		factory.close();
	} //main
} //end class
