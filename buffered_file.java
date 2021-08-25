import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.io.Writer;

public class buffered_file {
    public static void main(String[] args) {
        File f = new File("./f1.txt");
        try {
            boolean result = f.createNewFile();
            if (result) {
                System.out.println("file created");

            }
            Writer pw = new FileWriter("./f1.txt");
            pw.write("gokul is a choclate  boy");
            pw.close();
        } catch (IOException e) {
            System.out.println("reason:" + e);
        }
    }
}
