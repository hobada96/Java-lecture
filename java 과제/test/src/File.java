import javax.swing.*;
import java.io.FileWriter;
import java.io.IOException;

public class File {
    public static void main(String[] args){
        try {
            while(true) {
                String v = JOptionPane.showInputDialog("메모입력");
                if(v == null) break;
                FileWriter w = new FileWriter("C:/Temp/data.txt",true);
                w.write(v + "\n");
                w.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}