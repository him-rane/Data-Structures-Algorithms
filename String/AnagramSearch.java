package String;

public class AnagramSearch {
    public static boolean compareMap(int[]textMap,int[]patMap){
        for(int  i=0;i<256;i++){
            if(textMap[i]!=patMap[i])return false;
        }
        return true;
    }
    public static boolean anagramSearch(String text,String pat){
        int n=text.length();
        int m=pat.length();

        int[]patMap=new int[256];
        int[]textMap=new int[256];
        for(int i=0;i<m;i++){
            patMap[pat.charAt(i)]++;
            textMap[text.charAt(i)]++;
        }
        
        if(compareMap(textMap, patMap))return true;

        for(int i=m;i<n;i++){
            textMap[text.charAt(i-m)]--;
            textMap[text.charAt(i)]++;
            if(compareMap(textMap, patMap))return true;
        }
        return false;
    }
    public static void main(String[] args) {
        String text="geeksforgeeks";
        String pat="rseek";

        System.out.println(anagramSearch(text, pat));
    }
}
