import java.util.*;

public class Rotate_By_90
{
    public static  void rotate(int[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i + 1; j < matrix[0].length; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] =  temp;
            }
        }
        int n = matrix.length;
        for (int i = 0; i < matrix.length ; i++) {
            for (int j = 0; j < n / 2; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][(n - 1) - j];
                matrix[i][(n - 1) - j] = temp;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the rows and columns:");
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];
        System.out.println("enter the values:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        rotate(matrix);
        System.out.println("Rotated Matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] +" ");
            }
            System.out.println();
        }
    }
}
