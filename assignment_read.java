import java.io.*;
import java.io.IOException;
import java.io.FileReader;
public class assignment_read {
public static void main(String[] args) {
    File file=new File("./vivek.txt");

    try {
        BufferedReader br = new BufferedReader(new FileReader(file));
        String st;

        // while (st!=null) 
        while ((st = br.readLine()) != null)
        {
            System.out.println(st);
            
        }
    } catch (IOException e) {
        System.out.println(e);
    }

}
    
}