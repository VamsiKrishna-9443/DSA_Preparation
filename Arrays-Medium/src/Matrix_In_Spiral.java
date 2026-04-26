import java.util.*;
public class Matrix_In_Spiral {
    public static List<Integer> spiral(int[][] arr){
        List<Integer> ans = new ArrayList<>();
        int m = arr.length;
        int n = arr[0].length;

        int left = 0,right = n - 1;
        int top = 0, bottom = m - 1;

        while(top <= bottom && left <= right)
        {

            for(int i = left;i <= right;i++)
                ans.add(arr[top][i]);
            top++;

            for (int i = top; i <= bottom; i++)
                ans.add(arr[i][right]);
            right--;

            if(top <= bottom) {
                for (int i = right; i >= left; i--)
                    ans.add(arr[bottom][i]);
                bottom--;
            }

            if(left <= right) {
                for (int i = bottom; i >= top; i--)
                    ans.add(arr[i][left]);
                left++;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the rows:");
        int m=sc.nextInt();
        System.out.println("enter the col:");
        int n = sc.nextInt();
        int[][] arr = new int[m][n] ;
        System.out.println("enter th values:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        List<Integer> ans = spiral(arr);

        for(int i = 0;i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }

    }
}
