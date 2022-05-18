package String;

import java.util.Arrays;

public class LeftmostRepeatingCharacter {
    public static void main(String[] args) {
        String s="asdf";
        System.out.println(leftMostReaptingChar(s));
        System.out.println(leftMostReaptingChar_2(s));
    }
    public static int leftMostReaptingChar(String s){
        int[]map=new int[256];
        Arrays.fill(map, -1);
        int res=Integer.MAX_VALUE;
        for(int i=0;i<s.length();i++){
            if(map[s.charAt(i)]==-1)map[s.charAt(i)]=i;
            else res=Math.min(res, map[s.charAt(i)]);
        }
        if(res==Integer.MAX_VALUE)return -1;
        return res;
    }
    public static int leftMostReaptingChar_2(String s){
        boolean[]map=new boolean[256];
        int res=-1;
        for(int i=s.length()-1;i>=0;i--){
            if(map[s.charAt(i)]==false)map[s.charAt(i)]=true;
            else res=i;
        }
        return res;
    }

}
