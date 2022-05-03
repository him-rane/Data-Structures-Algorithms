package Matrix;

import java.util.ArrayList;

public class SumTriangles {
    static ArrayList<Integer> sumTriangles(int matrix[][])
    {
        // code here
        int r=matrix.length;
        int c=matrix[0].length;
        
        int sumA=0;
        int sumB=0;
        
        for(int i=0;i<r;i++){
            for(int j=i;j<c;j++){
                sumA+=matrix[i][j];
            }
            for(int j=0;j<=i;j++){
                 sumB+=matrix[i][j];
            }
        }
        
        ArrayList<Integer>list=new ArrayList<>();
        list.add(sumA);
        list.add(sumB);
        
        return list;
        
    }
    public static void main(String[] args) {
        int[][]mat = {  
                        { 1, 2, 3, 4 },
                        { 5, 6, 7, 8 },
                        { 9, 10, 11, 12},
                        { 13, 14, 15, 16 }
                     };
           System.out.println(sumTriangles(mat));
    }
}
