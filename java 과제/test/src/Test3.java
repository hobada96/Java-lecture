import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        try {
            int i = 0;
            Scanner iF = new Scanner(new FileReader("c:/temp/info.txt")); // filereader = 문자 하나 씩 읽음
            while (iF.hasNext()) {
                System.out.println(iF.nextLine());
            }
            iF.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}