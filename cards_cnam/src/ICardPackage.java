import java.util.ArrayList;
import java.util.List;

interface ICardPackage {
	List<ICard> cards = new ArrayList<ICard>();
	public List<ICard> getCards();
	public static ICardPackage getInstance() {
		return null;
	}
}
