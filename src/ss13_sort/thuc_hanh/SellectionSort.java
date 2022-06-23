package ss13_sort.thuc_hanh;

import java.util.Arrays;
import java.util.Scanner;

public class SellectionSort {
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
         sellectionSortMethod(array);
        System.out.println(Arrays.toString(array));

    }
    public static void sellectionSortMethod(int[] array){
        for (int i = 0; i < array.length; i++) {
            int min = i;
            for (int j = i+1; j <array.length ; j++) {
                if (array[min]>array[j]){
                    min=j;
                }
            }if (min!=i){
                int temp = array[min];
                array[min] = array[i];
                array[i]=temp;
            }
        }

    }
}