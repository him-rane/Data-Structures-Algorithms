package Hashing;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfArrayElement {
    public static void frequencyOfArrayElement(int[]arr){
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i:arr){
            map.put(i, map.getOrDefault(i, 0)+1);
        }
        for(Map.Entry mapElement:map.entrySet()){
            System.out.println(mapElement.getKey()+" = "+mapElement.getValue());
        }
        
    }
    public static void main(String[] args) {
        int[]arr={1,3,1};
        frequencyOfArrayElement(arr);
    }
}
