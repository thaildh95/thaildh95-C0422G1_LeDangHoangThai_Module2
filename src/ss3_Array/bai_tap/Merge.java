package ss3_Array.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class Merge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do dai mang 1 la 5");
        int[] arr1 = new int[5];
        for (int i = 0; i < arr1.length; i++) {
            System.out.println("Nhap phan tu mang 1");
            arr1[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println(Arrays.toString(arr1));
        System.out.println("Do dai mang 2 la 7");
        int[] arr2 = new int[7];
        for (int i = 0; i < arr2.length; i++) {
            System.out.println("Nhap phan tu mang 2");
            arr2[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println(Arrays.toString(arr2));
        System.out.println("Mang 3 co do dai bang 12");
        int[] arr3 = new int[12];


       System.arraycopy(arr1,0,arr3,0,arr1.length);
        System.arraycopy(arr2,0,arr3,arr1.length,arr2.length);
        System.out.println(Arrays.toString(arr3));
    }
}

