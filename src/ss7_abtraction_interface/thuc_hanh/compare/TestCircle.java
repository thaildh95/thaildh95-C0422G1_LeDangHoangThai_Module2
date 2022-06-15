package ss7_abtraction_interface.thuc_hanh.compare;

import java.util.Arrays;

public class TestCircle {
    public static void main(String[] args) {
      CompareCircle[] circles = new CompareCircle[3];
      circles[0]= new CompareCircle(3,"fgyhfg");
      circles[1]= new CompareCircle(8,"blue");
      circles[2]= new CompareCircle(5,"ghgh");

        System.out.println("truoc khi sap xep");
        for (CompareCircle c:circles) {
            System.out.println(c);

            Arrays.sort(circles);
        }
        System.out.println("sau khi sap xep");
        for (CompareCircle c:circles
             ) {
            System.out.println(c);
            
        }
    }
}
