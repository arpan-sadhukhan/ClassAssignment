package Collection;

import java.util.Comparator;

public class NameComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		if(o1.getName()==o2.getName())
			return 0;
		else if(o1.getName().charAt(0)>o2.getName().charAt(0))
			return 1;
		else
			return -1;
		
	}
	
}
