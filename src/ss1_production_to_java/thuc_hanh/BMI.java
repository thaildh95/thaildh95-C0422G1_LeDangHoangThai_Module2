package ss1_production_to_java.thuc_hanh;

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        float bmi, weight, height;
        Scanner sc = new Scanner(System.in);
        System.out.println("moi nhap can nang");
        weight = sc.nextFloat();
        System.out.println("moi nhap chieu cao");
        height = sc.nextFloat();


        bmi = weight/(height*height);
                if(bmi<18.5){
                    System.out.println("Underweight");
                }else if (18.5<=bmi && bmi<25){
                    System.out.println("normal");
                }else if (25<=bmi && bmi<30){
                    System.out.println("Overweight");
                }else if (bmi >=30){
                    System.out.println("obese");
                }

    }
}
