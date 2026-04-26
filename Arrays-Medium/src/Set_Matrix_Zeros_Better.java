import java.util.*;
public class Set_Matrix_Zeros_Better
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the rows: ");
        int n = sc.nextInt();
        System.out.println("enter the columns: ");
        int m = sc.nextInt();
        int arr[][] = new int[n][m];
        System.out.println("enter the values in the array: ");
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        
    }
}
