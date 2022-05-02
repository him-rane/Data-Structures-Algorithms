package Sorting;

public class MergeFunction {
    public static void main(String[] args) {
        int[]arr={1,2,3,10,15,20,40,8,11,55,60,70};
        mergeFunction(arr,3,6,9);
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
    
    public static void mergeFunction(int[]arr,int low,int mid,int high){
        int n1=mid-low+1;
        int n2=high-mid;
        int[]left=new int[n1];
        int[]right=new int[n2];

        for(int i=0;i<n1;i++){
            left[i]=arr[low+i];
        }
        for(int i=0;i<n2;i++){
            right[i]=arr[mid+1+i];
        }

        int i=0;
        int j=0;
        int k=low;
        while(i<n1 && j<n2){
            if(left[i]<=right[j])arr[k++]=left[i++];
            else arr[k++]=right[j++];
        }
        while(i<n1)arr[k++]=left[i++];
        while(j<n2)arr[k++]=right[j++];
    }
}
