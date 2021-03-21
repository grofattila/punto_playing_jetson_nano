package hu.atig.punto.domain.model;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public enum TeamColor {

    RED,
    BLUE,
    GREEN,
    ORANGE;

    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}
