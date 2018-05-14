public class KorNameUtil {
    public static String name[];
    public static KorName Krn[];

    public static KorName[] getKorNames(String s) {
        name = s.split(":");
        KorName Krn[] = new KorName[s.length()];
        for (int i = 0; i < name.length; i++){
            Krn[i].getFirstSyllable(name[i]);
            Krn[i].getSecondSyllable(name[i]);
            Krn[i].getThirdSyllable(name[i]);
        }
        return Krn;
    }
}