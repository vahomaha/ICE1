package cardgame;

public class Card {

//	private int i;


    public enum Suit {
        Hearts,Diamonds,Spades,Clubs
    };
    public enum Value{
        ACE,TWO,THREE,FOUR,FIVE,SIX,SEVEN,EIGHT,NINE,TEN,JACK,QUEEN,KING
        
    };
    private Value value;
    private Suit suit;
    public Card(Value value,Suit suit) {
        this.value = value;
        this.suit = suit;
    }

	public Value getValue() {
		return this.value;
	}

	public void setValue(Value value) {
		this.value = value;
	}

	public Suit getSuit() {
		// TODO - implement Card.getSuits
		throw new UnsupportedOperationException();
	}

	
	public void setSuit(Suit suits) {
		// TODO - implement Card.setSuits
		throw new UnsupportedOperationException();
	}
	

}