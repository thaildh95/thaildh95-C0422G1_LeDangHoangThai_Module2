package ss1_production_to_java.thuc_hanh;

import java.util.Scanner;

public class phuong_trinh_bac_1 {
    public static void main(String[] args) {
        float a;
        float b;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so a");
        a = sc.nextFloat();
        System.out.println("nhap so b");
        b = sc.nextFloat();
        float nghiem = -b / a;
        if (a == 0 && b != 0) {
            System.out.println("phuong trinh vo nghiem");

        } else if (a == 0 && b == 0) {
            System.out.println("phuong trinh vo so nghiem");
        } else if (a != 0 && b == 0) {
            System.out.println("phuong trinh co nghiem la 0");
        } else if (a != 0 && b != 0) {
            System.out.println(" phuong trinh co nghiem la :" + nghiem);
        }
    }
}
