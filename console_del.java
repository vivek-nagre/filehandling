import java.util.Scanner;

public class console_del {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
         String name = sc.next();
         int age = sc.nextInt();
         String city = sc.next();
        
        System.out.print("name\t|\tage\t|\tcity\t|");
        // System.out.println("_______________________________________");
        System.out.println("\n---------------------------------------");
        for (int i = 0; i < 1; i++) {

            // String name = sc.next();
            // int age = sc.nextInt();
            // String city = sc.next();
            
            System.out.print(name + "\t|");

            System.out.print("\t" + age + "\t|");

            System.out.print("\t" + city + "\t|");

        }
    }
}
