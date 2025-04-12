public class SearchInMoutain {
    public static void main(String[] args) {

        // leetcode problem no 1095
        // here is only solution on this problem not created Interface

    }
        public int findInMountainArray(int target, MountainArray mountainArr) {
            int peak = findPeak(mountainArr);
            int ans = binarySearch(mountainArr,0,peak,target,true);
            if(ans != -1) return ans;
            ans = binarySearch(mountainArr,peak + 1,mountainArr.length() - 1,target,false);
            return ans;
        }
        private int findPeak(MountainArray mountainArr) {
            int start = 1;
            int end = mountainArr.length() - 2;
            while(start <= end) {
                int mid = start + (end - start)/2;
                int midVal = mountainArr.get(mid);
                int midPlusOne = mountainArr.get(mid + 1);
                int midMinusOne = mountainArr.get(mid - 1);

                if(midVal > midPlusOne && midVal > midMinusOne) return mid;
                else if(midVal < midPlusOne) start = mid + 1;
                else end = mid - 1;
            }
            return -1; // this will never be executed as there will always be a peak in mountainArr
        }
        private int binarySearch(MountainArray mountainArr,int start,int end,int target,boolean isAsc) {
            while(start <= end) {
                int mid = start + (end - start)/2;
                int midVal = mountainArr.get(mid);

                if(midVal == target) return mid;
                else if(midVal > target) {
                    if(isAsc) end = mid - 1;
                    else start = mid + 1;
                }
                else {
                    if(isAsc) start = mid + 1;
                    else end = mid - 1;
                }
            }
            return -1;
        }
    }
