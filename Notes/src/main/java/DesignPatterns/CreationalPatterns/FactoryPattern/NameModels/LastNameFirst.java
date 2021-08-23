/*
 * Copyright David Amateau 2021.
 */

package DesignPatterns.CreationalPatterns.FactoryPattern.NameModels;

public class LastNameFirst extends Namer {

    public LastNameFirst(String string) {
        int i = string.indexOf(",");
        if (i > 0) { // If comma present split name based on comma
            lastName = string.substring(0, i).trim();
            firstName = string.substring(i + 1).trim();
        } else { // If comma isn't present assume there is only last name
            lastName = string;
            firstName = "";
        }
    }
}
