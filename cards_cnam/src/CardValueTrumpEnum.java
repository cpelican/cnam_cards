public enum CardValueTrumpEnum {
	jocker, one, two, three, four, five, six, seven, eight, nine, ten, eleven, twelve, thirteen, fourteen, fifteen, sixteen, seventeen, eighteen, nineteen, twenty, twentyOne;

	public String toString() {
		String cardSign = null;
		switch (this) {
			case jocker:
				cardSign = "excuse";
				break;
			case one:
				cardSign = "petit";
				break;
			case two:
				cardSign = "deux";
				break;
			case three:
				cardSign = "trois";
				break;
			case four:
				cardSign = "quatre";
				break;
			case five:
				cardSign = "cinq";
				break;
			case six:
				cardSign = "six";
				break;
			case seven:
				cardSign = "sept";
				break;
			case eight:
				cardSign = "huit";
				break;
			case nine:
				cardSign = "neuf";
				break;
			case ten:
				cardSign = "dix";
				break;
			case eleven:
				cardSign = "onze";
				break;
			case twelve:
				cardSign = "douze";
				break;
			case thirteen:
				cardSign = "treize";
				break;
			case fourteen:
				cardSign = "quatorze";
				break;
			case fifteen:
				cardSign = "quinze";
				break;
			case sixteen:
				cardSign = "seize";
				break;
			case seventeen:
				cardSign = "dix-sept";
				break;
			case eighteen:
				cardSign = "dix-huit";
				break;
			case nineteen:
				cardSign = "dix-neuf";
				break;
			case twenty:
				cardSign = "vingt";
				break;
			case twentyOne:
				cardSign = "vingt-et-un";
				break;
		}
		return cardSign;
	}
}
