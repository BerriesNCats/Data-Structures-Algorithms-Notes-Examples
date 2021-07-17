package EffectiveJava;

public class NonInstantiableUtility {

    /**
     * A private constructor that simply throws an error insures that a utility class cannot be
     * instantiated even within it's own class.
     */
    private NonInstantiableUtility() {
        throw new AssertionError();
    }
}
