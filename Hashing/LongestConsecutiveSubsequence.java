package Hashing;

import java.util.HashSet;

public class LongestConsecutiveSubsequence {
    public static int longestConsecutiveSubsequence(int[]arr){
        HashSet<Integer>set=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            set.add(arr[i]);
        }
        int res=0;
        for(int i=0;i<arr.length;i++){
            if(!set.contains(arr[i]-1)){
                int count=0;
                while(set.contains(arr[i]+count))count++;
                res=Math.max(res, count);
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[]arr={9,10,2,1,7,1,4,3,6,8};
        System.out.println(longestConsecutiveSubsequence(arr));

    }
}
