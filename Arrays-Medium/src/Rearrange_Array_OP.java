import java.util.*;
public class Rearrange_Array_OP
{
    public static int[] Rearrange(int[] arr){
        int n = arr.length;
        int[] result = new int[n];
        int pos =0, neg = 1;
        for (int i = 0; i < n; i++) {
            if(arr[i] > 0) {
                result[pos] = arr[i];
                pos += 2;
            }
            else if (arr[i] < 0) {
                result[neg] = arr[i];
                neg += 2;
            }

        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size :");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the values in the array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int[] result = Rearrange(arr);
        System.out.println("Rearrange array:"+ Arrays.toString(result));
    }
}
