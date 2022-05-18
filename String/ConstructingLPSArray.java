package String;

public class ConstructingLPSArray {
    public static void fillLPS(int[]lps,String pat){
        int i=1;
        int n=pat.length(),len=0;
        lps[0]=0;

        while(i<n){
            if(pat.charAt(len)==pat.charAt(i)){
                len++;
                lps[i]=len;
                i++;
            }else{
                if(len==0){
                    lps[i]=0;
                    i++;
                }else{
                    len=lps[len-1];
                }
            }
        }
    }

    public static void main(String[]args){
        String pat="aabdbbfghdgsbasbd";
        int[]lps=new int[pat.length()];
        fillLPS(lps, pat);
        for(int i:lps){
            System.out.print(i+" ");
        }
    }
}
