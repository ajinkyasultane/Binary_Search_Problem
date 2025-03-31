
public class Ceiling_Number {
    public static void main(String[] args)
    {
        int[] arr = {10,20,30,40,50,60,70,80,90};
        int target = 45;
        int ans = ceiling(arr, target);
        System.out.println(ans);
    }
    static int ceiling(int[] arr ,int target)
    {
        if(target > arr[arr.length-1])
        {
            return -1;
        }
        int start = 0;
        int end = arr.length-1;

        while (start <= end)
        {
            int mid = start +(end - start);

            if(target < arr[mid])
            {
                end = mid-1;
            }
            else if(target > arr[mid])
            {
                start = start+1;
            } else if (target == arr[mid])
            {
            return mid;
            }

        }

       return start;
    }


}
