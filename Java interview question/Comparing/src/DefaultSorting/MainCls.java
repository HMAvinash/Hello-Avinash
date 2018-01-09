package DefaultSorting;

import java.util.List;

public class MainCls 
{
	public static void main(String[] args) {
		List<Employee> l1= Collect.getEmployee();
		Sorting s1=new Sorting();
		s1.compareTo((Employee) l1);
	}

}
