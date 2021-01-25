package co.edureka;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

@SuppressWarnings("deprecation")
public class Client {

	public static void main(String[] args) {
		
		//object construction | done by developer
		
		Employee eRef = new Employee();
		eRef.setEid(101);
		eRef.setEname("Md. Ashraful Islam Talukder");
		eRef.setEaddress("Baroi para, Kaliakair, Gazipur");
		
		System.out.println("Employee details: " + eRef);
		
		//Spring way | IoC
		ClassPathResource resource = new ClassPathResource("employeebean.xml");
		BeanFactory factory = new XmlBeanFactory((org.springframework.core.io.Resource) resource); //Spring container which shall parse XML file and construct the objects
		
		Employee e1 = (Employee)factory.getBean("emp1");
		Employee e2 = factory.getBean("emp2",Employee.class);
		
		System.out.println("Employee 1 details: " + e1);
		System.out.println("Employee 2 details: " + e2);
	}

}
