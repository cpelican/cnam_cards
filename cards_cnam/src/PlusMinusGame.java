public class PlusMinusGame<T extends ICard> {
	private CardPackage<T> cardPackage = null;
	private T currentCard = null;
	private T lastCard = null;
	private int points = 0;

	PlusMinusGame(CardPackage<T> cardPackage) {
		this.cardPackage = cardPackage;
	}

	public boolean isPlusValue(String input) {
		return input.equalsIgnoreCase("+");
	}

	public boolean isMinusValue(String input) {
		return input.equalsIgnoreCase("-");
	}

	public boolean isValidResponse(String input) {
		return this.isPlusValue(input) || this.isMinusValue(input);
	}
	
	public boolean isNoCardYet() {
		return this.currentCard == null;
	}

	public boolean isFirstCard() {
		return this.lastCard == null;
	}

	public boolean isLastCard() {
		return this.currentCard == null && this.lastCard != null;
	}

	public boolean canPlay(String input) {
		boolean canPlay = false;

		if (this.isNoCardYet() && input.equalsIgnoreCase("start")) {
			canPlay = true;
		}

		if (this.isValidResponse(input)) {
			canPlay = true;
		}

		return canPlay;
	}

	public boolean playNext(String validInput) {
		this.lastCard = this.currentCard;
		this.currentCard = this.cardPackage.pop();
		boolean playNext = false;

		if (!this.isLastCard() && !this.isFirstCard()) {
			int currentValue = this.currentCard.getIntValue();
			int previousValue = this.lastCard.getIntValue();
			playNext = this.isPlusValue(validInput) ? previousValue <= currentValue : previousValue >= currentValue;
		}

		if (playNext) {
			this.points++;
		}

		return this.isFirstCard() || playNext;
	}

	public int getPoints() {
		return this.points;
	}

	public T getCurrentCard() {
		return this.currentCard;
	}

	public T getPreviousCard() {
		return this.lastCard;
	}
}
