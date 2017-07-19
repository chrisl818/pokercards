package pokercards;

import java.util.Random;

// An object of type Deck represents an ordinary deck of 52 playing cards.
// The deck can be shuffled, and cards can be dealt from the deck.
public class Deck {
	private Card[] deck; // An array of 52 Cards, representing the deck.
	private int cardsUsed; // How many cards have been dealt from the deck.

    public Deck() {

    	deck = new Card[52];
    	int cardCt = 0; // How many cards have been created so far.
    	for ( int suit = 0; suit <= 3; suit++ ) {
    		for ( int value = 0; value <= 12; value++ ) {
    			deck[cardCt] = new Card(suit, value);
    			cardCt++;
    		}
    	}
    	cardsUsed = 0;
    }
	
    public void shuffle() {
    	
    	Random generator = new Random();

    	for ( int i = 51; i > 0; i-- ) {
    		int rand = generator.nextInt(i);
    		Card temp = deck[i];
    		deck[i] = deck[rand];
    		deck[rand] = temp;
    	}
    	cardsUsed = 0;
    }
	
    public Card dealOneCard() {
        // Deals one card from the deck and returns it.
    	if (cardsUsed >= 52)
    		return null;
    	cardsUsed++;
    	return deck[cardsUsed - 1];
    }
}
