import java.io.*;
import java.util.Scanner;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.FileReader;

public class assignment_read {
    public static void main(String[] args) {
        File file = new File("./vivek.txt");
        Scanner sc = new Scanner(System.in);

        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String st;

            // while (st!=null)
            while ((st = br.readLine()) != null) {
                System.out.println(st);
            }

            System.out.println();
            System.out.println();
            System.out.print("enter the record you want to change:");
            int update = sc.nextInt();

            String fileNo = Files.readAllLines(Paths.get("./vivek.txt")).get(update + 1);
            System.out.print("enter your cureent data :");
            String current_data=sc.next();
            System.out.print("enter your modification:");
            String modification=sc.next();
            System.out.println(fileNo.replace(current_data, modification));


 

        } catch (IOException e) {
            System.out.println(e);
        }

    }

}