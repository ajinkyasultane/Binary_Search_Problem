import java.util.logging.SocketHandler;

public class Binary_simple_program {
    public static void main(String args[])
    {
        int[] arr = {12,13,14,15,34,45,66,77,79};
        int target = 984;
        System.out.println("The Index of Array Element is " +binary_search(arr,target));
    }
    static int binary_search(int[] arr , int target)
    {
        int start = 0;
        int end = arr.length -1;

        while (start <= end)
        {
            int mid = start + (end-start)/2;

            if(target < arr[mid])
            {
                end = mid-1;
            }
            else if (target > arr[mid])
            {
                start = mid +1;
            } else if (target == arr[mid])
            {
            return mid;
            }

        }
        return -1;
    }

}
