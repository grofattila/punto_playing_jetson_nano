package hu.atig.punto.domain.model;

import java.util.Optional;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class Field {

    private static final Queue<Card> cardsPile = new LinkedBlockingQueue<>();

    private Field rightNeighbour = null;
    private Field leftNeighbour = null;
    private Field topNeighbour = null;
    private Field bottomNeighbour = null;

    public void putCardOnTop(Card card) {
        cardsPile.add(card);
    }

    public Card getTopCard() {
        return cardsPile.peek();
    }

}
