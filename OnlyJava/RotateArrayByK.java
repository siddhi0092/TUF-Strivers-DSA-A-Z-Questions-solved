//not optimal for input rotations which are bigger than the array itself

import java.util.Arrays;
import java.util.Scanner;

public class RotateArrayByK {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array");
        int n = sc.nextInt(); //size of the array 

        int[] arr = new int[n];

        for (int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the no. of rotation");
        int rotate = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter Right or Left or (R/L)");

        String side = sc.nextLine();

        if (side.equals("Left") || side.equals("L")){ // left shift

            for (int i = 0; i<rotate; i++){
                int temp = 0;
                temp = arr[0];
                for (int j = 0; j<n-1; j++){
                    arr[j] = arr[j+1];
                }
                arr[n-1] = temp; 

            }
            System.out.println(Arrays.toString(arr));

        }
        else{ // right shift

            for (int i=0; i< rotate; i++){
                int temp = 0;
                temp = arr[n-1];

                for (int j = n-1; j>0; j--){
                    arr[j] = arr[j-1];
                }
                arr[0] = temp;
            }

            System.out.println(Arrays.toString(arr));
        }
    }
}

// time complexity = O(n x x)