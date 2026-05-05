import java.util.Scanner;

public class RemoveDuplicate {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of the array");

        int x = sc.nextInt();

        System.out.println("Enter a sorted array");

        int arr[] = new int[x]; 

        for(int i = 0; i<x; i++){   //storing the values in the array
            arr[i] = sc.nextInt();
        }

        //removing duplicates from a sorted array 

        for(int i = 0; i<x; i++){
            if (i > 0 && arr[i] == arr[i-1]){
                System.out.print(" _ ");
            }
            else{
                System.out.print(arr[i]+" ");
            }
        }
        
        // for (int i = 0; i<x; i++){
        //     System.out.print(" "+arr[i]);
        // }

    }
}
