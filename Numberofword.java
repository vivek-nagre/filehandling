import java.util.Scanner;

public class Numberofword {
public static void main(String[] args) {
    Scanner usin= new Scanner(System.in);
    String str;
    int arrlength;
    System.out.print("enter your messege:");
        str=usin.nextLine();
        String str_arr[]=str.split(" ");
        arrlength=str_arr.length;
        int wrdlen[]=new int[arrlength];
        for (int i = 0; i < arrlength; i++) {
            wrdlen[i]=str_arr[i].length();

        }
        for (int i = 0; i < arrlength; i++) {
            System.out.println(" "+wrdlen[i]);

        }
        int max=wrdlen[0];
        for (int i = 0; i < wrdlen.length; i++) {
            if (wrdlen[i]>max) {
                max=wrdlen[i];
            }
            int resultArray[]=new int[max];
            System.out.println("result set is:");
            for (i = 0; i <max ; i++) {
                int count=0;
                for (int j = 0; j < wrdlen.length; j++) {
                    if (i==wrdlen[j]) {
                        count++;
                        
                    }
                    else{
                        resultArray[i]=count;
                    }

                }
            }
            for (i = 0; i < resultArray.length; i++) {
                System.out.println(" "+resultArray[i]);
            }

        }

}    

}
