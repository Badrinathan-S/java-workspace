package oops;

public class DemoCaps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bike bike=new Bike();
		bike.setModel("TVS Apacha RTR 160 4V");
		bike.setCc(160);
		bike.setYear(2022);
		bike.setPrice(144000);
		bike.setQuality(100);
		bike.setMilage(48);
		
		
		System.out.println(bike.toString());
		
		Bike bk = new Bike("Pluser 150", 150, 2022, 50, 100, 130000);
		
		System.out.println(bk.toString());

	}

}
