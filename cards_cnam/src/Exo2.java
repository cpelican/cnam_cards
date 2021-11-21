public class Exo2 {
	public static void main(String[] args) {
		CardPackage<Card32> cardPackage = new CardPackage<Card32>(CardTypeEnum.Card32);

		System.out.printf("%s: %s cards \n %s",cardPackage.getName(), cardPackage.size(), cardPackage.getCards());

		CardPackage<Card52> cardPackage52 = new CardPackage<Card52>(CardTypeEnum.Card52);

		System.out.printf("\n\n %s: %s cards \n %s",cardPackage52.getName(), cardPackage52.size(), cardPackage52.getCards());
		
		CardPackage<CardTarot> cardPackageTarot = new CardPackage<CardTarot>(CardTypeEnum.CardTarot);

		System.out.printf("\n\n %s: %s cards \n %s",cardPackageTarot.getName(), cardPackageTarot.size(), cardPackageTarot.getCards());
	}
}
