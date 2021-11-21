public enum CardKindEnum implements ICardEnum {
	spades, hearts, diamonds, clubs;

	public String toString() {
		String cardKind = null;
		switch (this) {
		case spades:
			cardKind = "pique";
			break;
		case clubs:
			cardKind = "trèfle";
			break;
		case diamonds:
			cardKind = "carreau";
			break;
		default:
			cardKind = "coeur";
			break;
		}
		return cardKind;
	}
}
