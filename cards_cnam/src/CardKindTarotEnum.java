public enum CardKindTarotEnum implements ICardKind {
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
}
