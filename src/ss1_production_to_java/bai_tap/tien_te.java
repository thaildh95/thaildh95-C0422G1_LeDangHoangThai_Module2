package ss1_production_to_java.bai_tap;

import java.util.Scanner;

public class tien_te {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so usd");
        long number;
        long rate = Long.parseLong(sc.nextLine());
        number = rate * 23000;
        System.out.println("so tien doi ra la : " +number + "VND");
    }
}
