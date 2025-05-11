package War;

import java.util.ArrayList;
import java.util.List;

public class Player {

	
	private List<Card> hand; //players hand
	private int score;// players score
	private String name;// name of player
	
	//players class
	public Player (String name ) {
		this.setName(name);
		this.setHand(new ArrayList<>());
		this.setScore(0);

	}
	
//getters and setters
	public List<Card> getHand() {
		return hand;
	}

	public void setHand(List<Card> hand) {
		this.hand = hand;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	//players and their hands
	public void describe() {
		System.out.println("Player: ");
		System.out.println("Hand: ");
		
		if (hand.isEmpty()) {
			System.out.println("    (Empty)");
			
		} else { 
			for (Card card : hand) {
				card.describe();
			}
		}
		System.out.println("Score: " + score);
	}
	// flip the card from the hand 
	public Card flip() {
		if (hand.isEmpty()) {
			return null;
			
		}
		return hand.remove(0);
	}
	//draw a card from the deck 
	public void draw (Deck deck) {
		Card drawnCard = deck.draw();
		if (drawnCard != null) {
			hand.add(drawnCard);
		}
	}
	//adds the players score together as the game goes. 
	public void incrementScore() {
		score++;
	}
}
