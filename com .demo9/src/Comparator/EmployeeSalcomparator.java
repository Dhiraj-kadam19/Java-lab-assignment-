package Comparator;

import java.util.Comparator;

import model.Contractemp;
import model.SalariedEmp;
import model.person;

public class EmployeeSalcomparator implements Comparator<person> {
	public int compare(person o1, person o2) {
		  
		double s1=0.0,s2=0.0;
		if(o1 instanceof SalariedEmp) { 
			   s1=((SalariedEmp)o1).getSal();
		}else if(o1 instanceof Contractemp) {
			s1=((Contractemp)o1).getCharges();
		}
		
		
		if(o2 instanceof SalariedEmp) {
			   s2=((SalariedEmp)o2).getSal();
		}else if(o2 instanceof Contractemp) {
			s2=((Contractemp)o2).getCharges();
		}
		   System.out.println("in salary comparator "+s1+"---------"+s2);
		if(s1<s2) {
			 return -1;
		}else if (s1==s2)
			return 0;
		else
			 return 1;
					
	}

}
