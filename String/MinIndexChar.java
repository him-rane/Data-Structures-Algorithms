package String;

public class MinIndexChar {
    public static int minIndexChar(String str, String patt){
        // Your code here
        int[]map=new int[256];
        
        for(int i=0;i<patt.length();i++){
            map[patt.charAt(i)]++;
        }
        for(int i=0;i<str.length();i++){
            if(map[str.charAt(i)]>0)return i;
        }
        
        return -1;
    }
    public static void main(String[] args) {
        String str="acadsdf";
        String patt="nmddrs";

        System.out.println(minIndexChar(str, patt));
    }
}
