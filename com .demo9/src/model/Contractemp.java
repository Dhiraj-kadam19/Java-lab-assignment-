package model;

public class Contractemp extends Employee {
private float hours;
private double charges;
public Contractemp(int id,String nm,String m,String desg, String dept ,float hours, double charges) {
	super(id,nm,m,desg, dept);
	this.hours = hours;
	this.charges = charges;
}
public Contractemp() {
	super();
	// TODO Auto-generated constructor stub
}



public float getHours() {
	return hours;
}
public void setHours(float hours) {
	this.hours = hours;
}
public double getCharges() {
	return charges;
}
public void setCharges(double charges) {
	this.charges = charges;
}
@Override
public String toString() {
	return super.toString()+"Contractemp [hours=" + hours + ", charges=" + charges + "]";
}
@Override
public double calculatesal() {
	System.out.println("calculate the salary of contractemp");
	return hours*charges;
}

}
