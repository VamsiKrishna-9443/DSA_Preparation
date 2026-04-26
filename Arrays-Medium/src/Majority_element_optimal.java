import java.util.*;
public class Majority_element_optimal
{
    public static int Majority(int[] arr){
        int n = arr.length;
        int count = 0;
        int el = 0;
//moore Alogirthm
        for (int i = 0; i < n; i++)
        {
            if(count == 0){
                count = 1;
                el = arr[i];
            }
            else if(el == arr[i]){
                count++;
            }
            else {
                count--;
            }
        }

        int count1=0;
        for (int i = 0; i < n; i++)
        {
            if(arr[i] == el){
                count1++;
            }
        }
        if( count1 > n/2) {
            return el;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the array size :");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the values in the array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int ans = Majority(arr);
        System.out.println("the Majority Element :" + ans);

    }
}
