package String;

public class SumOfNumbersInString {
    public static long findSum(String str){
        int sum=0; 
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)>46 && str.charAt(i)<58){
                String temp="";
                while(i<str.length() && str.charAt(i)>46 && str.charAt(i)<58){
                    temp=temp+str.charAt(i);
                    i++;
                } 
                sum=sum+(Integer.valueOf(temp));
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        String str="qwer2345hu8";
        System.out.println(findSum(str));
        
    }
}
