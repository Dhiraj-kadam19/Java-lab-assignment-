package dao;


import java.awt.List;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

import Model.Vechicle;

public class VehicleDaoImpl implements VehicleDao {

        static Set<Vechicle> vset;
        static {
        	vset=new HashSet<>();
        	vset.add(new Vechicle(12,"Activa",80000,"l1",LocalDate.of(2023,11,23)));
        	vset.add(new Vechicle(13,"Santro",1000000,"sports",LocalDate.of(2023,11,23)));
        	vset.add(new Vechicle(14,"I10",1500000,"Asta",LocalDate.of(2023,11,23)));
        }

		private Vechicle v;
		private Vechicle V;
		private int id;
	public Set getall() {
		// TODO Auto-generated method stub
		return vset;
	}

	public boolean save(Vechicle vechicle) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removebyid(int id) {
	
		return vset.remove(new Vechicle(id));
	}

	@Override
	public boolean modifybyprice(double price) {
		List lst= (List) vset.stream().filter(v->v.getPrice()>price)
				.collect(Collectors.toList());
		return false;
				
	}

	@Override
	public Set<Vechicle> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Vechicle getbyid(int id) {
		for(Vechicle v:vset) {
			if(v.getid()==id) {
				return V;
			}
		
		}
		return V;
	}

	@Override
	public List getprice(double price) {
		// TODO Auto-generated method stub
		return null;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List sortByprice() {
		
		Comparator<Vechicle> cv=(o1,o2)->{
			System.out.println("in price comparator "+o1.getPrice()+"-------"+o2.getPrice());
			return (int)(o1.getPrice()-o2.getPrice());
		};
		return null;
		
	}

	@Override
	public List sortname() {
		
			Set<Vechicle> tset=new TreeSet<>();
			for(Vechicle v:vset) {
				tset.add(v);
			}
			return (List) tset;
	}

//	Optional <Vechicle> op=vset.stream().filter(v->v.getVid()==id) .findFirst()//terminating function
//	    return op.orElse(null);
//
//


}
		


/*
	

@Override
public boolean updatById(int id, double newPrice) {
	// TODO Auto-generated method stub
	Vehicle v = findById(id);
	if(v != null) {
		v.setPrice(newPrice);
		return true;
	}
	return false;
}

@Override
public Set<Vehicle> sortById() {
	Set<Vehicle> tset=new TreeSet<>();
	for(Vehicle v:vset) {
		tset.add(v);
	}
	return tset;
	
}
@Override
public List<Vehicle> sortByPrice() {
	Comparator<Vehicle> cv=(o1,o2)->{
		System.out.println("in price comparator "+o1.getPrice()+"-------"+o2.getPrice());
		return (int)(o1.getPrice()-o2.getPrice());
	};
	List<Vehicle> lst=new ArrayList<>();
	for(Vehicle v:vset) {
		lst.add(v);
	}
	lst.sort(cv);
	return lst;
}
@Override
public List<Vehicle> sortByName() {
	Comparator<Vehicle> cv=(o1,o2)->{
		System.out.println("in name comparator "+o1.getVname()+"-------"+o2.getVname());
		return o1.getVname().compareTo(o2.getVname());
	};
	List<Vehicle> lst=new ArrayList<>();
	for(Vehicle v:vset) {
		lst.add(v);
	}
	lst.sort(cv);
	return lst;
} */
