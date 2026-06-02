package Test;

import java.awt.List;
import java.util.Scanner;
import java.util.Set;

import Model.Vechicle;
import Service.VechicleService;
import Service.VechicleServiceimpl;

public class TestVechicleDemo {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		VechicleService vservice=new VechicleServiceimpl();
		int choice=0;
		do {
			System.out.println("1.add new vehicle\n3.delete vehicle\n4.modify vehicle price\n5.displayall");
			System.out.println("6.display by id\n7.display by price \n8. sort by price\n 9.sort by name\n10. sort by id");
			System.out.println("11. sort by date\n 12. exit\n Enter your choice :");
			choice=sc.nextInt();
			switch(choice) {
			case 1->{
				
				
				boolean status=vservice.addNewVehicle();
			    if(status) {
			    	System.out.println("vehicle added successfully");
			    }else {
			    	System.out.println("duplicate vehicle number");
			    }	
			
				
			}
			case 2->{}
			case 3->{ 
				System.out.println("enter id");
				int id=sc.nextInt();
				boolean status=vservice.deleateBYid(id);
			    if(status) {
			    	System.out.println("vehicle added successfully");
			    }else {
			    	System.out.println("duplicate vehicle number");
			    }	
			
				
			} 
			
			case 4->{
				
				System.out.println("modify price");
				System.out.println("enter the price");
				double prise=sc.nextDouble();
			    boolean status=vservice.modifybyprise();
				if(status) {
					System.out.println(" update sussefully");
				}
				else {
					System.out.println("not added in proper way");
				}
			}
			case 5->{
			
				Set<Vechicle> vls=vservice.getall();
				System.out.println(">>>>>>>>>>>all data list display>>>>>>>"+vls);
				vls.forEach(System.out::println);
			}
			case 6->{
				System.out.println("enter the id");
				int id=sc.nextInt();
				Vechicle v=vservice.getbyid(id);
				if(v!=null) {
					System.out.println(v);
				}else {
					System.out.println("found succefully");
				}
				
				
			}
			case 7->{
				System.out.println("Enter price to search");
				double pr = sc.nextDouble();
				List lst = vservice.getByPrice(pr);
				if(lst != null) {
					((Iterable<Vechicle>) lst).forEach(System.out::println);
				}
				else {
					System.out.println("Not found");
				}
				
				
				
				
			}
			case 8->{
				List vset=vservice.sortByPrice();
				((Iterable<Vechicle>) vset).forEach(System.out::println);
				
				
				
			}
			case 9->{
				List vset=vservice.sortByPrice();
				((Iterable<Vechicle>) vset).forEach(System.out::println);
			
			}
			case 10->{
				List vset=vservice.sortByName();
				((Iterable<Vechicle>) vset).forEach(System.out::println);
			}
			case 11->{
				
				
				Set<Vechicle> vset=vservice.sortById();
				vset.forEach(System.out::println);
			}
			case 12->{
				sc.close();
				System.out.println("<<<<<<<<<<<<<Thanks for visiting>>>>>>>>>>>>>");
				
			}
			
			default->{
				
				System.out.println("----Wrong choice pls enter valid data---------");
			}
			
			
		}
		}while(choice!=12);
		
		
	}
}
	
		
	

	