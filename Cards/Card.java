
public class Card implements Comparable<Card>{

	/**
	 *Create a Card class. 
	 *A card has a suit (hearts, diamonds, spades, or clubs) 
	 *and a rank (1-10, jack, queen, or king). 
	 *A card of rank 1 is called an ace and represented by 
	 *A; Jack, Queen, and King are represented by their first letter. 
	 *Create appropriate methods and constructors for creating and describing cards. 
	 */
	
	private String suit;
	private int rank;
	private String name;
	
	private static String[] names = 
		{ 
			"Ace", 
			"2", 
			"3", 
			"4", 
			"5", 
			"6", 
			"7", 
			"8", 
			"9", 
			"10", 
			"Jack", 
			"Queen", 
			"King"
		};
	
	private static String[] suits = 
		{ 
			"♥", 
			"♦", 
			"♠", 
			"♠", 
		};

	
	public Card(int suit, int rank) throws Exception{
		try {
			this.suit = suits[suit-1];
			this.name = names[rank-1];
			this.rank = rank;
		}
		catch(Exception e){
			e.printStackTrace();
			System.out.println("Suit and/or rank must not be zero!!");
		}
	}

	public String getSuit() {
		return suit;
	}

	public int getRank() {
		return rank;
	}

	public String getName() {
		return name;
	}

	@Override
	public int compareTo(Card card2) {
		return this.rank - card2.getRank();
	}

}
