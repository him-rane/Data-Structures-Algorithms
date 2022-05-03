package Matrix;

public class MakeMatrxBeautiful {
    static int findMinOperation(int mat[][], int n){
        int rMax=0;
        for(int i=0;i<n;i++){
            int temp=0;
            for(int j=0;j<n;j++){
                temp=temp+mat[i][j];
            }
            rMax=Math.max(rMax,temp);
        }
        int cMax=0;
        for(int i=0;i<n;i++){
            int temp=0;
            for(int j=0;j<n;j++){
                temp=temp+mat[j][i];
            }
            cMax=Math.max(cMax,temp);
        }
        int res=0;
        if(cMax<rMax){
            for(int i=0;i<n;i++){
                int temp=0;
                for(int j=0;j<n;j++){
                    temp=temp+mat[i][j];
                }
                res=res+(rMax-temp);
            }
        }else{
            for(int i=0;i<n;i++){
                int temp=0;
                for(int j=0;j<n;j++){
                    temp=temp+mat[j][i];
                }
                res=res+(cMax-temp);
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[][]mat = {{1, 2, 3},
              {4, 2, 3},
              {3, 2, 1}};
        System.out.println(findMinOperation(mat, mat.length));
    }
}
