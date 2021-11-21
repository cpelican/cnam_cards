import java.util.ArrayList;
import java.util.List;

public class PackageTarot implements ICardPackage {
	protected String title = "PackageTarot";
	List<ICard> cards = new ArrayList<ICard>();
	private static PackageTarot uniqueInstance = null;
	static int instanceNumber = 0;

	private PackageTarot() {
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
		CardKindTarotEnum[] trumpKinds = CardKindTarotEnum.values();
		CardValueTarotEnum[] valuesTarot = CardValueTarotEnum.values();
		CardValueTrumpEnum[] valuesTrump = CardValueTrumpEnum.values();
		
		for (CardKindEnum kind : kinds) {			
			for (CardValueTarotEnum valueTarot : valuesTarot) {
				CardTarot card = new CardTarot(this.title, false, kind.toString(), valueTarot.toString());
				cards.add(card);
			}
		}

		for (CardKindTarotEnum trumpKind : trumpKinds) {
			for (CardValueTrumpEnum valueTrump: valuesTrump) {
				CardTarot card = new CardTarot(this.title, false, trumpKind.toString(), valueTrump.toString());
				cards.add(card);
			}
		}
	}
	
	public static PackageTarot getInstance() {
		if (PackageTarot.uniqueInstance == null) {
			PackageTarot.uniqueInstance = new PackageTarot();
			++PackageTarot.instanceNumber;
		}
		System.out.printf("PackageTarot instance number: %s \n\n", PackageTarot.instanceNumber);
		return PackageTarot.uniqueInstance;
	}
	
	public List<ICard> getCards() {	
		return this.cards;
	}
}
