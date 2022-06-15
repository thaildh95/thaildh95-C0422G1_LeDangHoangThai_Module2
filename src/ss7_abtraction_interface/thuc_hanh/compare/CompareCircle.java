package ss7_abtraction_interface.thuc_hanh.compare;

import ss6_inheritance.bai_tap.Circle;

public class CompareCircle extends Circle implements Comparable<CompareCircle> {
    public CompareCircle(double radius, String color) {
        super(radius, color);
    }

    public CompareCircle() {
    }

    @Override
    public int compareTo(CompareCircle o) {
        if (getRadius()>o.getRadius()) return 1;
        else if (getRadius()<o.getRadius()) return -1;
        else return 1;
    }


}
