package DesignPatterns.Temp.Delegation;

/**
 * This program simply shows the control flow of delegation.
 *   It looks like when we call the print method on printer, that printer prints to the screen.
 *   But in reality it delegates its behavior to the real printer. This is the concept of
 *   delegation.
 */


class RealPrinter {
    // This is the 'delegate'
    void print() {
        System.out.println("I am the real printer who can actually print to the screen.");
    }
}

class Printer {
    // This is the 'delegator'
    RealPrinter realPrinter = new RealPrinter();

    void print() {
        // This is how we delegate that printer calls the real printer. The responsibility is
        // given to the real printer from the printer
        realPrinter.print();
    }
}

public class Delegation {
    public static void main(String[] args) {
        Printer printer = new Printer();
        printer.print();
    }
}
