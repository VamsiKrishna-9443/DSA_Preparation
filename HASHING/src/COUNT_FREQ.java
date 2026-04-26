import java.util.*;
public class COUNT_FREQ
{
    public static void  freq_count(int[] arr,int number){
        int n =  arr.length;
        Map<Integer,Integer>  map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }
            else {
                map.put(arr[i],1);
            }
        }

        if (map.containsKey(number)) {
            System.out.println("Frequency of " + number + " is: " + map.get(number));
        } else {
            System.out.println(number + " is not present in the array.");

        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array:");
        int n = sc.nextInt();

        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("enter the number :");
        int number = sc.nextInt();
        freq_count(arr,number);
    }
}
