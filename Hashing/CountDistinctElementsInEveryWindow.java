package Hashing;

import java.util.ArrayList;
import java.util.HashMap;

public class CountDistinctElementsInEveryWindow {
    public static ArrayList<Integer> CountDistinct(int[]arr,int k){
        ArrayList<Integer>list=new ArrayList<>();
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<k;i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
        }
        list.add(map.size());

        
        for(int i=k;i<arr.length;i++){
            map.put(arr[i-k], map.get(arr[i-k])-1);
            if(map.get(arr[i-k])==0)map.remove(arr[i-k]);
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
            list.add(map.size());
        }
        return list;
    }
    public static void main(String[] args) {
        int[]arr={10,20,30,40,50,60};
        int k=4;
        System.out.println(CountDistinct(arr, k));
    }
}
