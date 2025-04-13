public class Split_Array_Largest_Sum {
    public static void main(String[] args) {
        int[] arr = {7,2,5,10,8};
        int k = 2;
        System.out.println(splitArray(arr,k));

    }

    static int splitArray(int[] nums, int k) {
          int start = 0;
          int end = 0;

          for(int i = 0; i < nums.length; i++)
          {
              start = Math.max(start , nums[i]);
              end += nums[i];
          }
          while (start < end )
          {
              int mid = start + (end - start) / 2;

              int sum = 0 ;
              int pieces = 1;

              for(int num : nums)
              {
                  if(sum + num > mid)
                  {
                      sum = num ;
                      pieces++;
                  }
                  else
                  {
                      sum += num;
                  }
              }
              if (pieces > k)
              {
                 start = mid+1;
              }
              else
              {
                  end = mid ;
              }
          }

return end;
    }

}
