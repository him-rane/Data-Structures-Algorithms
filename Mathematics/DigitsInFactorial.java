package Mathematics;

public class DigitsInFactorial {
    public static void main(String[] args) {
        System.out.println(countDigitsFact(100000));
    }
    public static int countDigitsFact(int n){
        if(n<=0)return 0;
        if(n==1)return 1;
        double res=0;
        for(int i=2;i<=n;i++){
            res=res+Math.log10(i);
        }
        return (int)Math.floor(res)+1;
    }
}
