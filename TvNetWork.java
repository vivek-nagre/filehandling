import java.util.*;

public class TvNetWork {
    public static void sortbykey() {

    }

    public static void main(String[] args) {
        Scanner usin=new Scanner(System.in);
        HashMap<String, TreeSet<String>> networkMap = new HashMap<String, TreeSet<String>>();
        String[] array12 = { "The simpson", "abc" };
        String[] array13 = { "abc", "xyz" };
        networkMap.put("fox",new TreeSet<String>(Arrays.asList(array12)));
        networkMap.put("NBC",new TreeSet<String>(Arrays.asList(array13)));
        System.out.println(networkMap);
        for (int i = 0; i < 4; i++) {
            System.out.print("enter tv network:");
            String tvnetwork=usin.next();
            
            System.out.print("enter tv Show:");
            String tvShow=usin.next();
            String[] arr;
            if (networkMap.containsKey(tvnetwork)) {
                System.out.println(networkMap.containsKey(tvnetwork));
                TreeSet<String> data=networkMap.get(tvnetwork);
                data.add(tvShow);
                System.out.println(networkMap);
            }
            else{
                System.out.println("new kwy");
                networkMap.put(tvnetwork, new TreeSet<String>(Arrays.asList(new String[]{tvShow})));
                System.out.println(networkMap);
            }
            System.out.println("the set is:"+networkMap.keySet());
            List<String> sortkey=new ArrayList<>(networkMap.keySet());
            Collections.sort(sortkey);
            System.out.println(sortkey);
            System.out.println("enter tvshow:");
            String s=usin.next();
            Set<String> result=new HashSet<>();
            if(networkMap.containsKey(s)){

            }
        }
    }
}
