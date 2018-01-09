package DefaultSorting;

import java.util.ArrayList;
import java.util.List;

public class Collect 
{
	public static List<Employee> getEmployee()
	{
		List<Employee> l1=new ArrayList<Employee>();
		l1.add(new Employee(1,"Avinash",999999999));

		l1.add(new Employee(4,"Vijeth",989999999));

		l1.add(new Employee(5,"daya",979999999));

		l1.add(new Employee(3,"chandan",969999999));

		l1.add(new Employee(2,"Sunil",959999999));

		l1.add(new Employee(6,"Akhilesh",949999999));
		
		return l1;
	}

}
