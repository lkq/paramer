package com.github.lkq.paramer;

import org.junit.jupiter.api.Test;

class RequiresTest {

    @Test
    void requiresAllPasses() {
        Paramer.requires()
                .notNull(new Object(), "whatever")
                .notBlank("   a", "whatever");
    }
}