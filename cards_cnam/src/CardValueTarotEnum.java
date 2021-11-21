public enum CardValueTarotEnum {
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
