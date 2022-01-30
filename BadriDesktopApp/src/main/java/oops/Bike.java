package oops;

public class Bike {
	
	private String model;
	private int cc, year, milage, quality;
	private double price;
	
	public Bike() {
		System.out.println("Welcome to rainbow TVS");
	}
	
	public Bike(String model, int cc, int year, int milage, int quality, double price) {
		super();
		this.model = model;
		this.cc = cc;
		this.year = year;
		this.milage = milage;
		this.quality = quality;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Bike [model=" + model + ", cc=" + cc + ", year=" + year + ", milage=" + milage + ", quality=" + quality
				+ ", price=" + price + "]";
	}
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getCc() {
		return cc;
	}
	public void setCc(int cc) {
		this.cc = cc;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getMilage() {
		return milage;
	}
	public void setMilage(int milage) {
		this.milage = milage;
	}
	public int getQuality() {
		return quality;
	}
	public void setQuality(int quality) {
		this.quality = quality;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
}
