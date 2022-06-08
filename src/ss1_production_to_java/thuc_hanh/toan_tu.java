package ss1_production_to_java.thuc_hanh;

import java.util.Scanner;

public class toan_tu {
    public static void main(String[] args) {
        float chieucao;
        float chieudai;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap chieu cao");
        chieucao=sc.nextFloat();
        System.out.println("nhap chieu rong");
        chieudai=sc.nextFloat();
        float dientich = chieucao*chieudai;
        System.out.println("dien tich la :" + dientich);
    }
}
