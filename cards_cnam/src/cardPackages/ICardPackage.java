package cardPackages;
import java.util.ArrayList;
import java.util.List;

import cards.ICard;
import cards.enums.CardTypeEnum;

interface ICardPackage<T extends ICard> {
	List<ICard> cards = new ArrayList<ICard>();

	public List<T> getCards();

	public int size();

	public T pop();

	public CardTypeEnum getCardType();

	public void shuffle();
}
