public class NumberTool {
    private static int[] c;

    public static int[] add(int[] x, int[] y) {
        if (x.length > y.length) {
            c = x;
            for (int i = 0; i < x.length; i++) {
                c[i] = y[i] + x[i];
            }
        } else if (x.length < y.length) {
            c = y;
            for (int i = 0; i < x.length; i++) {
                c[i] = y[i] + x[i];
            }
        }
        return c;
    }
}
