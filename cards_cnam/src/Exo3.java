import cardPackages.CardPackage;
import cards.ICard;
import cards.enums.CardTypeEnum;

public class Exo3 {
	public static void main(String[] args) {
		GameView<ICard> gameView = new GameView<ICard>();
		gameView.printChooseCardType();
		GameModel<ICard> model = new GameModel<ICard>(gameView.getUserGameChoiceInput());

		if (!model.isGameModelConfigComplete()) {
			gameView.printWrongCardTypeChoice();
			gameView.closeScanner();
		} else {
			CardPackage<ICard> cardPackage = model.getPackage();
			CardTypeEnum cardType = cardPackage.getCardType();
			PlusMinusGame<ICard> game = model.getGame();

			gameView.printCardType(cardType);
			gameView.printPrepareGame();
			gameView.printRules();
			gameView.printStartGame();

			String response = null;
			boolean doPlay = true;

			while (doPlay) {
				doPlay = false;
				response = gameView.getUserGameResponseInput();
				boolean hasNextPlay = false;

				if (game.canPlay(response)) {
					hasNextPlay = game.playNext(response);
					gameView.printGameState(game);
				}

				if (game.isLastCard()) {
					gameView.printHasWon(game.getPoints());
				} else if (!hasNextPlay) {
					gameView.printGameIsFinished();
				} else {
					doPlay = true;
				}
			}
			gameView.printCloseGame();
			gameView.closeScanner();
		}
	}
}
