package Mathematics;

public class CountDigits {
    public static void main(String[] args) {

        System.out.println(countDigits(16));
    }
    public static int countDigits(int n){
        if(n==0)return 1;
        int count=0;
        while(n>0){
            count++;
            n/=10;
        }
        return count;
    }
}
