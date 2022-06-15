package ss6_inheritance.bai_tap;

public class Cylinder extends Circle {
    double height;
    public Cylinder(){

    }

    public Cylinder(double radius, String color) {
        super(radius, color);
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                ", height=" + height +
                '}';
    }
    public double volum(){
        return this.height*super.getArea();
    }

}
