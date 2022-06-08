package ss1_production_to_java.thuc_hanh;

import java.util.Scanner;

public class nam_nhuan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("moi nhap nam");
        int year = sc.nextInt();
        if (year%4==0 && year%100!=0 ){
            System.out.println(year + "la nam nhuan");

        }else if (year% 400==0){
            System.out.println(year+"la nam nhuan");
        }else{
            System.out.println(year +"khong phai nam nhuan");
        }

    }
}
