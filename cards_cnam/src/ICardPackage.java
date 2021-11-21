import java.util.ArrayList;
import java.util.List;

interface ICardPackage<T extends ICard> {
	List<ICard> cards = new ArrayList<ICard>();
	public List<T> getCards();
}
