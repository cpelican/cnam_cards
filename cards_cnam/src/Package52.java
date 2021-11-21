import java.util.ArrayList;
import java.util.List;

public class Package52 implements ICardPackage {
	protected String title = "Package52";
	List<ICard> cards = new ArrayList<ICard>();
	private static Package52 uniqueInstance = null;
	static int instanceNumber = 0;

	private Package52() {
		CardKindEnum[] kinds = CardKindEnum.values();
		CardValueBaseEnum[] values = CardValueBaseEnum.values();
		
		for (CardKindEnum kind : kinds) {
			for (CardValueBaseEnum value : values) {				
				Card32 card = new Card32(this.title, false, kind.toString(), value.toString());
				cards.add(card);
			}
		}
		CardValue52Enum[] values52 = CardValue52Enum.values();
		
		for (CardKindEnum kind : kinds) {			
			for (CardValue52Enum value52 : values52) {				
				Card52 card = new Card52(this.title, false, kind.toString(), value52.toString());
				cards.add(card);
			}
		}
		
	}
	
	public static Package52 getInstance() {
		if (Package52.uniqueInstance == null) {
			Package52.uniqueInstance = new Package52();
			++Package52.instanceNumber;
		}
		System.out.printf("Package52 instance number: %s \n\n", Package52.instanceNumber);
		return Package52.uniqueInstance;
	}

	public List<ICard> getCards() {
		return this.cards;
	}
}
