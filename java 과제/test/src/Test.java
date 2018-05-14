import java.io.FileWriter;
import java.io.IOException;

public class Test {
    public static void main(String[] args) {
        try {
            FileWriter w = new FileWriter("C:/Temp/info.txt");
            w.write("빼앗긴\r\n들에도\r\n봄은\r\n오는가\r\n");
            w.close(); // close를 꼭 해야함 가끔 되는 경우는 버퍼의 크기를 다 채워서 자동으로 저장이 되어서 그런 것.
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
