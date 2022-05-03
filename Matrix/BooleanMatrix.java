package Matrix;

public class BooleanMatrix {
    static void booleanMatrix(int mat[][]){
        int n=mat.length,m=mat[0].length;
        boolean rc=(mat[0][0]==1);
        boolean r=false,c=false;
        for(int i=0;i<n;i++){
            if(mat[i][0]==1)r=true;
        }
        for(int j=0;j<m;j++){
            if(mat[0][j]==1)c=true;
        }
        
        for(int i=1;i<n;i++){
            for(int j=1;j<m;j++){
                if(mat[i][j]==1){
                    mat[0][j]=1;
                    mat[i][0]=1;
                }
            }
        }
        for(int i=1;i<n;i++){
            for(int j=1;j<m;j++){
                if(mat[0][j]==1||mat[i][0]==1){
                    mat[i][j]=1;
                }
            }
        }
        if(rc || c){
            for(int j=0;j<m;j++){
                mat[0][j]=1;
            }
        }
        if(rc || r){
            for(int i=0;i<n;i++){
                mat[i][0]=1;
            }
        }
    }
    public static void main(String[] args) {
        int[][]mat = { { 0, 1, 0, 0 },
                      { 0, 0, 0, 0 },
                      { 0, 1, 1, 1},
                      { 0, 0, 0, 1 } };
        booleanMatrix(mat);

        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
}
