package DefaultSorting;

public class Sorting implements Comparable<Employee> {

	private int empId;
    private String name;
    private int age;
	public int compareTo(Employee e) {
		// TODO Auto-generated method stub
		return (this.empId-e.getEmpid());
	}

}
