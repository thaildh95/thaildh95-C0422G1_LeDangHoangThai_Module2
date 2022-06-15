package ss6_inheritance.bai_tap;

import java.util.Scanner;

public class testCylinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap chieu cao hinh tru");
        double height = sc.nextDouble();
        Cylinder cylinder = new Cylinder();
        cylinder.setHeight(height);
        System.out.println("nhap ban kinh");
        double radius = sc.nextDouble();
        cylinder.setRadius(radius);
        System.out.println(cylinder +"\t"+"The tich hinh tru la : "+cylinder.volum());

    }
}
