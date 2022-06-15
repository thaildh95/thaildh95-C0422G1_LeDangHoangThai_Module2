package ss7_abtraction_interface.bai_tap.Resize;

public class Circle extends Shape implements Resizeable{
    private double radius;
    public Circle() {
    }
    public Circle(double radius){
        this.radius = radius;
    }

    public Circle(String color, boolean filled) {
        super(color, filled);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public void Resizeable(double percent) {
        setRadius(getRadius()*(1+getRadius()*percent));

    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}'+super.toString();
    }
}
