public class Floor {
    public static void main(String[] args)
    {
     int[] arr = {2,3,5,8,14,16,18};
     int target = 1;
     int ans = floor_number(arr, target);
        System.out.println(ans);
    }
    static int floor_number(int[] arr , int target)
    {
        int start = 0;
        int end = arr.length-1;

        while (start <= end)
        {
            int mid = start +(end-start);

            if(target == arr[mid])
            {
                return  mid;
            }

           else if(target < arr[mid])
            {
                end = mid -1;
            }
            else if (target > arr[mid])
            {
                start = mid +1;
            }
        }
        return  end;
    }

}
