public class Tets1 {
    public static void main(String[] args) {
//        String st[];
//        st = new String[1];
//        st[0] = "Seoul";
//        //String st[] = {"Seoul"};
//        AtomicInteger a = new AtomicInteger();
//        a.value = 99;
//        System.out.println(a.value);
//        AtomicInteger b[] = new AtomicInteger[1];
////        b[0] = a;
//        System.out.println(Num.div(3, 5));
//        int x[]={1,1,1};
//        int y[]={2,2,2,2,2};
//        int z[]=NumberTool.add(x,y); // 3,3,3,2,2이 저장된 배열이 반환됨
//        for(int v : z) {
//            System.out.println(v);
//        }
//    }
//        Robot r=new Robot("R-001", new Location(150, 270));
//        System.out.println(r.id +""+ r.location.x + "" +r.location.y);

        String	s="김철수:이영희:박동수:김정희"; // 예시임. 이름 개수를 4로 한정하지 말 것
        KorName	names[]=KorNameUtil.getKorNames(s);
        System.out.println(names[1].firstSyllable+"-"+names[1].secondSyllable+"-"+names[1].thirdSyllable);

    }
}

