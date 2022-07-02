package Crud.test;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1.tim so lon nhat");
        System.out.println("2.phuong trinh bac 1");
        System.out.println("3. tinh tong");
        System.out.println("moi nhap chuc nang can dung");
        int number = Integer.parseInt(scanner.nextLine());

        switch (number) {
            case 1:
                double a, b, c;
                System.out.println("nhap so a");
                a = Double.parseDouble(scanner.nextLine());
                System.out.println("nhap so b");
                b = Double.parseDouble(scanner.nextLine());
                System.out.println("nhap so c");
                c = Double.parseDouble(scanner.nextLine());
                double max = c;
                if (a > max && b > a) {
                    System.out.println("so lon nhat la" + b);
                } else if (b > max && a > b) {

                    System.out.println("so lon nhat la" + a);
                } else {
                    System.out.println("so lon nhat la" + max);
                    break;

                }
            case 2:
                double m, n;
                System.out.println("nhap so m");
                m = Double.parseDouble(scanner.nextLine());
                System.out.println("nhap so n");
                n = Double.parseDouble(scanner.nextLine());
                if (m == 0 && n == 0) {
                    System.out.println("phuong trinh vo so nghiem");
                } else if (m != 0 && n != 0) {
                    System.out.println("phuong trinh co nghiem la" + -n / m);
                } else {
                    System.out.println("phuong trinh vo nghiem");
                }


                break;
            case 3:
                double q, e;
                System.out.println("nhap so q");
                q = Double.parseDouble(scanner.nextLine());
                System.out.println("nhap so e");
                e = Double.parseDouble(scanner.nextLine());
                double x = q + e;
                System.out.println("tong so la" + x);

                break;
            default:
                break;
        }
    }
}