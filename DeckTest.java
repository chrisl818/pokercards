package pokercards;

public class DeckTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deck deck = new Deck();
		deck.shuffle();
		
		for (int i=0; i<55; i++) {
			Card card = deck.dealOneCard();
			if (card != null) {
				System.out.println("deal #" + i + ": " + card.toString());
			}
			else {
				System.out.println("deal #" + i + ": " + "no more card");
			}		
		}
	}
}
