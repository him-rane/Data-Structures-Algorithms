package Mathematics;

public class AllDivisorsNumber {
    public static void main(String[] args) {
        allDivisor(25);
    }
    public static void allDivisor(int n){
        for(int i=1;i*i<=n;i++){
            if(n%i==0){
                System.out.print(i+" ");
                if(i!=(n/i))
                System.out.print(n/i+" ");
            }
            
        }
    }
}
