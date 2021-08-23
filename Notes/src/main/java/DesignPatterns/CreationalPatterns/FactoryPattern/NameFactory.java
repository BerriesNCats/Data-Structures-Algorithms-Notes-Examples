package DesignPatterns.CreationalPatterns.FactoryPattern;


import DesignPatterns.CreationalPatterns.FactoryPattern.NameModels.FirstNameFirst;
import DesignPatterns.CreationalPatterns.FactoryPattern.NameModels.LastNameFirst;
import DesignPatterns.CreationalPatterns.FactoryPattern.NameModels.Namer;

public class NameFactory {

    // returns an instance of LastNameFirst or FirstNameFirst depending on whether or not the
    // string contains a comma which is how we discern which order the names are in
    // No comma = First Name First
    // Comma = Last Name First
    public Namer getNamer(String entry) {
        int i = entry.indexOf(",");
        if (i > 0) return new LastNameFirst(entry);
        else return new FirstNameFirst(entry);
    }
}
