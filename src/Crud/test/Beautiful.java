package Crud.test;

import java.util.Arrays;
import java.util.Scanner;

public class Beautiful {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap do dai mang");
        int size = Integer.parseInt(scanner.nextLine());
        int[] arr1 = new int[size];
        System.out.println("nhap ptu");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = Integer.parseInt(scanner.nextLine());
        }

        double sum1 = 0;
        double sum2 = 0;

        for (int j = 0; j < arr1.length; j++) {
            for (int i = 0; i < arr1.length; i++) {
                sum1 += arr1[i];
            }
            for (int k = arr1.length; k > 0; k--) {
                sum2 += arr1[arr1.length];
            }
            if (sum1 == sum2) {
                System.out.println("mang dep");
            } else {
                System.out.println("khong dep");
            }

        }
    }
}
