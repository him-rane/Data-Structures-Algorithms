package Matrix;

public class MultiplyMatrices {
    public static int[][] multiplyMatrices(int[][]mat1,int[][]mat2){
        int r1=mat1.length,c1=mat1[0].length;
        int r2=mat2.length,c2=mat2[0].length;
        
        if(c1!=r2){
            int[][]ans=new int[1][1];
            return ans;
        }        
        int[][]ans=new int[r1][c2];
        for(int i=0;i<r1;i++){
            for(int j=0;j<c2;j++){
                int temp=0;
                for(int k=0;k<c1;k++){
                    temp=temp+(mat1[i][k]*mat2[k][j]);
                }
                ans[i][j]=temp;
            }
        }

        return ans;
    }
    public static void main(String[] args) {
        int[][] mat1= { {4, 8},
                        {0, 2},
                        {1, 6}
                    };

        int[][]mat2 = { 
                        {5, 2},
                        {9, 4}
                    };

         int[][]ans=multiplyMatrices(mat1, mat2);
         for(int i=0;i<ans.length;i++){
             for(int j=0;j<ans[0].length;j++){
                 System.out.print(ans[i][j]+" ");
             }
             System.out.println();
         }
    }
}
