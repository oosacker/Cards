import java.util.ArrayList;

/*
 * In blackjack, the goal is to make a hand coming as close to 21 as possible without going over. 
 * A hand has at least two cards, and the player can "hit" to draw an additional card. 
 * An ace counts as 11 if possible without going over 21, and as 1 otherwise. 10, J, Q, 
 * and K all count as 10. 
 * Create a class to represent a blackjack hand and compute its score. 
 */

public class Blackjack {

	private ArrayList<Card> hand;
	
	// new hand and 2 initial cards
	public Blackjack(Card c1, Card c2) {
		this.hand = new ArrayList<Card>();
		this.hand.add(c1);
		this.hand.add(c2);
	}
	
	public ArrayList<Card> getHand(){
		return this.hand;
	}
	
	public void printHand() {
		System.out.println("Suit\tRank\tName");
		System.out.println("-------------------------------");
		for(Card c : hand) {
			System.out.println(c.getSuit() + '\t' + c.getRank() + '\t' +c.getName());
		}
	}
	
	public void hit(Card c) {
		this.hand.add(c);
	}
	
	public void reset() {
		this.hand.clear();
	}
	
	public int calculate() {
		int total = 0;
		int value = 0;
		int ace_num = 0;	// number of ace in hand
		
		for(Card c : hand) {
			
			// do not count aces yet
			if ( c.getRank() != 1 ) {
				
				// K, Q, J are worth 10points
				if( c.getRank()==11 || c.getRank()==12 || c.getRank()==13 ) {
					value = 10;
				}
				
				else {
					value = c.getRank();
				}
				
				total = total + value;
				
			}
			
			else {
				ace_num++;
			}
			
			// add ace values
			if(total + ace_num*11 < 21) {
				
				total = total + ace_num*11;
				
			}
			
			else {
				
				total = total + ace_num*1;
				
			}
			
		}
		

		
		return total;
	}

}
