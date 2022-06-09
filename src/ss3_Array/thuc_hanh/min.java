package ss3_Array.thuc_hanh;

import java.util.Scanner;

public class min {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap do dai cho mang");
        int size = Integer.parseInt(sc.nextLine());
        int[] arr = new int[size];
        System.out.println("nhap phan tu cho mang");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        findMin(arr);
    }

    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] < min) {
                min = arr[j];
            }
        }
        System.out.println("phan tu nho nhat cua mang la " + min);

        return min;
    }
}
