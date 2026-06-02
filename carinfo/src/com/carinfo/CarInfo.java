package com.carinfo;

import java.util.Date;
import java.text.SimpleDateFormat;

public class CarInfo {

    private int carnum;
    private String cname;
    private String oname;
    private String state;
    private Date manufacdate; // should be Date type
public void setcarnum(int c1) {
	carnum =c1;
	
}
    // Default constructor
    public CarInfo() {
        System.out.println("Default constructor is called");
        this.carnum =0;
        this.cname = "";
        this.oname = "";
        this.state = "";
        this.manufacdate = null;
    }

    // Parameterized constructor
    public CarInfo(int c, String cn, String on, String st, Date mfd) {
        System.out.println("Parameterized constructor is called");
        this.carnum = c;
        this.cname = cn;
        this.oname = on;
        this.state = st;
        this.manufacdate = mfd;
    }

    // Display method
    public void display() {
        System.out.println("Car Name: " + cname);
        System.out.println("Car Number: " + carnum);
        System.out.println("Owner Name: " + oname);
        System.out.println("State: " + state);
        
            System.out.println("Manufacdate"+manufacdate);
        
    }

    // toString method
    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String mfdStr =  sdf.format(manufacdate);
        return "CarInfo [Car Number=" + carnum +
               ", Car Name=" + cname +
               ", Owner Name=" + oname +
               ", State=" + state +
               ", Manufacture Date=" + mfdStr + "]";
    }
}