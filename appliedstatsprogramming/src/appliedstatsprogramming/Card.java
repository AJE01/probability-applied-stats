package appliedstatsprogramming;

class Card {

	 private final String suit;
	    private final String value;
	   
	    //setting values for cards
	    
	    public Card(String suit, String value) {
	        this.suit = suit;
	        this.value = value;
	    }
	    public String getSuit() {
	        return suit;
	    }
	    public String getValue() {
	        return value;
	    }

	    @Override
	    public String toString() {
	        return value + suit;
	    }
}
