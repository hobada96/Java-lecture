//public class Test {
//    public static void main(String[] args) {
//// String s="홍길동 김철수 이영희 박철수";
//        String s1="홍길동\t 김철수\r\n\t 이영희 박철수";
//        String tokens[]=s1.split("\\s+");
//        for (String v : tokens) {
//            System.out.println(v);
//        }
//    }
//}

public class Test {
    public static void main(String[] args) {
        String s="2015‐12‐26 11:45:27";
        String tokens[]=s.split("-| |:");
        for (String v : tokens) {
            System.out.println(v);
        }
    }
}

//public class Test {
//    public static void main(String[] args) {
//        String v[]={"홍길동","김철수","이영희","박철수","김영희"};
//        for (String s : v) {
//            if(s.matches("^.*철.*$")) System.out.println(s);
// if(s.matches("^이.*")) System.out.println(s);
// if(s.matches("^.*수")) System.out.println(s);
// if(s.matches("[^철영]*")) System.out.println(s);
//        }
//    }
//}

//public class Test {
//    public static void main(String[] args) {
//        String s="김철수 89 이영희 95 박철수 94 김영희 85";
//        s=s.replaceAll("[^\\d]+", " ");
//        s=s.trim();
//        String token[]=s.split("\\s+");
//        for (String v : token) {
//            System.out.println(v);
//        }
//    }
//}