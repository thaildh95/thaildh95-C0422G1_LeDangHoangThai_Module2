package ss4_OOP.bai_tap;

import java.util.Scanner;

public class RunQuadratic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so a ");
        double a = sc.nextDouble();
        System.out.println("nhap so b");
        double b = sc.nextDouble();
        System.out.println("nhap so c ");
        double c = sc.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        System.out.println(quadraticEquation.display());

    }
}
