package Service;

import java.awt.List;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.Set;

import Model.Vechicle;
import dao.VehicleDao;
import dao.VehicleDaoImpl;

public class VechicleServiceimpl implements VechicleService  {
   
	private VehicleDao vdao;
	 public VechicleServiceimpl() {
			super();
			this.vdao = (VehicleDao) new VehicleDaoImpl();
		   }
	 @Override
	 public boolean addNewVehicle() {
		 Scanner sc=new Scanner(System.in);
			System.out.println("enetr vehicle id");
			int vid = sc.nextInt();
			System.out.println("Enter vehicle name");
			String vname = sc.next();
			System.out.println("Enter price");
			double price = sc.nextDouble();
			System.out.println("Enter model");
			String model = sc.next();
			System.out.println("Enter date (dd/mm/yyyy)");
			String date = sc.next();
			LocalDate ldt = LocalDate.parse(date, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
			
			return vdao.save(new Vechicle(vid, vname, price, model,ldt));
			
		
	 }
	 @Override
	 public boolean deleateBYid(int id) {
		
		return vdao.removebyid(id);
	 }
	 @Override
	 public boolean deleateBYid() {
		// TODO Auto-generated method stub
		return false;
	 }
	 @Override
	 public boolean modifybyprise(double price) {
		
		return vdao.modifybyprice(price);
	 }
	 @Override
	 public boolean modifybyprise() {
		// TODO Auto-generated method stub
		return false;
	 }
	 @Override
	 public Set<Vechicle> getall() {
		
		return vdao.getall();
	 }
	 @Override
	 public Vechicle getbyid(int id) {
		
		return vdao.getbyid(id);
	 }
	 @Override
	 public List getByPrice(double pr) {
		
		return vdao.getprice(pr);
	 }
	 @Override
	 public List sortByPrice() {
		
		return vdao.sortByprice();
	 }
	 @Override
	 public List sortByName() {
		// TODO Auto-generated method stub
		return vdao.sortname();
	 }
	 @Override
	 public Set<Vechicle> sortById() {
		// TODO Auto-generated method stub
		return vdao.sortbyid;
	 }
	
	
	
	
}
