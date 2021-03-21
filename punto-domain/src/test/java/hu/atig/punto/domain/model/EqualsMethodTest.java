package hu.atig.punto.domain.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EqualsMethodTest {

    @Test
    void testEquals() {
        Card c1 = new Card(CardType.FIVE, TeamColor.BLUE);
        Card c2 = new Card(CardType.FIVE, TeamColor.BLUE);
        Card c3 = new Card(CardType.THREE, TeamColor.BLUE);

        assertNotEquals(c2, c1);
        assertNotEquals(c3, c1);
        assertNotEquals(c3, c2);
    }


}
