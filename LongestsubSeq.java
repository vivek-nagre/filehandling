import java.util.HashSet;
public class LongestsubSeq {
    public static void main(String[] args) {
        int[] a={3,9,6,1,10,4,20,2,5};
        HashSet <Integer> has=new HashSet<>();
        for (int i = 0; i < a.length; i++) {
            has.add(a[i]);
        }
        int LongsubSeq=0;
        for (int i = 0; i < a.length; i++) {
            if (!has.contains(a[i]-1)) {
                int number=a[i];
                while (has.contains(number)) {
                    number++;

                }
                if (LongsubSeq<number-a[i]) {
                    LongsubSeq=number-a[i];
                }
            }

        }
        System.out.println("logest subsesequence within the array is:"+LongsubSeq);

    }
}
