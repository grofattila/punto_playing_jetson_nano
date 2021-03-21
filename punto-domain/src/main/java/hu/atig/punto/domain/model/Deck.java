package hu.atig.punto.domain.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.PriorityBlockingQueue;

public class Deck extends BaseModel{

    private static final int NUMBER_OF_CARDS_IN_DECK = 18;

    private final Queue<Card> cardDeck = new PriorityBlockingQueue<>(NUMBER_OF_CARDS_IN_DECK);
    private final TeamColor teamColor;

    public Deck(TeamColor teamColor) {
        this.teamColor = teamColor;
        populateDeck();
        shuffle();
    }

    public Card pickCard() {
        return cardDeck.poll();
    }

    private void populateDeck() {
        for (int i = 1; i < 9; i++) {
            Card card1 = new Card(CardType.valueOf(i), teamColor);
            Card card2 = new Card(CardType.valueOf(i), teamColor);

            cardDeck.add(card1);
            cardDeck.add(card2);
        }
    }

    public void shuffle() {
        List<Card> cards = new ArrayList<>(cardDeck);
        Collections.shuffle(cards);
        cardDeck.clear();
        cardDeck.addAll(cards);
    }

    public TeamColor getTeamColor() {
        return teamColor;
    }
}
