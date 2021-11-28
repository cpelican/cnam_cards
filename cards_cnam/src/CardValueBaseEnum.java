public enum CardValueBaseEnum implements ICardEnum {
	ace, seven, eight, nine, ten, jack, queen, king;

	public String toString() {
		String cardSign = null;
		switch (this) {
			case seven:
				cardSign = "sept";
				break;
			case eight:
				cardSign = "huit";
				break;
			case nine:
				cardSign = "neuf";
				break;
			case ten:
				cardSign = "dix";
				break;
			case jack:
				cardSign = "valet";
				break;
			case queen:
				cardSign = "reine";
				break;
			case king:
				cardSign = "roi";
				break;
			default:
				cardSign = "as";
				break;
			}
		return cardSign;
	}
	
	public int toInt() {
		int cardValue = 0;
		switch (this) {
			case seven:
				cardValue = 7;
				break;
			case eight:
				cardValue = 8;
				break;
			case nine:
				cardValue = 9;
				break;
			case ten:
				cardValue = 10;
				break;
			case jack:
				cardValue = 11;
				break;
			case queen:
				cardValue = 13;
				break;
			case king:
				cardValue = 14;
				break;
			default: // ace
				cardValue = 15;
				break;
		}
		return cardValue;
	}
}
