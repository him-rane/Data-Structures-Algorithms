package Hashing;

import java.util.HashSet;

public class IntersectionOfTwoArrays {
    public static int intersectionOfTwoArrays(int[]a,int[]b){
        HashSet<Integer>set=new HashSet<>();
        for(int e:a){
            set.add(e);
        }
        int res=0;
        for(int e:b){
            if(set.contains(e)){
                res++;
                set.remove(e);
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[]a={1,2,4,4,4,3,3,3,3,3};
        int[]b={2,2,2,4,3,3,3,3};
        int res=intersectionOfTwoArrays(a, b);
        System.out.println(res);

    }
}
