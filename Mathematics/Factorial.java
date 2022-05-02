package Mathematics;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(fact(20));
    }
    public static long fact(int n){
        long res=1;
        for(int i=1;i<=n;i++){
            res=res*i;
        }
        return res;
    }
}
