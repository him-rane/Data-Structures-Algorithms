package Hashing;

import java.util.HashSet;

public class CountDistinctElements {
    public static int countDistinct(int[]arr){
        HashSet<Integer>set=new HashSet<>();
        for(int i:arr){
            set.add(i);
        }
        return set.size();
    }
    public static void main(String[] args) {
        int[]arr={2,5,3,1,2,3,5};
        System.out.println(countDistinct(arr));
    }
}
