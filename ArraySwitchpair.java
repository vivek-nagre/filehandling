import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ArraySwitchpair {
    public static void main(String[] args) {
        List <String> arrylist=Arrays.asList("one","two","three","four","five","six","seven","eight","nine","ten");
        for (int i = 0; i < arrylist.size(); i+=2) {
            Collections.swap(arrylist, i, i+1);
        }
        System.out.println(arrylist);
    }
}
