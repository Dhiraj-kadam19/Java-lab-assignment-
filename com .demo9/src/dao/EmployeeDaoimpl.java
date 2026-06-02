package dao;

import java.util.ArrayList;
import java.util.List;

import model.Contractemp;
import model.Employee;
import model.SalariedEmp;

public class EmployeeDaoimpl implements EmployeeDao {

	static List<Employee> elist;
    static {
   	 elist=new ArrayList<>();
   	 elist.add(new SalariedEmp(12,"Rajesh","4444","Hr","mgr",45678));
   	 elist.add(new Contractemp(13,"Rajani","55555","admin","asst",45,6666));
   	 elist.add(new SalariedEmp(14,"Rajesh","4444","Hr","mgr",45678));
   	 elist.add(new Contractemp(15,"Meenal","6666","admin","asst",45,6766));
    }
    

	 @Override
	 //add a object in the list at the end
	 public boolean save(Employee e) {
		return elist.add(e);
		
}
	 
}
