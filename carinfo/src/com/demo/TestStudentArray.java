package com.demo;
import java.util.Scanner;

import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;
import java.util.stream.Stream;
import java.text.SimpleDateFormat;
public class TestStudentArray {


public static void AccepctData(Student[] sarr) {
	Scanner sc=new Scanner(System.in);
	
	System.out.println("accepct data ");
	
	for(int i=0;i<sarr.length;i++) {
		 System.out.println("enter id");
		 int sid=sc.nextInt();
			sc.nextLine();
			//m1 marak hereconver float 
			System.out.println("enter marks m1:");
			float m1=sc.nextFloat();
			sc.nextLine();
			//m2 marak hereconver float 
		System.out.println("enter marks m2");
		float m2=sc.nextFloat();
		System.out.println("enter marks m3");
		float m3=sc.nextFloat();
		
		System.out.println("enter your the date frmat (dd/mm/yyyy)");
		String dte=sc.next();
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
		Date jdt=null;
		try {
			jdt=sdf.parse(dte);
		} catch (ParseException e) {
			
			e.printStackTrace();
		}
		
Student	arr=(Student) new Student ();
	}
	
	
}

public static void DispayData(Student[] sarr) {
	System.out.println("dispaly student data:");
	
	for( Student i : sarr) {
		System.out.println(i);
	}

Stream.of(sarr).forEach(i1->System.out.println(i1));

   }
}
