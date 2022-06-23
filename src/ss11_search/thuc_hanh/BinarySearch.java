package ss11_search.thuc_hanh;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class BinarySearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("moi so phan tu");
        int size = Integer.parseInt(scanner.nextLine());
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i]= Integer.parseInt(scanner.nextLine());
        }
        System.out.println("nhap so ");
        int value = Integer.parseInt(scanner.nextLine());
      System.out.println(binarySeacrh(arr, value));

    }

    public static int binarySeacrh(int[] arr, int value) {
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int first = 0;
        int last = arr.length - 1;

        while (first <= last) {
            int mid = (first + last) / 2;
            if (arr[mid] == value) {
                return mid;
            } else if (arr[mid] < value) {
                first = mid + 1;
            } else last = mid - 1;
        }
        return -1;


    }
}