import java.util.Scanner;
import java.io.Writer;
import java.io.FileWriter;
import java.io.IOException;

public class fileW {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        try {
            Writer pw = new FileWriter("./vivek.txt");
            int counter = 0;
            pw.write("NMAE\t|\tAge\t\t|\tCity\t|");
            pw.write("\n------------------------------------------------------");

            // String name = sc.next();
            // int age = sc.nextInt();
            // String city = sc.next();
            for (int i = 0; i < 5; i++) {
                System.out.print("name:");
                String name = sc.next();
                System.out.print("age:");
                int age = sc.nextInt();
                System.out.print("city:");
                String city = sc.next();
                System.out.println();
                
                pw.write("\n" + name + "\t|");
                pw.write("\t" + age + "\t\t|");
                pw.write("\t" + city + "\t\t|");
            }


            pw.close();
            System.out.println("written");

        } catch (IOException e) {
            System.out.println(e);

        }

    }
}
