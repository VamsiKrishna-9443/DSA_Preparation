import  java.util.*;
public class Rearrange_Array{
    public static int[] Rearrange(int[] arr){
        int n = arr.length;
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if(arr[i] > 0)
                pos.add(arr[i]);
            else if(arr[i] < 0)
                neg.add(arr[i]);
        }

        for (int i = 0; i < n/2 ; i++) {
            arr[2*i] = pos.get(i);
            arr[(2*i)+1] = neg.get(i);
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array: ");
        int n =  sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the values in the array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int[] ans  = Rearrange(arr);
        System.out.println("Rearrange array: "+ Arrays.toString(ans));
    }
}