package cards.enums;
import java.util.ArrayList;
import java.util.List;

public enum CardKindTarotEnum implements ICardEnum {
	trump;

	public String toString() {
		String cardKind = null;
		switch (this) {
		case trump:
			cardKind = "atout";
			break;
		}
		return cardKind;
	}
	
	public static List<String> getStringValues() {
		List<String> stringValues = new ArrayList<String>();
		for (CardKindTarotEnum value: CardKindTarotEnum.values()) {
			stringValues.add(value.toString());
		}
		
		return stringValues;
	}
}
