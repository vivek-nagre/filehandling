import java.io.File;
import java.io.IOException;

public class creation {
    public static void main(String[] args) {
        File file = new File("./vivek.txt");
        if (file.isFile()) {
            System.out.println("file alredy presnt");
        } else {
            System.out.println("file not found");

        }

        try {
            boolean result = file.createNewFile();

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

    }

}