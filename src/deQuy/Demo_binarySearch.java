package deQuy;

public class Demo_binarySearch {
int binarySearch(int array[],int value, int left, int right){
    if (right>=left){
        int mid = left+(right-left)/2;

        if (mid == value)
            return mid;

        if ( mid > value)
            return binarySearch(array, value, left, mid - 1);

        return binarySearch(array, value, mid + 1, right);
    }
    return -1;
}
}
