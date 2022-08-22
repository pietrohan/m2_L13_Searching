package deQuy;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập độ dài mảng: ");
        int length = sc.nextInt();
        int [] array = new int[length];
        System.out.println("nhập từng phần tử vào mảng: ");
        int x;
        for (int i = 0; i < array.length; i++) {
            x= sc.nextInt();
            array[i]= x;
      }
        Arrays.sort(array);
        for (int e:array) {
            System.out.print(e+" ");

        }

        BinarySearch bi = new BinarySearch();
        int n = array.length;
        System.out.println("\n nhập giá trị bạn muốn tìm: ");
        int value =sc.nextInt();
        int result = bi.binarySearch(array,value, 0, n-1);
        if (result == -1)
            System.out.println("Not found");
        else
            System.out.println( " Element found at index " + result);
    }
}
