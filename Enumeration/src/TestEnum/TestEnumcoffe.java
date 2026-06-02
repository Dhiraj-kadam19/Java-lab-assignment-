package TestEnum;

import java.util.Scanner;
import Enums.coffe;
public class TestEnumcoffe {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int choice=0;
		System.out.println("0. big\n1. small\n2.medium");
		System.out.println("enter choice");
		choice=sc.nextInt();
		String Coffe;
		System.out.println(Coffe.value()[choice]);
		Coffe ch=Coffe.value()[choice];
		switch(ch) {
		case big->{
			System.out.println("you selected big"+ch.getSize()+"ml "+ch.getCost()+"Rs." );
		}
		case small->{
			System.out.println("you selected small"+ch.getSize()+"ml "+ch.getCost()+"Rs.");
		}
		case medium->{
			System.out.println("you selected medium"+ch.getSize()+"ml "+ch.getCost()+"Rs.");
		}
		default->{}
		}
		

	}

}