public class KorName {
    public static char firstSyllable;
    public static char secondSyllable;
    public static char thirdSyllable;


    public static char getFirstSyllable(String s) {
        firstSyllable = s.charAt(0);
        return firstSyllable;
    }


    public static char getSecondSyllable(String s) {
        secondSyllable = s.charAt(1);
        return firstSyllable;
    }

    public static char getThirdSyllable(String s) {
        thirdSyllable = s.charAt(2);
        return firstSyllable;
    }
}
