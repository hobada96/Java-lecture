public class Calculator {
    static int n;
    static int m;

    public static void setBinaryOperands(int i, int i1) {
        Calculator.n = i;
        Calculator.m = i1;
    }

    public static int add() {
        return n+m;
    }
}
