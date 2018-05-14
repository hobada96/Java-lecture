import java.io.BufferedReader;
import java.io.*;

public class OddNumbers {
    public static int[] generate(int Max) {
        int[] odd = new int[Max];
        for (int i = 0; i < Max ; i++) {
            odd[i] = 2 * i + 1;
        }
        return odd;
    }
}
