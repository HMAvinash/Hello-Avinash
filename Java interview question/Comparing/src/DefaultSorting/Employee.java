package DefaultSorting;

public class Employee 
{
	private int empid;
	private String empname;
	private long Phone;
	
	public Employee(int empid,String empname,long Phone)
	{
		this.empid=empid;
		this.empname=empname;
		this.Phone=Phone;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public long getPhone() {
		return Phone;
	}

	public void setPhone(long phone) {
		Phone = phone;
	}
	

}
