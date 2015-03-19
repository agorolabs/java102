package exercise.workingwithmethods;

public class Cubes {

	static int cube (int i){
		int j = i * i * i;
		return j;
	}
	
	public static void main(String[] args) {
		int N = Integer.parseInt(args[0]);
		for (int i=0 ;i<= N; i++) {
			System.out.println(i + " " + cube(i));
		}
	}
}

