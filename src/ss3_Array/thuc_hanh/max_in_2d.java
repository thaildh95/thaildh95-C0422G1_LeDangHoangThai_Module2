package ss3_Array.thuc_hanh;

import java.util.Arrays;
import java.util.Scanner;

public class max_in_2d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("moi nhap so hang cho mang mang");
        int row = sc.nextInt();
        System.out.println("moi nhap so cot cho mang");
        int col = sc.nextInt();
        int[][] arr = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println("nhap phan tu cho mang");
                    arr[i][j]= sc.nextInt();
            }

        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(" phan tu hang " + (i+1) + " cot "+  (j+1) + ":" + arr[i][j]+" \t");
            }
            System.out.println();


        }
        System.out.println(" tong duong cheo: "+sumDiagonalLine(arr));

        System.out.println("tong cot :"+sumColRandom(arr));

    }
    public static int sumDiagonalLine(int[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == j) {
                    sum += arr[i][j];
                }
            }
        }return sum;
    }
    public static int sumColRandom(int[][] arr){
        Scanner scanner = new Scanner(System.in);
        int sum=0;
        System.out.println("nhap cot muon tinh tong");
        int num = scanner.nextInt();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if((num-1 )==j){
                    sum+=arr[i][num-1];

                }
            }
        }
        return sum;
    }
}
