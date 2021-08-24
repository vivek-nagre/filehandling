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
            pw.write("Sr_NO\t|NMAE\t|\tAge\t\t|\tCity\t|");
            pw.write("\n------------------------------------------------------");
            for (int i = 1; i < 6; i++) {
                // take input form user 
                System.out.print("name:");
                String name = sc.next();
                System.out.print("age:");
                int age = sc.nextInt();
                System.out.print("city:");
                String city = sc.next();

                System.out.println();
                // load user input in the file with | delimetor 
                pw.write("\n"+i+ "\t|");
                pw.write("\t"+name + "\t|");
                pw.write("\t" + age + "\t\t|");
                pw.write("\t" + city + "\t|");
            }


            pw.close();
            System.out.println("written");

        } catch (IOException e) {
            System.out.println(e);

        }

    }
}
