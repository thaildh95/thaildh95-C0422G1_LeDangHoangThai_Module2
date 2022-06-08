package ss2_Array_loop.thuchanh;

import java.util.Scanner;

public class Snt2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("moi nhap gioi han");
        int num = sc.nextInt();
        int number = 2;
        int uoc = 0;
        while (number<num){
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    uoc++;
                    break;
                }
            }
            if (uoc==0){
                    System.out.println(number);

                }uoc=0;
                number++;
            }
        }
    }

