package Mathematics;

public class TrailingZerosinFactorial {
    public static void main(String[] args) {
        int n=100;
        System.out.println(countZero(n));
    }
    public static int countZero(int n){
        int res=0;
        for(int i=5;i<=n;i=i*5){
            res=res+n/5;
        }
        return res;
    }
}
