import java.util.ArrayList;
import java.util.List;

public class CardPackage<T extends ICard> implements ICardPackage<T> {
	protected String title = "Package";
	private CardTypeEnum cardType = null;
	List<T> cards = new ArrayList<T>();

	public CardPackage(CardTypeEnum cardEnum) {
		this.cardType = cardEnum;
		List<String[]> kindAndValues = cardEnum.getKindsAndValues();
		
		for (String[] config : kindAndValues) {
			String kind = config[0];
			String value = config[1];
			@SuppressWarnings("unchecked")
			T card = (T) cardEnum.getInstance(false, this.title, kind, value);
			cards.add(card);
		}
	}
	
	public String getName() {
		return this.cardType.toString() + " package";
	}

	public List<T> getCards() {
		return this.cards;
	}
	
	public int size() {
		return this.cards.size();
	}
}
