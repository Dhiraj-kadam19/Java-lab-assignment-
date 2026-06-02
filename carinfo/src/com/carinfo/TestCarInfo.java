package com.carinfo;

import java.util.Date;  // fixed import

public class TestCarInfo {

    public static void main(String[] args) {  // fixed method declaration
        // Create CarInfo object (fixed constructor call and capitalization)
        CarInfo c1 = new CarInfo(302, "BMW", "Dhiraj", "MH", new Date());
        CarInfo c2=new CarInfo(42312,"GGFF","JDJJF","FJJF",new Date());
        System.out.println(c2);
        // Print object (fixed System.out.println capitalization)
        System.out.println(c1);
        CarInfo c3 = new CarInfo();
       c3.setcarnum(2132); 
    }
}