public abstract class BaseCard implements ICard {
	protected String kind;
	protected String value;
	protected String pattern;
	protected boolean isVisible;
	
	public String getKind() {
		return kind;
	}
	
	public String getValue() {
		return value;
	}
	
	public String getPattern() {
		return this.pattern;
	}
	
	public boolean isVisible() {
		return this.isVisible;
	}
	
	public void setValue(String value) {
		this.value = value;
	}
	
	public void setKind(String kind) {
		this.kind = kind;
	}
	
	public void setPattern(String pattern) {
		this.pattern = pattern;
	}
	
	public void setIsVisible(boolean isVisible) {
		this.isVisible = isVisible;
	}
	
	public String toString() {
		return String.format("Card: %s, %s, isVisible: %s, common pattern: %s", kind, value, isVisible, pattern);
	}
}
