import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	Card c;
	ArrayList<Card> deck = new ArrayList<Card>();
	
	public Main() throws Exception{
		
		createDeck();
		//printDeck();
		
		Collections.shuffle(deck);
		printDeck();
		
		Collections.sort(deck);
		printDeck();
		
		System.out.println();
		
		//Comparator<Card> c = new SortBySuit();
		//Comparator<Card> c = new SortByRankAceTop();
		//deck.sort(c);
		//printDeck();
		
		/*
		createDeck();
		Collections.shuffle(deck);
		
		System.out.println("You got 2 cards in hand");
		Blackjack b = new Blackjack( randomCard(), randomCard() );
		
		System.out.println("Current total= " +b.calculate());
		
		
		final Scanner s = new Scanner(System.in);
		String input = "";
		
		b.printHand();
		
		while(true) {
			
			System.out.println("Enter command");
    		System.out.println("0. Hit");
    		System.out.println("1. Stand");
    		System.out.println("2. Show cards");
    		System.out.println("3. Reset");
    		
    		input = s.nextLine();
    		
    		if(input.equalsIgnoreCase("0")) {
    			b.hit(randomCard());
    			System.out.println("Current total= " +b.calculate());
    			
    			if(b.calculate() > 21)
    				System.out.println("You lose!");
    			
    			b.printHand();
    		}
    		
    		else if(input.equalsIgnoreCase("1")) {
    			System.out.println("Current total= " +b.calculate());
    			
    			if(b.calculate() > 21)
    				System.out.println("You lose!");
    			
    			b.printHand();
    		}
			
    		else if(input.equalsIgnoreCase("2")) {
    			System.out.println("Your cards: ");
    			b.printHand();
    		}
    		
    		else if(input.equalsIgnoreCase("3")) {
    			b.reset();
    			resetDeck();
    			createDeck();
    			
    			System.out.println("You got 2 cards in hand");
    			b = new Blackjack( randomCard(), randomCard() );
    			
    			System.out.println("Current total= " +b.calculate());
    			
    			b.printHand();
    		}
    		
		}
		*/
	}
	
	public Card randomCard() {
		
		int cardnum = (int)Math.random()*51 +1;
		
		return deck.remove(cardnum);
	}
	
	public void resetDeck() throws Exception {
		deck.clear();
		createDeck();
		Collections.shuffle(deck);
	}
	
	public void createDeck() throws Exception {
		for(int i=1; i<=4; i++) {
			for(int j=1; j<=13; j++) {
				c = new Card(i, j);
				deck.add(c);
			}
		}
	}

	public void printDeck() {
		System.out.println("Suit\tRank\tName");
		System.out.println("-------------------------------");
		for(Card c : deck) {
			System.out.println(c.getSuit() + '\t' + c.getRank() + '\t' +c.getName());
		}
	}

	public static void main(String[] args) throws Exception {
		new Main();
	}

}
