public class CardConfig {
	private String kind = null;
	private String stringValue = null;
	private int value = -1;

	public CardConfig(String kind, String stringValue, int value) {
		this.kind = kind;
		this.stringValue = stringValue;
		this.value = value;
	}

	public String getStringValue() {
		return stringValue;
	}

	public String getKind() {
		return kind;
	}

	public int getValue() {
		return value;
	}
}
