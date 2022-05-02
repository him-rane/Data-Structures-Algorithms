package BitMagic;

public class OneOddOccurring {
    public static void main(String[] args) {
        int[]arr={1,1,1,6,2,2,3,3,4,4,5,6,5};
        System.out.println(oneOddOccuring(arr));
    }
    public static int oneOddOccuring(int[]arr){
        int res=arr[0];
        for(int i=1;i<arr.length;i++){
            res=res^arr[i];
        }
        return res;

    }
}
