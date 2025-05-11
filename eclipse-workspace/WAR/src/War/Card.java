package War;

public class Card {

	private int value; // value of the card (2-14)
	private String name; // name the card
	
	// Constructor for the card 
	public Card (int value, String name) {
		this.value = value;
		this.name = name;
		
	}
	// getter for the value of the card 
	public int getValue() {
		return value;
		
	}
	// setter for the value of the card 
	public void setValue (int value) {
		this.value = value;
		
	}
	// getter for the name of the card	
	public String getName() {
		return name;
	}
	// setter for the name of the card	
	public void setName(String name) {
		this.name = name; 
		
	}
	// method to describe the card 
	public void describe() {
		System.out.println("Card: " + name + "(Value: " + value + ")");
	}
	}

