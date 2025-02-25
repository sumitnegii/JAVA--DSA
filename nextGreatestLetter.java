public class nextGreatestLetter {

    public static void main(String[] args) {
        char[] letter = { 'a', 'b', 'c', 'd', 'e' };

    char target = 'f';
    char ans = BinarySearch(letter, target);
    System.out.println(ans);
    }
    static char BinarySearch(char[] letter, char target) {

        int n = letter.length-1;
        int start = 0;
        int end = n - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            // if (letter[mid] == target) {
            //     return letter[mid];
            // }
            if (letter[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return letter [start % n];
    }
}  
