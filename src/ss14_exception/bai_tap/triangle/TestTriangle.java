package ss14_exception.bai_tap.triangle;

import java.util.Scanner;

public class TestTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean flag;
        Triangle triangle = new Triangle();
        do {
    try{
        System.out.println("moi nhap cac canh");
        double a = Double.parseDouble(scanner.nextLine());
        System.out.println("moi nhap canh b");
        double b = Double.parseDouble(scanner.nextLine());
        System.out.println("moi nhap canh c");
        double c = Double.parseDouble(scanner.nextLine());
        System.out.println("la tam giac");
        triangle.check(a,b,c);

        flag = true;
     }
    catch (IllegalTriangleException e){
        System.out.println(e.getMessage());
        flag = false;
    }catch (NumberFormatException e){
        System.out.println("nhap so vao thang ngu");
        System.out.println("---------------------------");
        flag = false;
    }
        }
    while (!flag);

        System.out.println(triangle);

    }
}
