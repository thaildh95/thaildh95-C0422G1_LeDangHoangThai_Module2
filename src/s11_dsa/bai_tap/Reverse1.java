package s11_dsa.bai_tap;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Reverse1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        System.out.println("nhap do dai mang");
        int size = Integer.parseInt(scanner.nextLine());
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println(Arrays.toString(arr));
        for (Integer e : arr
        ) {
            stack.push(e);
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = stack.pop();
        }
        System.out.println(Arrays.toString(arr));
    }
}
