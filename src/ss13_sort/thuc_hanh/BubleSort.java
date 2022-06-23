package ss13_sort.thuc_hanh;

import java.util.Arrays;
import java.util.Scanner;

public class BubleSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap do dai cua mang ");
        int size = Integer.parseInt(scanner.nextLine());
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("mang truoc khi sap xep" + Arrays.toString(array));
        System.out.println("------------------------------------------");
        int[] array2 = bubbleSortMethod(array);
        System.out.println("------------------------------------------");
        System.out.println("mang sau khi sap xep" + Arrays.toString(array2));
    }
    public static int[] bubbleSortMethod(int[] array) {
        boolean flag = true;

        for (int i = 0; i < array.length && flag == true; i++) {
            flag = false;
            for (int j = array.length - 1; j > 0; j--) {
                if (array[j] < array[j - 1]) {
                    int temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                    flag = true;
                }
            }
            System.out.println("sap xep lan thu " + i + Arrays.toString(array));
        }
        return array;
    }
}
