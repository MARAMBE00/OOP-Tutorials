package Question_02;

interface Equation {

    public final int numberOfVariables = 1;

    public abstract double solve();

    default void printFormula() {
        System.out.println("x^2 + 3x + 1");
    }

}
