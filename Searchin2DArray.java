import java.util.Arrays;

public class Searchin2DArray {
    public static void main(String[] args) {

        int[][] arr = {
                {10,20,30,40,44},
                {15,25,35,45,47},
                {26,36,46,56,57},
                {37,47,58,59,60},
                {39,49,61,63,65}
        };
        int target = 65;

        System.out.println(Arrays.toString(search(arr,target)));
    }
    static int[] search(int[][] arr , int target)
    {
        int row = 0;
        int column = arr.length - 1 ;

        while(row < arr.length && column >= 0)
        {
            if(arr[row][column] == target)
            {
                return new int[]{row,column};
            }
            if(arr[row][column] <= target)
            {
                row++;
            }
            else
            {
                column--;
            }
        }
        return new int[]{-1,-1};
    }

}
