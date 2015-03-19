package exercise.creatingobjects;

public class CarFactory {

	public static void main(String[] args) {
		Car firstCar = new Car();
		Car secondCar = new Car();
		
		firstCar.color = "Blue";
		secondCar.color = "Pink";
		
		System.out.println("Just finished painting my two new cars");
	}
}
