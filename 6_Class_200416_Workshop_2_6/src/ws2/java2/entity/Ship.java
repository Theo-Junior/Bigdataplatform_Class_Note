package ws2.java2.entity;

public class Ship extends Vehicle{
	
	// Constructor with 4 variable 
	public Ship(String modelName, int maxSpeed, int numberlimit, int special) {
		super(modelName, maxSpeed, numberlimit, special);
	}
	
	// 메소드 오버라이딩 구현. 
	public void displayInfo(String modelName, int maxSpeed, int numberLimit, int replacement) {
		System.out.println("-------------------------------------------");
		System.out.println(" Model Name : " + modelName);
		System.out.println(" Max Speed : " + maxSpeed + " km/h");
		System.out.println(" People : " + numberLimit + " M");
		System.out.println(" Replacement : " + replacement + " Num");
	}
}
