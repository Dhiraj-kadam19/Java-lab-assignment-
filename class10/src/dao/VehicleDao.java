package dao;

import java.awt.List;
import java.util.Set;

import Model.Vechicle;

public interface VehicleDao {

	Set<Vechicle> sortbyid = null;

	Set<Vechicle> getall();

	boolean save(Vechicle vechicle);

	boolean removebyid(int id);

	boolean modifybyprice(double price);

	Set<Vechicle> findAll();

	Vechicle getbyid(int id);

	List getprice(double price);

	List sortByprice();

	List sortname();

}
/*Vehicle findById(int id);

boolean removeById(int id);

boolean updatById(int id, double newPrice);

List<Vehicle> findByPrice(double pr);

Set<Vehicle> sortById();

List<Vehicle> sortByPrice();

List<Vehicle> sortByName();*/
