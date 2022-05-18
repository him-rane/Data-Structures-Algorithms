package String;

public class NaivePatternSearching {
    public static void naivePatternSearching(String text,String pat){
        int n=text.length();
        int m=pat.length();
        for(int i=0;i<=n-m;i++){
            int j;
            for(j=0;j<m;j++){
                if(pat.charAt(j)!=text.charAt(i+j))break; 
            }
            if(j==m)System.out.println(i);
        }
    }
    public static void main(String[]args){
        String text="abcaabcdbabca";
        String pat="bca";
        
        naivePatternSearching(text, pat);
    }

}
