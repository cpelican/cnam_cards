public enum CardValueBaseEnum {
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

}
