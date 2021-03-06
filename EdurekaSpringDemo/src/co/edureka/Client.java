package co.edureka;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		Employee e = new Employee();
		e.setEid(101);
		e.setEname("Ashraful");
		e.setEsalary(10000);

		System.out.println(e);
		
		/*
		 * Inversion of Control (IoC)
		 * 1. Add jar files for Spring core
		 * 2. Configure java object in an XML file
		 * 3. Use Spring IoC container, e.g: BeanFactory or ApplicationContext to get the objects constructed by them
		 */
		
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("employeebean.xml");
		Employee e1 = (Employee)context.getBean("emp1");
		Employee e2 = context.getBean("emp2",Employee.class);
		
		System.out.println("--------------------Spring IoC in Action---------------");
		
		System.out.println(e1);
		System.out.println(e2);
	}

}
