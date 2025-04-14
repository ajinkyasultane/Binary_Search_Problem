import java.util.Arrays;

public class SortedMatrix {
    public static void main(String[] args) {

        int[][]  arr = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int target = 8 ;

        System.out.println(Arrays.toString(search(arr,target)));

    }
    //search in the row provided between the column provided
    static int[] binarysearch(int[][] matrix , int row , int colstart , int colend , int target)
    {
        while (colstart <= colend)
        {
            int mid = colstart + (colend -colstart) / 2;
            if(matrix[row][mid] == target)
            {
                return new int[]{row,mid};
            }
            if (matrix[row][mid] < target)
            {
                colstart = mid + 1;
            }
            else
            {
                colend = mid - 1;
            }
        }
        return new int[]{-1,-1};
    }

    static int[] search(int[][] matrix , int target)
    {
        int rows = matrix.length;
        int column = matrix[0].length;

        if (rows == 1)
        {
            return binarysearch(matrix,0,0,column -1 ,target);
        }
        int rowstart = 0;
        int rowend = rows - 1;
        int colmid = column / 2;

        while (rowstart < (rowend - 1))
        {
            int mid = rowstart + (rowend - rowstart) / 2;

            if (matrix[mid][colmid] == target)
            {
                return new int[]{mid,colmid};
            }
            if (matrix[mid][colmid] < target)
            {
                rowstart  = mid;
            }
            else
            {
                rowend = mid ;
            }
        }
        //now we have 2 rows in the end of two rows are remaining
        //check whether the target is in the column of 2 rows

        if(matrix[rowstart][colmid] == target)
        {
            return new int[]{rowstart, colmid};
        }
        if (matrix[rowstart + 1][colmid] == target)
        {
            return  new int[]{rowstart + 1 , colmid};
        }

        //search in first half
        if(target <= matrix[rowstart][colmid - 1])
        {
         return binarysearch(matrix,rowstart,0,colmid -1 , target);
        }
        //search in second , third and four half of array
        if(target <= matrix[rowstart][colmid + 1] && target <= matrix[rowstart][column -1])
        {
            return binarysearch(matrix,rowstart,colmid + 1,column - 1 , target);

        }

        if(target <= matrix[rowstart + 1][colmid - 1])
        {
            return binarysearch(matrix,rowstart + 1,0 ,colmid -1 , target);

        }
        else
        {
            return binarysearch(matrix,rowstart + 1,colmid + 1,colmid -1 , target);

        }


    }


}
