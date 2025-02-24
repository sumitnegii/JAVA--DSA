public class BinarySearch {

    public static void main(String[] args) {

        int[] arr = { 1, 2, 4, 5, 6, 7, 8, 9, 10 };
        int[] arr1 = { 100, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };

        int target = 9;
        int ans = BinarySearch(arr, target);
        int asn1 = desBinary(arr1, 100);
        System.out.println(ans);
        System.out.println(asn1);
    }

    static int BinarySearch(int[] arr, int target) {

        int n = arr.length;
        int start = 0;
        int end = n - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }
            if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1;
    }

    // desending order
    static int desBinary(int[] arr, int target) {
        int n = arr.length;
        int start = 0;
        int end = n - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }
            if (arr[mid] < target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return -1;
    }

}
