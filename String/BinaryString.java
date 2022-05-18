package String;

public class BinaryString {
    public static int binarySubstring(String str){
        // Your code here
        int i=0,count=0,n=str.length();
        while(i<n){
            if(str.charAt(i)=='1')break;
            i++;
        }
        while(i<n){
             if(str.charAt(i)=='1')count++;
             i++;
        }    
        return (count*(count-1))/2;
    }
    public static void main(String[] args) {
        String str="1010001";
        System.out.println(binarySubstring(str));
    }
}
