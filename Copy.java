import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Copy {
    public static void main(String args[]) {
        try {
            long startTime = System.currentTimeMillis();
			FileInputStream iF = new FileInputStream(args[0]);
			FileOutputStream oF = new FileOutputStream(args[0] + ".copy");
            while(true) {
                int data = iF.read();
                if(data == -1 ) break;
                oF.write(data);
            }
            iF.close();
            oF.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}