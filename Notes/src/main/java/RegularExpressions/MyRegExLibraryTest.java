/*
 * Copyright David Amateau 2021.
 */

package RegularExpressions;

import org.junit.jupiter.api.Test;

import static RegularExpressions.MyRegExLibrary.*;
import static org.junit.jupiter.api.Assertions.*;

class MyRegExLibraryTest {

    @Test
    void testSingleSentencePattern() {
        assertTrue(isSingleSentence("I walked my cat to the moon today!"));
        assertFalse(isSingleSentence("roses are red, violets are blue"));
    }

    @Test
    void testIsWholeNumberPattern() {
        assertTrue(isWholeNumber("484847"));
        assertFalse(isWholeNumber("387493.95"));
        assertFalse(isWholeNumber("one"));
        assertFalse(isWholeNumber("-1847"));
    }

    @Test
    void testContainsOnlyAlphanumericWithSpaces() {
        assertTrue(containsOnlyAlphanumericWithSpaces("hey bob joe this world is crazy"));
        assertTrue(containsOnlyAlphanumericWithSpaces("fishkettlehook dolphin"));
        assertFalse(containsOnlyAlphanumericWithSpaces("hey bob joe what's up"));
    }
}