package Hashing;

import java.util.HashMap;

public class isEqualArrays {
    public static boolean check(long A[],long B[],int N)
    {
        //Your code here
        HashMap<Long,Long>map=new HashMap<>();
        for(long i:A){
            map.put(i,map.getOrDefault(i,(long)0)+(long)1);
        }
        for(long i:B){
            if(map.size()==0)return false;
            if(map.containsKey(i)){
                map.put(i,map.get(i)-1);
                if(map.get(i)==0)map.remove(i);
            }else return false;
            
            
        }
        if(map.size()>0)return false;
        return true;
    }
    public static void main(String[] args) {
        long[]A={1,4,2,3,4,5};
        long[]B={3,2,1,5,4,5};
        check(A, B, A.length);
    }
}

