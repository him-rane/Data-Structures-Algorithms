package Hashing;

import java.util.HashMap;
import java.util.Map;

//print the elements which have more then n/k occurances
public class Occurences {
    public static void method1(int[]arr,int n,int k){
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i:arr){
            map.put(i, map.getOrDefault(i, 0)+1);
        }
        for(Map.Entry mapElement:map.entrySet()){
            int temp=(int)(mapElement.getValue());
            if(temp>n/k)System.out.println(mapElement.getKey());
        }
            
    }
}
