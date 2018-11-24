package com.github.lkq.paramer;

import java.util.Objects;

public class Requires {
    public Requires notBlank(String value, String message) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException(message);
        }
        int length = value.length();
        for (int i = 0; i < length; i++) {
            if (!Character.isWhitespace(value.charAt(i))) {
                return this;
            }
        }
        throw new IllegalArgumentException(message);
    }

    public Requires notNull(Object value, String message) {
        Objects.requireNonNull(value, message);
        return this;
    }
}
