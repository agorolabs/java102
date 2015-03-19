package exercise.usingajavalibrary;

public class CardDealer {
	private static final String[] SUITES = { "D", "H", "C", "S" };
	
	private static final int  TOTAL_CARDS_PER_SUITE = 13;
	
	public String deal() {
		// select a random suite
		String suite = SUITES[StdRandom.uniform(SUITES.length)];

		// select a random rank
		int rank = StdRandom.uniform (TOTAL_CARDS_PER_SUITE ) + 1;

		String card = rank + suite;
		
		// return the dealt card
		return card;
	}
}
