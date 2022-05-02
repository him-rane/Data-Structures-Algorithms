package Mathematics;
public class GPTerm {
    public static void main(String[] args) {
        
    }
    public static double nthGPTerm(int A, int B ,int N){
        double r=(double)B/(double)A;
        double res=A*(Math.pow(r,N-1));
        return res;
    }
}
