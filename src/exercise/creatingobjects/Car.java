package exercise.creatingobjects;

public class Car {
	String make;
	String model;
	String color;
	
	public void setColor(String color){
		this.color = color;
	}
	
	public String getColor(){
		return this.color;
	}
	
	void startEngine(){
		System.out.println("starting engine");
	}
	
	void stopEngine(){
		System.out.println("stopping engine");
	}
	
}
