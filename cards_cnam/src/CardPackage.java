import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CardPackage<T extends ICard> implements ICardPackage<T> {
	protected String title = "Package";
	private CardTypeEnum cardType = null;
	List<T> cards = new ArrayList<T>(); // TODO: make it a stack

	public CardPackage(CardTypeEnum cardEnum) {
		this.cardType = cardEnum;
		List<CardConfig> cardConfig = cardEnum.getCardConfig();
		
		for (CardConfig config : cardConfig) {
			@SuppressWarnings("unchecked")
			T card = (T) cardEnum.getInstance(false, this.title, config.getStringValue(), config.getValue(), config.getKind());
			cards.add(card);
		}
	}
	
	public String getName() {
		return this.getCardType().toString() + " package";
	}

	public List<T> getCards() {
		return this.cards;
	}
	
	public int size() {
		return this.cards.size();
	}
	
	public T pop() {
		T card = null;
		if (this.cards.size() != 0) {
			card = this.cards.remove(0); // todo, make sure the first index remains
		}
		return card;
	}

	public CardTypeEnum getCardType() {
		return cardType;
	}
	
	public void shuffle() {
		Collections.shuffle(this.cards);
	}
}
