package exercise.usingajavalibrary;

public class StdRandom {
	//between 0 and N-1
	public static int uniform (int N){
		return (int)(Math.random() * N);
	}

	// between lo and hi
	public static double uniform (double lo, double hi){
		return lo + (int)(Math.random() * (hi-lo));
	}
	
	// truth with probability
	public static boolean bernoulli(double p){
		return Math.random() < p;
	}
}
