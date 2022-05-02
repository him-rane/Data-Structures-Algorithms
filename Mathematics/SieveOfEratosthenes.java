package Mathematics;

public class SieveOfEratosthenes {
    public static void main(String[] args) {
        sol(10);
    }
    public static void sol(int n){
      boolean[]isPrime=new boolean[n+1];  
      for(int i=2;i<=n;i++){
          if(!isPrime[i]){
            System.out.print(i+" ");
            for(int j=i*i;j<=n;j=j+i)
            isPrime[j]=true;
          }
      }
    }
}
