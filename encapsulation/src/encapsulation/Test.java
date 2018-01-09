package encapsulation;

public class Test {

	public static void main(String[] args) {
		Customer c = new Customer();
		c.setFirstname("Avinash");
		c.setLastname("Hiriyur");
		c.setCreditcard("549777802569");
		System.out.println("First name is " + c.getFirstname());
		System.out.println("Last name is " + c.getLastname());
		System.out.println("Credit card no is" + c.getCreditcard());

	}

}
