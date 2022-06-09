package ss3_Array.thuc_hanh;

import java.util.Arrays;
import java.util.Scanner;

public class add {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap do dai mang");
        int size = sc.nextInt();

        int[] arr = new int[size+1];
        System.out.println("nhap phan tu cho mang");
        for (int i = 0; i < size; i++) {
            arr[i]= sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("nhap so can them vao mang");
        int num = sc.nextInt();
        System.out.println("nhap vi tri de them so vao");
        int index = sc.nextInt();
        for (int i = arr.length-1; i >index ; i--) {
            arr[i] = arr[i-1];
        }
        arr[index] = num;
        System.out.println(Arrays.toString(arr));
        }
}
