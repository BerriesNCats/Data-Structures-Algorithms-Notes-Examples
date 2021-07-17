package EffectiveJava.Immutable;

/**
 * 1. Don't provide methods that modify the object's state
 * 2. Ensure that the class cannot be extended
 * 3. Make all fields final
 * 4. Make all fields private
 * 5. Ensure exclusive access to any mutable components.
 */
// The class is declared final rendering unable to be extended
public final class Complex {

    // Instance fields are declared private and final
    private final double realPart;
    private final double imaginaryPart;

    public Complex(double realPart, double imaginaryPart) {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    public double getRealPart() { return realPart; }
    public double getImaginaryPart() { return imaginaryPart; }

    // Methods do not modify the object passed in but instead return a new object
    public Complex plus(Complex complex) {
        return new Complex(realPart + complex.getRealPart(),
                imaginaryPart + complex.getImaginaryPart());
    }

    public Complex minus(Complex complex) {
        return new Complex(realPart - complex.getRealPart(),
                imaginaryPart - complex.getImaginaryPart());
    }

    public Complex times(Complex complex) {
        return new Complex(realPart * complex.getRealPart() - imaginaryPart * complex.getImaginaryPart(),
                realPart * complex.getImaginaryPart() + imaginaryPart * complex.getRealPart());
    }
    public Complex dividedBy(Complex complex) {
        double temp = complex.getRealPart() * complex.getRealPart() + complex.getImaginaryPart() * complex.getImaginaryPart();
        return new Complex((realPart * complex.getRealPart() + imaginaryPart * complex.getImaginaryPart()) / temp,
                (imaginaryPart * complex.getRealPart() - realPart * complex.getImaginaryPart()) / temp);
    }
    @Override public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Complex))
            return false;
        Complex c = (Complex) o;
        return Double.compare(c.getRealPart(), realPart) == 0
                && Double.compare(c.getImaginaryPart(), imaginaryPart) == 0;
    }
    @Override public int hashCode() {
        return 31 * Double.hashCode(realPart) + Double.hashCode(imaginaryPart);
    }
    @Override public String toString() {
        return "(" + realPart + " + " + imaginaryPart + "i)";
    }
}
