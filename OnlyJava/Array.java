
import java.util.Arrays;
import java.util.Scanner;


public class Array {
    public static void main(String[] args){
        // int[] arr = new int[5];

        // arr[0] = 10;
        // arr[1] = 20;

        // System.out.println(Arrays.toString(arr));

        //Left Rotate the array by one 

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); //size of the array

        int[] arr = new int[n];

        for (int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        
        //main logic  --> shifting the array
        int temp = arr[0];

        for (int i =0; i< n-1; i++){
            arr[i] = arr[i+1];
        }
        arr[n-1] = temp;

        System.out.println(Arrays.toString(arr));
    }
}