import java.util.Scanner;

public class ST2 {
    public static void main(String[] args) {
        String s = "2017-03-28 09:12:54";
//        int a[] = datetime(s);
//        for(int i : a){
//        String x = "100";
//        String y = "200";
//        System.out.println(Integer.parseInt(x)+Integer.parseInt(y));
        System.out.println(s.indexOf('a'));
        StringBuilder st = new StringBuilder(s);
        System.out.println();
    }


    private static int[] datetime(String s) {
        String st[] = new String[s.length()];
        int it[] = new int[6];

        st = s.split("-| |:");
        for(int i = 0 ; i < it.length;i++){
            it[i] = Integer.valueOf(st[i]);
        }
        return it;
    }

}