package deQuy;

public class BinarySearch {
    int binarySearch(int array[], int value, int left, int right) {

        if (right >= left) {
            int mid = left + (right - left) / 2;

            // If found at mid, then return it
            if (array[mid] == value)
                return mid;

            // Search the left half
            if (array[mid] > value)
                return binarySearch(array, value, left, mid - 1);

            // Search the right half
            return binarySearch(array, value, mid + 1, right);
        }

        return -1;
    }
    public static void main(String args[]) {
        BinarySearch ob = new BinarySearch();
        int array[] = {1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int n = array.length;
        int value = 4;
        int result = ob.binarySearch(array, value, 0, n - 1);
        if (result == -1)
            System.out.println("Not found");
        else
            System.out.println("Element found at index " + result);
    }
}

