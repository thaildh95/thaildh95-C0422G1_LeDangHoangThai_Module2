package ss7_abtraction_interface.bai_tap.Resize;

public class Square extends Shape implements Resizeable{
    private double side ;
    public Square() {
    }
    public Square(double side) {
        this.side = side ;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public Square(String color, boolean filled) {
        super(color, filled);
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                '}' + super.toString();
    }

    @Override
    public void Resizeable(double percent) {
        setSide(getSide()*(1+getSide()*percent));

    }
}
