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
	
	public int toInt() {
		int cardValue = 0;
		switch (this) {
			case two:
				cardValue = 2;
				break;
			case three:
				cardValue = 3;
				break;
			case four:
				cardValue = 4;
				break;
			case five:
				cardValue = 5;
				break;
			case six:
				cardValue = 6;
				break;
			default:
				break;
		}
		return cardValue;
	}
}
