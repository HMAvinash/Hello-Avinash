package encapsulation;

public class Customer {
	private String Firstname;
	private String lastname;
	private String Creditcard;

	public String getFirstname() {
		return Firstname;
	}

	public void setFirstname(String firstname) {
		Firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getCreditcard() {
		return Creditcard;
	}

	public void setCreditcard(String creditcard) {
		Creditcard = creditcard;
	}

}
