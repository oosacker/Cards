import java.util.Comparator;

public class SortByRankAceTop implements Comparator<Card>{

	@Override
	public int compare(Card c1, Card c2) {
		
		/*
		 * Special case for Ace (rank = 1)
		 */
		if(c1.getRank() == 1 || c2.getRank() == 1) {
			
			if(c1.getRank() == 1 && c2.getRank() != 1) {
				return 1;
			}
			
			if(c1.getRank() != 1 && c2.getRank() == 1) {
				return -1;
			}
			
			else if(c1.getRank() == 1 && c2.getRank() == 1) {
				return 0;
			}
		}
		
		return c1.compareTo(c2);
		
	}
}
