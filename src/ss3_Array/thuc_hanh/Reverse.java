package ss3_Array.thuc_hanh;

import java.util.Arrays;
import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap do dai cua mang ");
        int size = Integer.parseInt(sc.nextLine());
        int[] arr = new int[size];
        for (int i = 0; i < arr.length ; i++) {
            System.out.println("nhap phan tu cho mang ");
            arr[i] = Integer.parseInt(sc.nextLine());
        }
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length/2; i++) {
            int temp = arr[i];
            arr[i]= arr[size-1-i];
            arr[size-1-i] = temp;

        }
        System.out.println(Arrays.toString(arr));
    }
}
