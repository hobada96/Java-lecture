import java.io.FileWriter;
import java.io.IOException;

public class LineAdd {
    public static void main(String[] args) {
        try {
            FileWriter fr = new FileWriter(args[0], true); //File discript 생성.
            for (int i = 1; i < args.length; i++) {
                fr.write(args[i]);
            }
            fr.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}