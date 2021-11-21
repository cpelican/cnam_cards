public enum CardValueTarotEnum implements ICardEnum {
	knight;

	public String toString() {
		String cardSign = null;
		switch (this) {
			case knight:
				cardSign = "cavalier";
				break;
			default:
				break;
		}
		return cardSign;
	}
}
