package ss2_Array_loop.thuchanh;

import java.util.Scanner;

public class tinh_tien_lai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so thang vay");
                int month = Integer.parseInt(sc.nextLine()); // so thang vay
        System.out.println("nhap lai suat 1 nam");
            float rate = Float.parseFloat(sc.nextLine());
        System.out.println("nhap so tien vay");
            int tiengoc = Integer.parseInt(sc.nextLine());
        float tienlai = tiengoc*rate/(month*100);

        for (int i = 0; i < month; i++) {
              tienlai += tiengoc*rate/(month*100);

        }
        System.out.println(tienlai);

    }
}
