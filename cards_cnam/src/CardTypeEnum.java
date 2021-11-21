import java.util.ArrayList;
import java.util.List;

public enum CardTypeEnum {
		Card32 {
			public Card32 getInstance(boolean isVisible, String pattern, String value, String kind) {
				return new Card32(isVisible, pattern, value, kind);
			}
			public List<String[]> getKindsAndValues() {
				List<String[]> kindAndValues = new ArrayList<String[]>();
				CardKindEnum[] kinds = CardKindEnum.values();
				CardValueBaseEnum[] values = CardValueBaseEnum.values();
				
				for (CardKindEnum kind : kinds) {
					for (CardValueBaseEnum value : values) {				
						String[] cardConfig = new String[] {kind.toString(), value.toString()};
						kindAndValues.add(cardConfig);
					}
				}
				return kindAndValues;
			}
		},
		Card52 {
			public Card52 getInstance(boolean isVisible, String pattern, String value, String kind) {
				return new Card52(isVisible, pattern, value, kind);
			};
			public List<String[]> getKindsAndValues() {
				List<String[]> kindAndValues = new ArrayList<String[]>();
				CardKindEnum[] kinds = CardKindEnum.values();
				CardValueBaseEnum[] values = CardValueBaseEnum.values();
				
				for (CardKindEnum kind : kinds) {
					for (CardValueBaseEnum value : values) {				
						String[] cardConfig = new String[] {kind.toString(), value.toString()};
						kindAndValues.add(cardConfig);
					}
				}
				CardValue52Enum[] values52 = CardValue52Enum.values();
				
				for (CardKindEnum kind : kinds) {			
					for (CardValue52Enum value52 : values52) {				
						String[] cardConfig = new String[] {kind.toString(), value52.toString()};
						kindAndValues.add(cardConfig);
					}
				}
				return kindAndValues;
			}
		},
		CardTarot {
			public CardTarot getInstance(boolean isVisible, String pattern, String value, String kind) {
				return new CardTarot(isVisible, pattern, value, kind);
			}
			public List<String[]> getKindsAndValues() {
				List<String[]> kindAndValues = new ArrayList<String[]>();
				CardKindEnum[] kinds = CardKindEnum.values();
				CardValueBaseEnum[] values = CardValueBaseEnum.values();
				
				for (CardKindEnum kind : kinds) {
					for (CardValueBaseEnum value : values) {				
						String[] cardConfig = new String[] {kind.toString(), value.toString()};
						kindAndValues.add(cardConfig);
					}
				}
				CardValue52Enum[] values52 = CardValue52Enum.values();
				
				for (CardKindEnum kind : kinds) {			
					for (CardValue52Enum value52 : values52) {				
						String[] cardConfig = new String[] {kind.toString(), value52.toString()};
						kindAndValues.add(cardConfig);
					}
				}
				CardKindTarotEnum[] trumpKinds = CardKindTarotEnum.values();
				CardValueTarotEnum[] valuesTarot = CardValueTarotEnum.values();
				CardValueTrumpEnum[] valuesTrump = CardValueTrumpEnum.values();
				
				for (CardKindEnum kind : kinds) {			
					for (CardValueTarotEnum valueTarot : valuesTarot) {
						String[] cardConfig = new String[] {kind.toString(), valueTarot.toString()};
						kindAndValues.add(cardConfig);
					}
				}

				for (CardKindTarotEnum trumpKind : trumpKinds) {
					for (CardValueTrumpEnum valueTrump: valuesTrump) {
						String[] cardConfig = new String[] {trumpKind.toString(), valueTrump.toString()};
						kindAndValues.add(cardConfig);
						
					}
				}
				return kindAndValues;
			}
		};
		public abstract ICard getInstance(boolean isVisible, String pattern, String value, String kind);
		public abstract List<String[]> getKindsAndValues();
}
