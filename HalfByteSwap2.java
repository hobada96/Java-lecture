import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class HalfByteSwap2 {
    public static void main(String[] args) {
        try {
            FileInputStream iF = new FileInputStream(args[0]);
            FileOutputStream oF = new FileOutputStream(args[0]+".enc");
            while (true) {
                int data = iF.read();
                if (data == -1) break;
                String byteData = String.format("%08d", Integer.parseInt(Integer.toBinaryString(data)));
                String saveData;
                saveData = byteData.substring(4, 8) + byteData.substring(0, 4);
                System.out.println(data + " : " + Integer.parseInt(saveData, 2));
                oF.write(Integer.parseInt(saveData, 2));
            }
            iF.close();
            oF.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}