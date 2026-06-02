package Model;

import java.time.LocalDate;

public class Vechicle {
	 private int vid;
     private String vname;
     private double price;
     private String model;
     private LocalDate mfgdate;
	 public Vechicle(int vid) {
		super();
		System.out.println("vechicle non para constructor is call");

	 }
	 public Vechicle(int vid, String vname, double price, String model, LocalDate mfgdate) {
		super();
		this.vid = vid;
		this.vname = vname;
		this.price = price;
		this.model = model;
		this.mfgdate = mfgdate;
	 }
	 public int getVid() {
		 return vid;
	 }
	 public void setVid(int vid) {
		 this.vid = vid;
	 }
	 public String getVname() {
		 return vname;
	 }
	 public void setVname(String vname) {
		 this.vname = vname;
	 }
	 public double getPrice() {
		 return price;
	 }
	 public void setPrice(double price) {
		 this.price = price;
	 }
	 public String getModel() {
		 return model;
	 }
	 public void setModel(String model) {
		 this.model = model;
	 }
	 public LocalDate getMfgdate() {
		 return mfgdate;
	 }
	 public void setMfgdate(LocalDate mfgdate) {
		 this.mfgdate = mfgdate;
	 }
	 @Override
	 public String toString() {
		return "Vechicle [vid=" + vid + ", vname=" + vname + ", price=" + price + ", model=" + model + ", mfgdate="
				+ mfgdate + "]";
	 }
	 public int getid() {
		// TODO Auto-generated method stub
		return 0;
	 }

}
