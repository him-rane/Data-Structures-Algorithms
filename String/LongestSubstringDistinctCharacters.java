package String;

import java.util.HashMap;

public class LongestSubstringDistinctCharacters {
    public static int longestSubstringDistinctCharacters(String str){
        int res=0;
        HashMap<Character,Integer>map=new HashMap<>();
        int n=str.length();
        int start=0;

        for(int end=0;end<n;end++){
            if(map.containsKey(str.charAt(end))){
                start=Math.max(start, map.get(str.charAt(end))+1);
            }
            res=Math.max(res, end-start+1);
            map.put(str.charAt(end), end);
        }         
        return res;
    }
    public static void main(String[] args) {
        String str="yhnujmikqssssasdfwase";

        System.out.println(longestSubstringDistinctCharacters(str));
    }
}
