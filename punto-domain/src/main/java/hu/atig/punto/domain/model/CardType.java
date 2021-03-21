package hu.atig.punto.domain.model;

import hu.atig.punto.domain.exception.IllegalValueException;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public enum CardType {

    ONE(1),
    TWO(2),
    THREE(3),
    FOUR(4),
    FIVE(5),
    SIX(6),
    SEVEN(7),
    EIGHT(8),
    NINE(9);


    private int value;

    CardType(int value) {
        this.value = value;
    }

    public static CardType valueOf(int value) {
        switch (value) {
            case 1:
                return ONE;
            case 2:
                return TWO;
            case 3:
                return THREE;
            case 4:
                return FOUR;
            case 5:
                return FIVE;
            case 6:
                return SIX;
            case 7:
                return SEVEN;
            case 8:
                return EIGHT;
            case 9:
                return NINE;
            default:
                throw new IllegalValueException("Card value can only in between 1-9!");
        }
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}
