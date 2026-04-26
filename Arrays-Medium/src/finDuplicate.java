import java.util.*;
public class finDuplicate
{
    public static int find_duplicate(int[] arr){
        int n = arr.length;
        int freq[] = new int[n+1];
        for (int i = 0; i < n; i++) {
            if(freq[arr[i]] == 0){
                freq[arr[i]] += 1;
            }
            else{
                return arr[i];
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the values in the array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int dup = find_duplicate(arr);
        System.out.println("duplicate array: "+dup);
    }
}
