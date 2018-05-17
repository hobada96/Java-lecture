import java.io.FileInputStream;

public class Main {
    public static void main(String[] args) {
        try {
            FileInputStream is=new FileInputStream(args[0]);
            int count = 1;
            while(true){
                int data=is.read();
                if(data==-1) break;
                byte byteData=(byte) data ;
                System.out.printf("%02X ", byteData);
                if(count % 8 == 0) System.out.println();
                count++;
            }
            is.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}