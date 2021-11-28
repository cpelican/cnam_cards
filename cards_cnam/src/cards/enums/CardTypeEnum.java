package cards.enums;
import java.util.ArrayList;
import java.util.List;

import cards.Card32;
import cards.Card52;
import cards.CardTarot;
import cards.ICard;

public enum CardTypeEnum {
	Card32 {
		public Card32 getInstance(boolean isVisible, String pattern, String stringValue, int value, String kind) {
			return new Card32(isVisible, pattern, stringValue, value, kind);
		}

		public List<CardConfig> getCardConfig() {
			List<CardConfig> kindAndValues = new ArrayList<CardConfig>();
			CardKindEnum[] kinds = CardKindEnum.values();
			CardValueBaseEnum[] values = CardValueBaseEnum.values();

			for (CardKindEnum kind : kinds) {
				for (CardValueBaseEnum value : values) {
					CardConfig cardConfig = new CardConfig(kind.toString(), value.toString(), value.toInt());
					kindAndValues.add(cardConfig);
				}
			}
			return kindAndValues;
		}
	},
	Card52 {
		public Card52 getInstance(boolean isVisible, String pattern, String stringValue, int value, String kind) {
			return new Card52(isVisible, pattern, stringValue, value, kind);
		};

		public List<CardConfig> getCardConfig() {
			List<CardConfig> kindAndValues = new ArrayList<CardConfig>();
			CardKindEnum[] kinds = CardKindEnum.values();
			CardValueBaseEnum[] values = CardValueBaseEnum.values();

			for (CardKindEnum kind : kinds) {
				for (CardValueBaseEnum value : values) {
					CardConfig cardConfig = new CardConfig(kind.toString(), value.toString(), value.toInt());
					kindAndValues.add(cardConfig);
				}
			}
			CardValue52Enum[] values52 = CardValue52Enum.values();

			for (CardKindEnum kind : kinds) {
				for (CardValue52Enum value52 : values52) {
					CardConfig cardConfig = new CardConfig(kind.toString(), value52.toString(), value52.toInt());
					kindAndValues.add(cardConfig);
				}
			}
			return kindAndValues;
		}
	},
	CardTarot {
		public CardTarot getInstance(boolean isVisible, String pattern, String stringValue, int value, String kind) {
			return new CardTarot(isVisible, pattern, stringValue, value, kind);
		}

		public List<CardConfig> getCardConfig() {
			List<CardConfig> kindAndValues = new ArrayList<CardConfig>();
			CardKindEnum[] kinds = CardKindEnum.values();
			CardValueBaseEnum[] values = CardValueBaseEnum.values();

			for (CardKindEnum kind : kinds) {
				for (CardValueBaseEnum value : values) {
					CardConfig cardConfig = new CardConfig(kind.toString(), value.toString(), value.toInt());
					kindAndValues.add(cardConfig);
				}
			}
			CardValue52Enum[] values52 = CardValue52Enum.values();

			for (CardKindEnum kind : kinds) {
				for (CardValue52Enum value52 : values52) {
					CardConfig cardConfig = new CardConfig(kind.toString(), value52.toString(), value52.toInt());
					kindAndValues.add(cardConfig);
				}
			}
			CardKindTarotEnum[] trumpKinds = CardKindTarotEnum.values();
			CardValueTarotEnum[] valuesTarot = CardValueTarotEnum.values();
			CardValueTrumpEnum[] valuesTrump = CardValueTrumpEnum.values();

			for (CardKindEnum kind : kinds) {
				for (CardValueTarotEnum valueTarot : valuesTarot) {
					CardConfig cardConfig = new CardConfig(kind.toString(), valueTarot.toString(), valueTarot.toInt());
					kindAndValues.add(cardConfig);
				}
			}

			for (CardKindTarotEnum trumpKind : trumpKinds) {
				for (CardValueTrumpEnum valueTrump : valuesTrump) {
					CardConfig cardConfig = new CardConfig(trumpKind.toString(), valueTrump.toString(),
							valueTrump.toInt());
					kindAndValues.add(cardConfig);

				}
			}
			return kindAndValues;
		}
	};

	public abstract ICard getInstance(boolean isVisible, String pattern, String stringValue, int value, String kind);

	public abstract List<CardConfig> getCardConfig();

	public static CardTypeEnum getFromOrdinal(int ordinal) {
		CardTypeEnum cardType = null;
		switch (ordinal) {
		case 0:
			cardType = CardTypeEnum.Card32;
			break;
		case 1:
			cardType = CardTypeEnum.Card52;
			break;
		case 2:
			cardType = CardTypeEnum.CardTarot;
			break;
		default:
			cardType = null;
		}
		return cardType;
	};
}
