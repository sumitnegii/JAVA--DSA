public class PeakElementInMountainArray {

    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 2, 4 };
        int ans = peakIndexInMountainArray(arr);
        System.out.println(ans);

    }

    static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int size = arr.length;
        int end = size - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (arr[mid + 1] < arr[mid]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;

    }
}
