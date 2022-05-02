package Sorting;

public class MergeTwoSortedArrays {
    public static void main(String[] args) {
        int[]arr1={3,5,7,9};
        int[]arr2={1,2,4,6,8,12};
        mergeTwoSortedArrays(arr1, arr2);
    }
    public static void mergeTwoSortedArrays(int[]arr1,int[]arr2){
        int  i=0,j=0;
        while(i<arr1.length && j<arr2.length){
            if(arr1[i]<=arr2[j])System.out.println(arr1[i++]);
            else System.out.println(arr2[j++]);
        }
        while(i<arr1.length){
            System.out.println(arr1[i++]);
        }
        while(j<arr2.length){
            System.out.println(arr2[j++]);
        }
    }
}
