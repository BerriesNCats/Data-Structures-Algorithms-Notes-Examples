/*
 * Copyright David Amateau 2021.
 */

package DesignPatterns.CreationalPatterns.FactoryPattern.NameModels;

public class FirstNameFirst extends Namer {

    public FirstNameFirst(String string) {
        int i = string.lastIndexOf(" ");
        if (i > 0) { // there is a space, assume the first name is first
            firstName = string.substring(0, i).trim();
            lastName = string.substring(i + 1).trim();
        } else { // if there is no space, assume their is only a lastname
            firstName = "";
            lastName = string;
        }
    }
}
