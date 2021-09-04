import java.util.Scanner;
import java.util.HashMap;
import java.util.TreeSet;
import java.util.Arrays;

public class TV {
    public static void main(String[] args) {
        Scanner usin = new Scanner(System.in);
        HashMap<String, TreeSet<String>> tvnetworks = new HashMap<String, TreeSet<String>>();
        for (int i = 0; i < 4; i++) {
            System.out.print("enter channal name:");
            String channel = usin.next();
            

            System.out.print("enter tv show name:");
            String show = usin.next();

            if ((tvnetworks.containsKey(channel))) {
                TreeSet<String> addshow = tvnetworks.get(channel);
                addshow.add(show);
                tvnetworks.put(channel, addshow);
            }
            else{
              
                tvnetworks.put(channel, new TreeSet<String>(Arrays.asList(new String[]{show})));
            }
        }
        System.out.println(tvnetworks);
    }

}
