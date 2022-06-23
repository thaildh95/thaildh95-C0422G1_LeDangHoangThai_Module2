package ss13_sort.thuc_hanh;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {
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
        insertSortMethod(array);
        System.out.println(Arrays.toString(array));

    }
    public static void insertSortMethod(int[] array){
        int x ;
        int position;
        for (int i = 0; i < array.length; i++) {
            x = array[i];
            position = i;
            while (position>0 && x<array[position-1]){
                array[position]=array[position-1];
                position--;
            }
            array[position]=x;
        }

    }
}
