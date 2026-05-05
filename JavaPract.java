//Find the largest element in an array and print it.

//input the size of array
//input the array
// either sort the array or use a max variable


// using max variable

// import java.util.Scanner;

// class JavaPract{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int x;
//         System.out.println("Enter the size of the array");
//         x = sc.nextInt();
//         int arr[] = new int[x];
//         System.out.println("Enter the elements of the array");

//         for(int i =0; i<x; i++){
//             arr[i] = sc.nextInt();
//         }

//         // int max = 0;  //will not work for negative integers
        
//         int max = Integer.MIN_VALUE;  // smallest integer value an integer can hold

//         for (int i=0; i<x; i++){
//             if (arr[i] > max){
//                 max = arr[i];
//             }
//         }

//         System.out.println("The largest element is : " + max);

//     }
// }


//using sorting

import java.util.*;

class JavaPract{
    public static void main(String[] args){
        int x;
        System.out.println("Enter the no.");

        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();

        //Enter the numbers in an array

        System.out.println("Enter the numbers : ");

        int arr[] = new int[x];

        for (int i = 0; i<x; i++){
            arr[i] = sc.nextInt();
        }

        //sorting the array (ascending order)

        Arrays.sort(arr);

        System.out.println("The largest element of the given array is : " + arr[x-1]);

    }
}