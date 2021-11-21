import java.util.ArrayList;
import java.util.List;

public class Package32 implements ICardPackage {
	protected String title = "Package32";
	List<ICard> cards = new ArrayList<ICard>();
	private static Package32 uniqueInstance = null;
	static int instanceNumber = 0;

	private Package32() {
		CardKindEnum[] kinds = CardKindEnum.values();
		CardValueBaseEnum[] values = CardValueBaseEnum.values();
		
		for (CardKindEnum kind : kinds) {
			for (CardValueBaseEnum value : values) {				
				Card32 card = new Card32(this.title, false, kind.toString(), value.toString());
				cards.add(card);
			}
		}
	}
	
	public static Package32 getInstance() {
		if (Package32.uniqueInstance == null) {
			Package32.uniqueInstance = new Package32();
			++Package32.instanceNumber;
		}
		System.out.printf("Package32 instance number: %s \n\n", Package32.instanceNumber);
		return Package32.uniqueInstance;
	}

	public List<ICard> getCards() {
		return this.cards;
	}
}
