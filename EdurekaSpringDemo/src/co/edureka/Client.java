package co.edureka;

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
	}

}
