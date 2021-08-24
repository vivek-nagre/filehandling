import java.io.File;
import java.io.IOException;

public class creation {
    public static void main(String[] args) {
        File file = new File("./vivek.txt");
        try {
            FileWriter pw = new FileWriter(file);
            pw.append("vivek");

            boolean result = file.createNewFile();

            if (result) {
                // pw.println("name\t|\tage|\tcity|");

                pw.write("vivek");
                pw.close();
                System.out.println("execution done successfully");
            }

            System.out.println("file is  :" + file.getName());

            // basic method in file give imporatanat information
            // System.out.println("file is :"+file.getCanonicalPath());
            // System.out.println("file is readeable:"+file.canRead());
            // System.out.println("file is writble:"+file.canWrite());
            // System.out.println("file is exixt:"+file.exists());
            // System.out.println("file is exicutable:"+file.canExecute());

        } catch (IOException e) {
            System.out.println(e);
        }
        System.out.println("success");

    }

}