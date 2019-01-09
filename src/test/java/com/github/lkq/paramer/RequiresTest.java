package com.github.lkq.paramer;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

class RequiresTest {

    @Test
    void requiresAllPasses() {
        Paramer.requires()
                .notNull(new Object(), "whatever")
                .notBlank("   a", "whatever")
                .notEmpty(Arrays.asList(""), "whatever")
                .truthy(true, "whatevet")
                .positive(1, "whatevet");
    }
}