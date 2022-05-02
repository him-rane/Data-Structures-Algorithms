package Sorting;

public class SortThreeTypesOfElements {
    public static void swap(int[]arr,int i,int j){
        int temp=arr[j];
        arr[j]=arr[i];
        arr[i]=temp;
    }
    public static void sortPosNegZero(int[]arr){
        int i=0,j=0,k=arr.length-1;
        while(j<k){
            if(arr[j]<0){
                swap(arr, i, j);
                i++;
                j++;
            }else if(arr[j]>0){
                swap(arr, k, j);
                k--;
            }else j++;
        }
    }
    public static void main(String[] args) {
        int[]arr={0,0,1,-2,0,-3,4,-5,-6,7,0,8,9,-5};
        sortPosNegZero(arr);
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}
