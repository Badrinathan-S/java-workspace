package permanant;

import java.io.Serializable;

public class Projector implements Serializable
{
	private String model,brand;
	private int price;
	/**
	 * @param model
	 * @param brand
	 * @param price
	 */
	public Projector(String model, String brand, int price) {
		super();
		this.model = model;
		this.brand = brand;
		this.price = price;
	}
	/**
	 * 
	 */
	public Projector() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Projector [model=" + model + ", brand=" + brand + ", price=" + price + "]";
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
}
