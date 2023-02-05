package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ComparatorDemo {

	public static void main(String[] args) {
		ArrayList<Employee> list=new ArrayList<>();
		list.add(new Employee(101, "Arpan", 50000));
		list.add(new Employee(102, "Susmita",40000));
		list.add(new Employee(103, "Koushik", 35000));
		System.out.println("Sort by id");
		Collections.sort(list,new IdComparator());
		Iterator itr=list.iterator();
		while(itr.hasNext())
		{
			Employee emp=(Employee)itr.next();
			System.out.println(emp.getEmpid()+" "+emp.getName()+" "+emp.getSalary());
			
		}
		System.out.println("================");
		
		System.out.println("sort by salary");
		Collections.sort(list,new SalaryComparator());
		
		Iterator itr1 =list.iterator();
		while(itr1.hasNext())
		{
			Employee emp=(Employee)itr1.next();
			System.out.println(emp.getEmpid()+" "+emp.getName()+" "+emp.getSalary());
		}
		
		System.out.println("================");
		System.out.println("sort by name");
		Collections.sort(list, new NameComparator());
		Iterator itr2=list.iterator();
		while(itr2.hasNext())
		{
			Employee emp=(Employee)itr2.next();
			System.out.println(emp.getEmpid()+" "+emp.getName()+" "+emp.getSalary());
		}
		
	}

}
