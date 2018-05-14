public class Total {
    static int sum;
    public static void main(String[] args) {
        sum = 0;
        for (int i = 0; i < args.length; i++) {
            sum = sum * Integer.parseInt(args[i]);
        }
        System.out.println(sum);
    }
}