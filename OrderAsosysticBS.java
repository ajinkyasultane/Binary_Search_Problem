public class OrderAsosysticBS {
    public static void main(String[] args) {

        int[] arr ={10,20,30,40,50,60,70,80,90};
        int target = 40;
        int[] arr1 = {90,80,70,60,50,40,30,20,10};
        int ans1 = ascdecbs(arr,target);
        int ans = ascdecbs(arr1,target);
        System.out.println(ans);
        System.out.println(ans1);

    }
  //  static int asendecBS(int[] arr , int target)
//    {
//        int start = 0;
//        int end = arr.length -1;
//
//        boolean ascen = arr[start] < arr[end];
//
//        while (start <= end) {
//
//            int mid = start + (end - start)/2;
//            if(arr[mid]==target)
//            {
//                return mid;
//            }
//            if (ascen) {
//                if (target < arr[mid]) {
//                    end = mid - 1;
//                } else if (target > arr[mid])
//                {
//                    start = mid +1;
//
//                }
//            } else {
//                if(target > arr[mid])
//                {
//                    end = mid - 1;
//                } else if (target < arr[mid])
//                {
//                 start = mid +1;
//
//                }
//            }
//        }
//        return -1;
//    }

    static int ascdecbs(int[] arr , int target)
    {
        int start = 0;
        int end = arr.length-1;

        boolean isAsc = (arr[start] < arr[end]);

        while (start <= end)
        {
            int mid = start + (end - start)/2;

            if(isAsc)
            {
                if(target <arr[mid])
                {
                    end = mid -1;
                } else if (target > arr[mid] )
                {
                    start = mid +1;

                }
                else {
                    return mid;
                }

            }
            else
            {
                if (target < arr[mid])
                {
                    start = mid +1;
                }
                else if (target > arr[mid])
                {
                    end = mid -1;

                }
                else {
                    return  mid;
                }
            }
        }
        return  -1;
    }

}

