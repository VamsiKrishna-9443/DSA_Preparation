import java.util.*;
public class Search_in_2d {
    public static boolean search(int[][] matrix,int target) {
        int m = matrix.length;
        int n = matrix[0].length;

        int left = 0, right = m * n - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            int midElement = matrix[mid / n][mid % n];
            if (midElement == target) {
                return true;
            } else if (midElement < target) {
                left = mid + 1;
            } else
                right = mid - 1;
        }
        return false;
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the row:");
        int row=sc.nextInt();
        System.out.println("enter the col:");
        int col=sc.nextInt();
        int[][] matrix=new int[row][col];
        System.out.println("enter the elements:");
        for (int i = 0; i < row; i++) {
            for(int j=0;j < col;j++ ){
                matrix[i][j]=sc.nextInt();
            }
        }
        System.out.println("enter the target:");
        int target=sc.nextInt();
        if(search(matrix,target)){
            System.out.println("target found :"+matrix[row][col]);
        }
        else
            System.out.println(" target Not found");
    }
}
