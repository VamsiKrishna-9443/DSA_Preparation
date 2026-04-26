import java.util.*;
public class PeakElement_2D
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Rows in the Array:");
        int m = sc.nextInt();
        System.out.println("Enter the Columns in the Array:");
        int n = sc.nextInt();
        int[][] mat = new int[m][n];
        System.out.println("Enter the Elements into the Array:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
    }
}
