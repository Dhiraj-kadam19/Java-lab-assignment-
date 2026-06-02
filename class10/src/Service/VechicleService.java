package Service;

import java.awt.List;
import java.util.Set;

import Model.Vechicle;

public interface VechicleService {

	boolean addNewVehicle();

	boolean deleateBYid();

	boolean deleateBYid(int id);

	boolean modifybyprise();

	boolean modifybyprise(double price);

	Set<Vechicle> getall();

	Vechicle getbyid(int id);

	List getByPrice(double pr);

	

	List sortByPrice();



	List sortByName();

	Set<Vechicle> sortById();

}
