import java.util.InputMismatchException;
import java.util.Scanner;

public class GameView<T extends ICard> {
	Scanner scanner = null;
	
	GameView () {
		this.scanner = new Scanner(System.in);
	}
	
	boolean isAnswerEmpty(String response) {
		return !this.scanner.hasNextLine() || response == null;
	}
	
	void closeScanner() {
		this.scanner.close();
	}
	
	void printCloseGame() {
		System.out.println("We're closing the game \n");
	}
	
	void printWrongCardTypeChoice() {
		System.out.println("We're too lazy to implement this part, so we'll punish you for trying to mess with us, ciao!\n");
	}
	
	void printGameIsFinished() {
		System.out.println("Wrong pick!\n");
	}
	
	public void printGameState(PlusMinusGame<T> game) {
		if (game.getPreviousCard() != null) {
			System.out.printf("%s \n", game.getPreviousCard().toString());
		}
		if (game.getCurrentCard() != null) {
			System.out.printf("%s \n", game.getCurrentCard().toString());
		}
	}
	
	void printHasWon(int points) {
		System.out.println("Congrats, you have won this immensely difficult game. We hope you didn't cheet!");
		System.out.printf("You earned %s points \n", points);
	}
	
	void printPrepareGame() {
		System.out.println("We're preparing your game\n");
	}
	
	void printCardType(CardTypeEnum cardType) {
		System.out.printf("You have chosen %s. \n", cardType.toString());
	}
	
	void printChooseCardType() {
		System.out.println("Welcome to the plus minus game!\n");
		System.out.println("Please choose a card package number between the following options:\n");
		System.out.println("0: Card 32\n");
		System.out.println("1: Card 52\n");
		System.out.println("2: Card tarot\n");
	}
	
	void printRules() {
		System.out.println("In order to play, try to guess if the next card will be higher than the one you currently have\n");
		System.out.println("If you think next card value will be higher than the current one, enter '+'\n");
		System.out.println("If you think next card value will be lower than the current one, enter '+'\n");
		System.out.println("To close the game enter 'close'\n");
		System.out.println("Before all, enter 'start' to initiate the game\n");
	}
	
	void printStartGame() {
		System.out.println("Good luck!\n");
	}
	
	public int getUserGameChoiceInput() {
		int input = -1;
		try {
			input = this.scanner.nextInt();
		} catch(InputMismatchException e) {
			System.out.println("Pity, you should have chosen one of the proposed solutions \n");
		}
		return input;
	}
	
	public String getUserGameResponseInput() {
		return this.scanner.next().replaceAll("\\s","");
	}
}
