package excption;

import Exeptionhandle.AgeException;
import Exeptionhandle.InvalidSalaryException;
import servise.EmployeeServiceImpl;
import servise.EmployeeServise;

public class TestExeption4 {  

	public static void main(String[] args) {
		EmployeeServise eservise=new EmployeeServiceImpl();
 
		boolean status;
		
		try { 
		       status = eservise.addNewEmployee();
		       if(status) {
		        	System.out.println("employee added");
		        }
	
		
		} catch (InvalidSalaryException|AgeException e) {
		System.out.println("employee not generated"+e.getMessage());
	}
		
		
		
		
		/*catch (AgeException e) {
		System.out.println(e.getMessage());
		e.printStackTrace();
	}*/

}


		
	}


