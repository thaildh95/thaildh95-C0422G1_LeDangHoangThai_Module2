package ss7_abtraction_interface.thuc_hanh.comparator;

import ss6_inheritance.bai_tap.Circle;

import java.util.Comparator;

public class CircleComparator2 implements Comparator<Circle> {
    @Override
    public int compare(Circle o1, Circle o2) {
        if (o1.getArea()> o2.getArea()) return 1;
        else if (o1.getArea()< o2.getArea()) return -1;
        else return 0;
    }
}
