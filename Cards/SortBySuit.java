import java.util.Comparator;

public class SortBySuit implements Comparator<Card>{

	@Override
	public int compare(Card c1, Card c2) {
		String s1, s2;
		s1 = c1.getSuit();
		s2 = c2.getSuit();
		return s1.compareTo(s2);
	}

}
