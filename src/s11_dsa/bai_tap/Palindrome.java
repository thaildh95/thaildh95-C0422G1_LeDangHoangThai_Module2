package s11_dsa.bai_tap;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue<Character> queue = new ArrayDeque<>();
        System.out.println("Nhap chuoi");
        String word = scanner.nextLine();
        for (int i = word.length()-1; i >=0 ; i--) {
            queue.add(word.charAt(i));
        }
        String result = "";
       while (!queue.isEmpty()) {
           result += queue.poll();
        }
       if (result.equalsIgnoreCase(word)){
           System.out.println("Palindrome");
       }
       else {
           System.out.println("Not palindrome");
       }
    }
}
