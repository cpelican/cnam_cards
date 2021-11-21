public enum CardValue52Enum implements ICardEnum {
	two, three, four, five, six;

	public String toString() {
		String cardSign = null;
		switch (this) {
			case two:
				cardSign = "deux";
				break;
			case three:
				cardSign = "trois";
				break;
			case four:
				cardSign = "quatre";
				break;
			case five:
				cardSign = "cinq";
				break;
			case six:
				cardSign = "six";
				break;
			default:
				break;
		}
		return cardSign;
	}
}
