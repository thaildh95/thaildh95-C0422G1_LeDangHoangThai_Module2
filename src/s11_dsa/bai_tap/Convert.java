package s11_dsa.bai_tap;

import java.util.Scanner;
import java.util.Stack;

public class Convert {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack <Integer> stack = new Stack<>();
        System.out.println("Nhap so");
        int number = Integer.parseInt(scanner.nextLine());
        while (number>0) {
            int x = number%2;
            stack.push(x);
            number = number/2;
        }
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}
