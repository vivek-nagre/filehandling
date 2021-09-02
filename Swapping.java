import java.util.Scanner;

public class Swapping {
    public static void main(String[] args) {
        int temp;
        Scanner sc = new Scanner(System.in);
        System.out.println("total number of input:");

        int n = sc.nextInt();
        int[] array = new int[n];
        System.out.println("enter inputs:");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println("our inputs\n");
        for (int i = 0; i < n - 1; i++) {
            System.out.println(array[i] + ",");
        }
        System.out.println(array[array.length - 1]);
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;

                }

            }

        }
        System.out.println("final array after sorting:");
        for (int i = 0; i < n - 1; i++) {
            System.out.println(array[i] + ",");

        }
        System.out.println(array[array.length - 1]);
        int temp1 = 0, f1, f2;
        int index1 = 0, index2 = 0;
        int j1, k;
        System.out.println("\nenter first element to swap:");
        f1 = sc.nextInt();

        System.out.println("\nenter Secound element to swap:");
        f2 = sc.nextInt();
        System.out.println();
        System.out.println(f1);
        System.out.println(f2);
        for (k = 0; k < array.length; k++) {
            if (array[k] == f1) {
                index1 = k;
            }
            for (j1 = 0; j1 < array.length; j1++) {
                if (array[j1] == f2) {
                    index2 = j1;
                }
                temp1 = array[index1];
                array[index1] = array[index2];
                array[index2] = temp1;
            }
        }
                System.out.println("result after swapping the element..");
                for (int i = 0; i < array.length; i++) {
                    System.out.print(array[i] + " ");



            }
        }

    }

