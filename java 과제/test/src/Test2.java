import javax.swing.*;
import java.io.FileWriter;
import java.io.IOException;

public class Test2 {
    public static void main(String[] args) {
        try {
            FileWriter w = new FileWriter("C:/Temp/memo.txt", true); // append 값이 없으면 default 값이 false
            while(true) {
                String v = JOptionPane.showInputDialog("메모 입력 :");
                if(v == null) break;
                w.write(v + "\n");
            }
            w.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}