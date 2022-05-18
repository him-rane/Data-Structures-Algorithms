package String;
import java.util.Arrays;

public class LeftmostNonRepeatingElement {
    public static int leftmostNonRepeatingElement(String s){
        int[]map= new int[265];
        Arrays.fill(map, -1);
        
        for(int i=s.length()-1;i>=0;i--){
            if(map[s.charAt(i)]==-1)map[s.charAt(i)]=i;
            else map[s.charAt(i)]=-2;
        }
        int res=Integer.MAX_VALUE;
       for(int i=0;i<=256;i++){
            if(map[i]>=0)res=Math.min(res, map[i]);
       }
       return res;
    }
    public static void main(String[] args) {
        String s="pbaaaab";
        System.out.println(leftmostNonRepeatingElement(s));
    }
}
