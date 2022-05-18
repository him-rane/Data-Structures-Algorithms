package Hashing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SortArrayAccordingToOther {
    public static int[] sortA1ByA2(int A1[], int N, int A2[], int M)
    {
        //Your code here
        HashMap<Integer,Integer>map = new HashMap<>();
        for(int i:A1){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int[]res=new int [A1.length];
        int idx=0;
        for(int i:A2){
            if(map.containsKey(i)){
                int val=map.get(i);
                while(val>0){
                    res[idx]=i;
                    val--;
                    idx++;
                }
                map.remove(i);
            }
        }
        int pivot=idx;
        for(Map.Entry e:map.entrySet()){
            int val=(int)(e.getValue());
            while(val>0){
                res[idx]=(int)(e.getKey());
                    val--;
                    idx++;
            }
        }
        Arrays.sort(res,pivot,res.length);
        return res;
    }
}
