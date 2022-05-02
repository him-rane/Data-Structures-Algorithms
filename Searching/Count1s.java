package Searching;

public class Count1s {
    
    public static void main(String[] args) {
        int[]arr={1,1,1,1,1,1};
        System.out.println(count1s(arr));
    }
    public static int count1s(int[]arr){
        if(arr[arr.length-1]==0)return 0;
        else if(arr[0]==0)return arr.length-1;
        else{
            return arr.length-FirstOccurrence.firstOccurresnce(arr, 1);
        }

    }
}
