package Sorting;

public class Hoarepartition {
    public static void swap(int[]arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static int hoarepartition(int[]arr,int low,int high){
        
        int i=low-1;
        int j=high+1;
        int pivot=arr[low];
        while(true){
            do{i++;}while(arr[i]<pivot);
            do{j--;}while(arr[j]>pivot);
            
             if(i>=j)return j;
            swap(arr, i, j);
        }
    }
    public static void main(String[] args) {
        int[]arr={9,23,24,11,2,5,1,4,3,7,5,1,8};
       System.out.println(hoarepartition(arr, 0,arr.length-1));
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}
