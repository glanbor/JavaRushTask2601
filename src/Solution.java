import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Integer[] a1 = {13,8,15,5,11,18};
        Integer[] a2 = {13,14,15,10,10,12,10,12,13};
        Integer[] a3 = {10,8,12,6,19};
        Integer[] a4 = {11,3,122,36,18,0,1};
        Integer[] b1 = sort(a2);
        for (int i = 0; i < b1.length; i++) {
            System.out.println(b1[i]);
        }
    }
    public static Integer[] sort (Integer[] array) {
        double finalMedian = 0;
        List<Integer> one = new ArrayList<>(Arrays.asList(array));
        Collections.sort(one);
        if (one.size() % 2 != 0) {
            double half = one.size() / 2;
            System.out.println(half);
            finalMedian = one.get((int) (half));
        }
        else {
            int half = one.get(one.size() / 2);
            System.out.println(half);
            finalMedian = (one.get(one.size() / 2) + one.get(one.size() / 2 - 1)) / 2;
        }
        System.out.println(finalMedian);
        double finalMedian1 = finalMedian;
    //    one.sort((a, b) -> (int) (Math.abs(a - finalMedian1) - Math.abs(b - finalMedian1)));
   //     Collections.sort(one, Comparator.comparingDouble(value -> Math.abs(finalMedian1 - value)));
        Collections.sort(one, (o1, o2) -> {
            double v1 = o1.doubleValue() - finalMedian1;
            double v2 = o2.doubleValue() - finalMedian1;
            return (int) (v1-v2);
        });
       return one.toArray(new Integer[0]);
    }
}
