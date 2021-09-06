import java.util.Scanner;
import java.util.Set;
import java.util.Arrays;
import java.util.HashSet;

public class wordcount {
    public static void main(String[] args) {
        Scanner usin = new Scanner(System.in);

        System.out.print("enter your messege:");
        String messge = usin.nextLine();
        String arr[] = messge.split(" ");
        Set<String> items = new HashSet<>(Arrays.asList(messge.split(" ")));
        String[] setArry = items.toArray(new String[items.size()]);
        System.out.println(items.getClass());
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (setArry[i].contains(arr[i])) {
                count+=1;
            }
        }
        
        

    }
}
