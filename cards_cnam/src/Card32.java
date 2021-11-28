public class Card32 extends BaseCard {
	public Card32(boolean isVisible, String pattern, String stringValue, int value, String kind) {
		this.setPattern(pattern);
		this.setIsVisible(false);
		this.stringValue = stringValue;
		this.value = value;
		this.kind = kind;
	}
}
