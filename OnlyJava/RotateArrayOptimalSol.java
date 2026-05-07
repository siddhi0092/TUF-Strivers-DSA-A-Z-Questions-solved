import java.util.*;

class RotateArrayOptimal {

    //reversing array between the given indices
    //done by swapping the elements

    void Reverse(int[] arr, int start, int end ){

        while (start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    // function to rotate array from left or from right
    public int[] RotateArray(int[] arr, int k, String direction){ //function returns ans as an array

        int n = arr.length;

        k = k % n;

        if (direction.equals("left")){

            //rotate the first k elements

            Reverse(arr, 0, k-1);

            //rotate the remaining elements

            Reverse(arr, k, n-1);

            //rotate the array 

            Reverse(arr, 0, n-1 );

            return arr;
        }
        else{ // if we have to shift right

             //rotate the array 

            Reverse(arr, 0, n-1 );

             //rotate the first k elements

            Reverse(arr, 0, k-1);

            //rotate the remaining elements

            Reverse(arr, k, n-1);

            return arr;
        }

    }
}

public class RotateArrayOptimalSol {
    public static void main(String[] args){

        RotateArrayOptimal sol = new RotateArrayOptimal();  // creating instance of a class

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the size of the array");

        int n = sc.nextInt();  //taking the  size of the array

        int[] nums = new int[n];

        for (int i=0; i<n; i++){  //taking input for an array
            nums[i] = sc.nextInt();
        }

        //enter the no. of rotations
        System.out.println("Enter the no. of rotations");
        int k = sc.nextInt();

        sc.nextLine(); // to consume the newline character

        System.out.println("Enter the direction of rotation (left or right)");
        String direction = sc.nextLine();

        int[] arr = sol.RotateArray(nums, k, direction);

        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }

    }

}