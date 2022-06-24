package ss14_exception.bai_tap.triangle;

public class Triangle {
    double a, b, c;

    public Triangle() {
    }


    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }
    public void setC(double c) {
        this.c = c;
    }
    @Override
    public String toString() {
        return "Triangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }
    public Triangle(double a, double b, double c) throws IllegalTriangleException {
        if (a <= 0 || b <= 0 || c <= 0) {
            throw new IllegalTriangleException("canh khong duoc be hon hoac bang 0");
        } else if (a + b < c || a + c < b || b + c < a) {
            throw new IllegalTriangleException("khong phai tam giac");
        } else {
            this.a = a;
            this.b = b;
            this.c = c;
        }
    }

    public void check(double a, double b, double c) throws IllegalTriangleException {
        this.setA(a);
        this.setB(b);
        this.setC(c);
    }
}

