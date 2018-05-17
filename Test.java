import javax.swing.*;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

public class	Test	{
    public static void	main(String[]	args)	{
        try	{
            long curTime=System.currentTimeMillis();
            Date date=new	Date(curTime);
            SimpleDateFormat sdf=new SimpleDateFormat("yyyy‐MM‐dd HH:mm:ss (E)");
            String datetime=sdf.format(date);
            FileWriter w = new FileWriter("C:/Temp/memo.txt");
            String v = JOptionPane.showInputDialog("메모 입력:");
            w.write(v + "\t" + datetime);
            w.close();
        }	catch	(Exception	e)	{
            System.out.println(e.getMessage());
        }
    }
}