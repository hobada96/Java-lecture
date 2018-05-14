import java.io.BufferedReader;

public class St {
    public static void main(String[] args) {
        String s1 = "경성대학교";
        String s2 = "대한독립만세";
        String s3 = "KOREA";
//        int score[] = {1, 23, 4, 5, 4, 6, 8};
//        System.out.println(s1.contains("대학교"));

//        System.out.println("1 : " + s1.contains("대학교"));
//        System.out.println("2 : " + s2.startsWith("대한"));
//        System.out.println("3 : " + s2.endsWith("대한"));
//        System.out.println("4 : " + s2.indexOf("독"));
//        System.out.println("5 : " +s2.indexOf("독립"));
//        System.out.println("6 : " +toCharArray(s1).length);
//        for(char ch:toCharArray(s1)){
//            System.out.print(ch);
////        }
//        System.out.println(s1.replace("경성",""));
//        reverse(s1);
//        System.out.println(vowelCount(s3));
        System.out.println(removeVouwel(s3));
    }

    private static String reverse(String s) {
        StringBuilder s1 = new StringBuilder(s);
        System.out.println();
        return s1.reverse().toString();
    }

    private static char[] toCharArray(String s) {
        char ch[] = new char[s.length()];

        for (int i = 0; i < s.length(); i++) {
            ch[i] = s.charAt(i);
        }
        return ch;
    }

    private static int vowelCount(String s) {
        char ch[] = new char[s.length()];
        int num = 0;
        ch = s.toCharArray();
        for (char c : ch) {
            if (c == 'A') num++;
            else if (c == 'E') num++;
            else if (c == 'I') num++;
            else if (c == 'O') num++;
            else if (c == 'U') num++;
        }
        return num;
    }

    private static String removeVouwel(String s) {
        char ch[] = new char[s.length()];
        ch = s.toCharArray();
        int count = 0;
        StringBuilder s3 = new StringBuilder(s);
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == 'A') {
                s3.deleteCharAt(i - count);
                count++;
            }
            if (ch[i] == 'E') {
                s3.deleteCharAt(i - count);
                count++;
            }
            if (ch[i] == 'I') {
                s3.deleteCharAt(i - count);
                count++;
            }
            if (ch[i] == 'O') {
                s3.deleteCharAt(i - count);
                count++;
            }
            if (ch[i] == 'U') {
                s3.deleteCharAt(i - count);
                count++;
            }
        }
        System.out.println(s3);
        return s3.toString();
    }


    private static int last(int i[]) {
        return i[i.length - 1];
    }
}