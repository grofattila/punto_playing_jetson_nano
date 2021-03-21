package hu.atig.punto.domain.model;

import java.util.Objects;

public class Card extends BaseModel {

    private final CardType cardType;
    private final TeamColor teamColor;

    public Card(CardType cardType, TeamColor teamColor) {
        this.cardType = cardType;
        this.teamColor = teamColor;
    }

    public CardType getCardType() {
        return cardType;
    }

    public TeamColor getTeamColor() {
        return teamColor;
    }

    public boolean isHigher(Card anotherCard) {
        return cardType.getValue() > anotherCard.getCardType().getValue();
    }

}
