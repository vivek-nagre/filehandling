import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
public class update {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("hashmap contaion key as unique number and value as list wich contaion important data");
        ArrayList<String> value_list = new ArrayList<>();

        HashMap<Integer, List<String>> keyV = new HashMap<>();
        List<String> list1 = new ArrayList<String>();
        for (int i = 1; i <= 2; i++) {
            System.out.print("name:");
            String name=sc.next();
            System.out.print("age:");
            String age=sc.next();
            System.out.print("City:");
            String city=sc.next();
            list1.add(name);
            list1.add(age);
            list1.add(city);
            keyV.put(i, list1);
            System.out.println();
            
        }
        System.out.println(keyV);





        // System.out.println(keyV.get(1).get(0).replace("target", "replacement"));

        // System.out.println(keyV);

    }

}