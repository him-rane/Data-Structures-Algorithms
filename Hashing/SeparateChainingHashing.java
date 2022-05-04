package Hashing;

import java.util.ArrayList;

public class SeparateChainingHashing {
    public static ArrayList<ArrayList<Integer>> separateChaining(int arr[], int n, int hashSize)
    {
        //Your code here
        ArrayList<ArrayList<Integer>>map=new ArrayList<>();
        for(int i=0;i<hashSize;i++){
            map.add(new ArrayList<Integer>());
        }
        for(int i=0;i<n;i++){
            map.get(arr[i]%hashSize).add(arr[i]);
        }
        return map;
    }
    public static void main(String[] args) {
        int[]arr={92,4,14,24,44,91,10,18,18,39};
        int n=arr.length;
        int hashSize=10;
        System.out.println(separateChaining(arr, n, hashSize));
        
    }
}
