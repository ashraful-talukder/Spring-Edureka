package co.edureka;

public class Client {

	public static void main(String[] args) {
		
		//object construction
		
		Employee eRef = new Employee();
		eRef.setEid(101);
		eRef.setEname("Md. Ashraful Islam Talukder");
		eRef.setEaddress("Baroi para, Kaliakair, Gazipur");
		
		System.out.println("Employee details: " + eRef);

	}

}
