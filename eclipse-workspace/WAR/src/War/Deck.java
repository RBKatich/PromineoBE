package War;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Deck {

	//List to hold the cards in the deck
	private List<Card> cards; // List to hold the cards in the deck 
	
	//Constructor
	public Deck() {
		cards = new ArrayList<>();
		String[] suits = { "Hearts", "Diamonds", "Clubs", "Spades"};
		String[] names = {"Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace"};
		
		for(int i = 0; i < suits.length; i++) {
			for (int j = 0; j < names.length; j++) {
				cards.add(new Card(j + 2, names[j] + "of" + suits[i]));
				
			}
		}
	}
	//shuffle the deck and randomize the selection 
	public void shuffle() { 
		Collections.shuffle(cards, new Random());
		
	}
	//method to draw 
	public Card draw() {
		if (cards.isEmpty()) {
			return null; //when there are no more cards, it stops
		}
		//this is going to remove the card after it is used so it doesnt keep cycling through 
		return cards.remove(0); 
		
	}
}

