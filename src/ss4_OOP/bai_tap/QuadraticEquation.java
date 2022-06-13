package ss4_OOP.bai_tap;

public class QuadraticEquation {
    double a, b, c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getDiscriminant() {
        double delta = (b * b) - (4 * a * c);
        return delta;
    }

    public double getRoot1() {
        return ((-b) + Math.sqrt(getDiscriminant())) / (2 * a);
    }

    public double getRoot2() {
        return ((-b) - Math.sqrt(getDiscriminant())) / (2 * a);
    }

    public String display() {
        if (getDiscriminant() > 0) {
            return "phương trình có 2 nghiệm x1 = " + getRoot1() + ", x2 = " + getRoot2();
        } else if (getDiscriminant() == 0) {
            return "phương trình có nghiệm kép x1 = x2 = " + getRoot1();
        } else {
            return "phương trình vô nghiệm";
        }
    }
}
