package ss6_inheritance.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class RunXYZ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap x");
        float x = sc.nextInt();
        System.out.println("nhap y");
        float y = sc.nextInt();
        System.out.println("nhap z");
        float z = sc.nextInt();
        Point3D point3D = new Point3D(x,y,z);
        System.out.println(Arrays.toString(point3D.getXYZ()));

    }
}
