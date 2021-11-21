public class Card32 extends BaseCard {	
	Card32(String pattern, boolean isVisible, String kind, String value) {
		this.setPattern(pattern);
		this.setIsVisible(isVisible);
		this.value = value;
		this.kind = kind;
	}
}
