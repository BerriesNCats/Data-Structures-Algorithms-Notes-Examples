/*
 * Copyright David Amateau 2021.
 */

package DesignPatterns.CreationalPatterns.FactoryPattern;

import DesignPatterns.CreationalPatterns.FactoryPattern.NameModels.FirstNameFirst;
import DesignPatterns.CreationalPatterns.FactoryPattern.NameModels.LastNameFirst;
import DesignPatterns.CreationalPatterns.FactoryPattern.NameModels.Namer;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NameFactoryTest {

    // Note the call to the name factory is the same in both test methods and
    // the factory decides which class to use to create the appropriate object


    @Test
    public void testFirstNameFirst() {
        NameFactory nameFactory = new NameFactory();
        String entry = "David Amateau";
        Namer namer = nameFactory.getNamer(entry);

        assertEquals("David", namer.getFirstName());
        assertEquals("Amateau", namer.getLastName());
        assertTrue(namer instanceof FirstNameFirst);

    }

    @Test
    public void testLastNameFirst() {
        NameFactory nameFactory = new NameFactory();
        String entry = "Amateau, David";
        Namer namer = nameFactory.getNamer(entry);

        assertEquals("David", namer.getFirstName());
        assertEquals("Amateau", namer.getLastName());
        assertTrue(namer instanceof LastNameFirst);
    }

}