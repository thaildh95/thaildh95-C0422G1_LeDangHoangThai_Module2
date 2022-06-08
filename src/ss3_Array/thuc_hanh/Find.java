package ss3_Array.thuc_hanh;

import java.util.Arrays;
import java.util.Scanner;

public class Find {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap do dai cho mang");
        int size = Integer.parseInt(sc.nextLine());
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("nhap phan tu cho mang");
            arr[i]= Integer.parseInt(sc.nextLine());
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("nhap so de kiem tra ");
        int number = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]== number){
                System.out.println("so" + number + "co trong mang");
            }else{
                System.out.println("so" + number + "khong co trong mang");
            }
        }
    }
}
