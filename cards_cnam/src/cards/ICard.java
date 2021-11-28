package cards;
public interface ICard {
	String getKind();
	String getStringValue();
	String getPattern();
	boolean isVisible();
	void setPattern(String pattern);
	void setIsVisible(boolean isVisible);

	String toString();
	public int getIntValue();
}
