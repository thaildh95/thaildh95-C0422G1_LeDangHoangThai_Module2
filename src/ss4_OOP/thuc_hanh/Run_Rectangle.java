package ss4_OOP.thuc_hanh;

import java.util.Scanner;

public class Run_Rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("moi nhap chieu dai");
        double width = sc.nextDouble();
        System.out.println("moi nhap chieu cao");
        double height = sc.nextDouble();
        Rectangle rectangle = new Rectangle(width,height);
        System.out.println("hinh chu nhat cua ban " + rectangle.display());
        System.out.println("dien tich cua hinh chu nhat la " + rectangle.getArea());
        System.out.println("chu vi cua hinh chu nhat la " + rectangle.getPerimeter());
    }
}
