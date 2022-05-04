package Hashing;

import java.util.HashSet;

public class UnionOfTwoArrays {
    public static int unionOfTwoArrays(int[]a,int[]b){
        HashSet<Integer>set=new HashSet<>();
        for(int e:a){
            set.add(e);
        }
        for(int e:b){
            set.add(e);
        }
        return set.size();
    }
    public static void main(String[] args) {
        int[]a={1,2,4,4,4,3,3,3,3,3};
        int[]b={2,2,2,4,3,3,3,3};
        int res=unionOfTwoArrays(a, b);
        System.out.println(res);
    }
}
