package War;

public class App {

	public static void main(String[] args) {
		
		//instantiates a deck and 2 players 
			Deck deck = new Deck ();
			Player player1 = new Player("Player 1");
			Player player2 = new Player ("Player 2");
			
			deck.shuffle();
			
			//iterate 52 times since there are 52 cards in the deck 
			for (int i = 0; i < 52; i++) {
				if (i % 2 ==0) {
					player1.draw(deck);
				} else {
					player2.draw(deck);
				
				}
			}
			
			
			
			//now that they each have half the deck, we are going to iterate 26 times 
			for (int i = 0; i < 26; i++) {
				System.out.println("\n--- Round " + (i + 1) + " ---");
				
				Card card1 = player1.flip();
				Card card2 = player2.flip();
				
				
				 if (card1 != null) {
		                System.out.print(player1.getName() + " flips: ");
		                card1.describe();
		            }
		            if (card2 != null) {
		                System.out.print(player2.getName() + " flips: ");
		                card2.describe();
		            }
		            

		            if (card1 != null && card2 != null) {
		            	//player 1 wins the round 
		                if (card1.getValue() > card2.getValue()) {
		                    player1.incrementScore();
		                    System.out.println(player1.getName() + " wins the round!");
		                    
		                // player 2 wins the round
		                } else if (card2.getValue() > card1.getValue()) {
		                    player2.incrementScore();
		                    System.out.println(player2.getName() + " wins the round!");
		                    
		                } else {
		                    System.out.println("It's a tie! No points awarded.");
		                }
		            }
		            
		            // once player 1 runs out of cards
		             else if (card1 == null){
		                System.out.println(player1.getName() + " has no more cards.");
		                if (card2 != null){
		                    player2.incrementScore();
		                    System.out.println(player2.getName() + " wins the round!");
		                }
		            }
		            
		            // once player 2 runs out of cards  
		            else if (card2 == null){
		                System.out.println(player2.getName() + " has no more cards.");
		                if (card1 != null){
		                    player1.incrementScore();
		                    System.out.println(player1.getName() + " wins the round!");
		                }
		            }
		            else {
		                System.out.println("Both players are out of cards!");
		                break;
		            }

		            System.out.println(player1.getName() + " Score: " + player1.getScore());
		            System.out.println(player2.getName() + " Score: " + player2.getScore());
		        }

		        // Determine the winner
		        System.out.println("\n--- Game Over ---");
		        System.out.println(player1.getName() + " Final Score: " + player1.getScore());
		        System.out.println(player2.getName() + " Final Score: " + player2.getScore());

		        if (player1.getScore() > player2.getScore()) {
		            System.out.println(player1.getName() + " wins the game!");
		        } else if (player2.getScore() > player1.getScore()) {
		            System.out.println(player2.getName() + " wins the game!");
		        } else {
		            System.out.println("The game is a draw!");
			}
	}

}
