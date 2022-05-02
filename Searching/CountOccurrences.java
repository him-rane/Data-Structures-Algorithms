package Searching;

public class CountOccurrences {
    
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5,7,8,9,};
        int x=2;
        System.out.println(countOccurrences(arr, x));
    }
    public static int countOccurrences(int[]arr,int x){
           int firstOccurresnce= FirstOccurrence.firstOccurresnce(arr, x);
           if(firstOccurresnce==-1)return 0;
           else return LastOccurrence.lastOccurrence(arr, x)-firstOccurresnce+1;
    }
}
