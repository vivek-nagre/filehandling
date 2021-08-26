import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.io.Writer;

public class manual_update {
    public static void main(String[] args) {
        System.out.println("vivel");

        try {
            File file=new File("./F1.txt");
            boolean result=file.createNewFile();
            Writer fw=new FileWriter(file);
            if(result){
                
            fw.write("vivek");
            fw.write("suresh");
            fw.write("nagre");
                fw.close();
            System.out.println(fw);
            }
        } catch (IOException e) {
            System.out.println(e);
        }

    }
}
