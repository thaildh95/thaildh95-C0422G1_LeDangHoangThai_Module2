package ss7_abtraction_interface.bai_tap.Resize;

public class Rectangle extends Shape implements Resizeable {
    private double height;
    private double widht;

    public Rectangle() {

    }

    public Rectangle(double height, double widht) {
        this.height = height;
        this.widht = widht;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidht() {
        return widht;
    }

    public void setWidht(double widht) {
        this.widht = widht;
    }

    @Override
    public void Resizeable(double percent) {
        setWidht(getWidht()*(1+getWidht()*percent));
        setHeight(getHeight()*(1+getHeight()*percent));
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "height=" + height +
                ", widht=" + widht +
                '}'+super.toString();
    }
}
