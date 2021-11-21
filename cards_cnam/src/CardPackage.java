import java.util.ArrayList;
import java.util.List;

public class CardPackage {
	private List<ICard> cards = new ArrayList<ICard>();

	CardPackage(ICardPackage cardPackage) {
		List<ICard> cards = cardPackage.getCards();
		this.cards = cards;
	}
	
	public String toString() {
		String packageAsString = "Card package:\n";
		for (ICard card: this.cards) {
			packageAsString += String.format("%s \n", card);
		}
		
		return packageAsString;
	}
	
	public int size() {
		return cards.size();
	}
}
