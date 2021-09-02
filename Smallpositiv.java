import java.util.Scanner;

import java.util.Arrays;

public class Smallpositiv {
    public static void main(String[] args) {
        int  j, check = 1;
        Scanner usin = new Scanner(System.in);

        System.out.print("how many element do u want:");
        int elementNumber = usin.nextInt();
        int[] userarr = new int[elementNumber];
        for (int k = 0; k < userarr.length; k++) {
            userarr[k] = usin.nextInt();
        }
        Arrays.sort(userarr);
        for (j = 0; j < userarr.length; j++) {
            if (userarr[j] <= check) {
                check = userarr[j] + check;

            } else {
                System.out.println("smallest positive initger is:" + check);

            }

        }
        System.out.println("smallest positive int after sorting:" + check);

    }

}