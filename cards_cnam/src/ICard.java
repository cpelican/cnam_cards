public interface ICard {
	String getKind();
	String getValue();
	String getPattern();
	boolean isVisible();
	void setPattern(String pattern);
	void setIsVisible(boolean isVisible);
	String toString();
}
