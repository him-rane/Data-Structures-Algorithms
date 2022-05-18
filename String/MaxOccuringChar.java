package String;

public class MaxOccuringChar {
     static char getMaxOccuringChar(String line){
        // Your code here
        int[]map=new int[256];
        for(int  i=0;i<line.length();i++){
            map[line.charAt(i)]++;
        }
        int max=0;
        char res=' ';
        for(int i=0;i<256;i++){
            if(map[i]>max){
                max=map[i];
                res=(char)i;
            }
        }
        
        return res;
        
    }
}
