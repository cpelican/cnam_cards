public class GameModel <T extends ICard> {
	CardTypeEnum theCardType = null;
	CardPackage<T> cardPackage = null;
	PlusMinusGame<T> game = null;

	GameModel(int gameChoiceInput) {
		this.theCardType = CardTypeEnum.getFromOrdinal(gameChoiceInput);
		if (theCardType != null) {
			this.cardPackage = new CardPackage<T>(theCardType);
			this.cardPackage.shuffle();
			this.game = new PlusMinusGame<T>(this.cardPackage);
		}
	}
	
	public boolean isGameModelConfigComplete() {
		return this.cardPackage != null && this.game != null;
	}
	
	public CardPackage<T> getPackage() {
		return this.cardPackage;
	}
	
	public PlusMinusGame<T> getGame() {
		return this.game;
	}
}
