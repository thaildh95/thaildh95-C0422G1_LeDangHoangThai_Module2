package ss7_abtraction_interface.bai_tap.Resize;

import ss6_inheritance.bai_tap.Circle;

public class TestShape {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Shape(5,"red");
        shapes[1] = new Rectangle(5.6, 4);
        shapes[2] = new Square(9);
        System.out.println("********************** After resize **********************");
        for (Shape shape : shapes) {
            System.out.println(shape);
            System.out.println("------------------");
        }

        System.out.println("********************** Before resize **********************");
        for (Shape shape : shapes) {
            System.out.println(shape);
            System.out.println("------------------");
        }

    }
}