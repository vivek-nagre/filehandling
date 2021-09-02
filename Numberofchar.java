import java.util.Scanner;

public class Numberofchar {
    static final int limit = 256;

    public static void main(String[] args) {

        Scanner usin = new Scanner(System.in);
        System.out.print("enter your messege: ");
        String messege = usin.nextLine();
        int count[] = new int[limit];
        for (int i = 0; i < messege.length(); i++) {
            count[messege.charAt(i)]++;
            char ch[] = new char[messege.length()];

            for (int j = 0; j < ch.length; j++) {
                ch[j] = messege.charAt(j);
                int found = 0;

                for (int k = 0; k < ch.length; k++) {
                    if (messege.charAt(k) == ch[k]) {
                        found += 1;
                    }
                }

                if (found == 1) {

                    System.out.println(messege.charAt(i) + "\t" + count[messege.charAt(i)]);

                }
            }
        }

    }
}
