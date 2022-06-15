package ss7_abtraction_interface.bai_tap.Resize;

import ss6_inheritance.bai_tap.Circle;

public class TestShape {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(5,"red");
        shapes[1] = new Rectangle(5.6, 4);
        shapes[2] = new Square(9);
        System.out.println("********************** After resize **********************");
        for (Shape shape : shapes) {
            System.out.println(shape);
            System.out.println("------------------");
        }
        for (Shape shape : shapes) {
            if (shape instanceof Circle)
              if (shape instanceof Rectangle) {
                ((Rectangle) shape).Resizeable(Math.random()*100);
            } else {
                ((Square) shape).Resizeable(Math.random()*100);
            }
        }
        System.out.println("********************** Before resize **********************");
        for (Shape shape : shapes) {
            System.out.println(shape);
            System.out.println("------------------");
        }

    }
}