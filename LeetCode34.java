public class LeetCode34 {

    public static void main(String[] args) {


        int arr[] = {5,7,7,8,8,10};
        int target = 8;
        int 
    }

    public int[] searchRange(int[] nums, int target) {

        int ans[] = { -1, -1 };

        int start = search(nums, target, true);
        int end = search(nums, target, false);

        ans[0] = start;
        ans[1] = end;

        return ans;

    }

    int search(int[] nums, int target, boolean findOccurance) {

        int n = nums.length;
        int start = 0;
        int end = n - 1;
        int ans = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] > target) {
                start = mid + 1;
            } else if (nums[mid] < target) {
                end = mid - 1;
            } else {
                ans = mid;
                if (findOccurance) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }

        return -1;

    }
}
