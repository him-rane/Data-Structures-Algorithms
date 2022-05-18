package String;

public class LexicographicRank {
    static int fact(int n) { 
    return (n <= 1) ? 1 : n * fact(n - 1); 
    } 

    public static int lexicographicRank(String str){
        int res=1;
        int n=str.length();
        int nFact=fact(n);

        int[]map=new int[256];
        for(int i=0;i<n;i++){
            map[str.charAt(i)]++;
        }

        for(int i=1;i<n;i++){
            map[i]+=map[i-1];
        }
        
        for(int i=0;i<n;i++){
            nFact=nFact/(n-1);

            res=+(map[str.charAt(i)-1]*nFact);
            for(int j=str.charAt(i);j<256;j++)
            map[j]--;


        }
        return res;
    }
}
