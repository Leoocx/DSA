
public class Main {
    public static void swap(int i, int j, int[][] matrix){
        int temp = 0;
        temp = matrix[i][j];
        matrix[i][j] = matrix[j][i];
        matrix[j][i] = temp;
    }
    public static void rotate(int[][] matrix) {
        for (int i=0; i< matrix.length;i++){
            for (int j=i;j< matrix[0].length;j++)
                swap(i,j,matrix);
        }

        for (int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix.length/2;j++) {
                int temp = 0;
                temp = matrix[i][j];
                matrix[i][j]=matrix[i][matrix.length-1-j];
                matrix[i][matrix.length-1-j]=temp;
            }
        }
    }
}