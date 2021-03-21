package hu.atig.punto.domain.model;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class BaseModel {

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}
