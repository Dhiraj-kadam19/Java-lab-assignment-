package Comparator;

import java.util.Comparator;


import model.person;

public class EmployeeNameComparator implements Comparator <person> {
	@Override
	public int compare(person o1, person o2) {
		System.out.println("in compare method "+o1.getPname()+"---------"+o2.getPname());
		return o1.getPname().compareTo(o2.getPname());
	}

}