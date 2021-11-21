public class Exo2 {
	public static void main(String[] args) {
		ICardPackage game = Package32.getInstance();
		Package32.getInstance(); 
		Package32.getInstance();
		CardPackage cardPackage = new CardPackage(game);
		System.out.println(cardPackage);
		System.out.printf("Card number: %s \n", cardPackage.size());
		
		ICardPackage game52 = Package52.getInstance(); 
		Package52.getInstance();
		Package52.getInstance();
		CardPackage cardPackage52 = new CardPackage(game52);
		System.out.println(cardPackage52);
		System.out.printf("Card number: %s \n", cardPackage52.size());
		
		ICardPackage gameTarot = PackageTarot.getInstance();
		PackageTarot.getInstance();
		PackageTarot.getInstance();
		CardPackage cardPackageTarot = new CardPackage(gameTarot);
		System.out.println(cardPackageTarot);
		System.out.printf("Card number: %s \n", cardPackageTarot.size());
	}

}
