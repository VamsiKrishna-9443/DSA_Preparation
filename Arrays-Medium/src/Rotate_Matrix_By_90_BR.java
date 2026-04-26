import java.util.*;
public class Rotate_Matrix_By_90_BR
{
    public  static int[][] Rotate(int[][] matrix ,  int n){
        int[][] ans =new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                ans[j][(n - 1)-i] = matrix[i][j];
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the rows and columns:");
        int n= sc.nextInt();
        int[][] matrix = new int[n][n];
        System.out.println("enter the values:");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        int[][] ans = Rotate(matrix,n);

        System.out.println("enter the Rotated Matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
    }
}
