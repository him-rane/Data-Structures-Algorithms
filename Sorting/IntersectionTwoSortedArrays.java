package Sorting;

public class IntersectionTwoSortedArrays {
    public static void main(String[] args) {
        int[]arr1={1,1,6,9,23,23,23,28};
        int[]arr2={1,6,8,9,12,18,23,24,24};
        intersection(arr1, arr2);
    }
    public static void intersection(int[]arr1,int[]arr2){
        int i=0;
        int j=0;
        while(i<arr1.length && j<arr2.length){
            if(arr1[i]==arr2[j]){
                System.out.println(arr1[i]);
                i++;j++;
            }
            else if(arr1[i]<arr2[j])i++;
            else j++;
        }
    }
}
