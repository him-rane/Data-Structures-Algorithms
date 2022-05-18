package String;

public class ImprovedNaivePatternSearchingDistinct {
    public static void patSearching(String txt,String pat){
        int n=txt.length();
        int m=pat.length();
      
        for(int i=0;i<=n-m;){
            int j=0;
           for(j=0;j<m;j++){
                if(pat.charAt(j)!=txt.charAt(i+j)){
                    break;
                }
               
            }

            if(j==m)System.out.println(i);
            if(j==0)i++;
            else i=i+j;

        }
    }
    public static void main(String[] args) {
        String txt="abcdfgrtsuipfgr";
        String pat="fgr";
        patSearching(txt, pat);
    }
}
