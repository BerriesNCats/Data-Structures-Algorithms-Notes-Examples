package EffectiveJava.EdsonYanagaRevisited;

import com.google.common.base.MoreObjects;

import java.util.Comparator;
import java.util.Formattable;
import java.util.Formatter;
import java.util.Objects;

import static com.google.common.base.Preconditions.checkArgument;

/**
 * Minimize mutability
 */
public class PhoneNumber implements Formattable, Comparable<PhoneNumber> {

    // properties are declared private and final
    private final int areaCode;
    private final int number;

    // private constructor
    private PhoneNumber(int areaCode, int number) {
        this.areaCode = areaCode;
        this.number = number;
    }

    // static factory method
    public static PhoneNumber of(int areaCode, int number) {
        // Check Arguments comes from the Guava library
            // Throws IllegalArgumentException if boolean returns false
        checkArgument(areaCode > 100);
        checkArgument(number > 1000);
        return new PhoneNumber(areaCode, number);
    }

    @Override
    public boolean equals(Object object) {
        if (object instanceof PhoneNumber) {
            PhoneNumber other = (PhoneNumber) object;
            return Objects.equals(this.areaCode, other.areaCode) &&
                    Objects.equals(this.number, other.number);
        }
        return false;
    }

    public int getNumber() { return this.number; }
    public int getAreaCode() { return this.areaCode; }

    @Override
    public int hashCode() {
        return Objects.hash(this.areaCode, this.number);
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("areaCode", areaCode)
                .add("number", number)
                .toString();
    }

    @Override
    public void formatTo(Formatter formatter, int flags, int width, int precision) {
        formatter.format("%d-%d", areaCode, number);
    }

    @Override
    public int compareTo(PhoneNumber phoneNumber) {
        return Comparator.comparingInt((PhoneNumber p) -> p.areaCode)
                .thenComparingInt(p -> p.number)
                .compare(this, phoneNumber);
    }

    public static void main(String[] args) {
        System.out.println(PhoneNumber.of(200, 2000));
    }
}
