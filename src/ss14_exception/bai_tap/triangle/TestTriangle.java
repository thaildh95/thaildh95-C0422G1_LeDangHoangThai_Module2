package ss14_exception.bai_tap.triangle;

import java.util.Scanner;

public class TestTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
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
        break;
     }
    catch (IllegalTriangleException e){
        System.out.println(e.getMessage());

    }catch (NumberFormatException e){
        System.out.println("nhap so vao thang ngu");
        System.out.println("---------------------------");

    }
        }
    while (true);

        System.out.println(triangle);

    }
}
