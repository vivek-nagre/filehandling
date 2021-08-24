import java.util.Scanner;

public class console_del {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("name\t|\tage\t|\tcity\t|");
        // System.out.println("_______________________________________");
        System.out.println("\n---------------------------------------");
        for (int i = 0; i < 2; i++) {

            String name = sc.next();
            System.out.print("\t" + name + "\t|");

            int age = sc.nextInt();
            System.out.print("\t" + age + "\t|");

            String city = sc.nextLine();
            System.out.print("\t" + city + "\t|");

        }
    }
}
