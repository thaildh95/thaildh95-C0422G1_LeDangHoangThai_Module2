package ss1_production_to_java.bai_tap;

import java.util.Scanner;

public class doc_so {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("moi nhap so");
        int number = sc.nextInt();
        int a = number%10;
        int b = (number/10)%10;
        int c = number/100;

        switch (c){
            case 1:
                System.out.print(" mot tram ");
                break;
            case 2:
                System.out.print(" hai tram ");
                break;
            case 3:
                System.out.print(" ba tram ");
                break;
            case 4:
                System.out.print(" bon  tram ");
                break;
            case 5:
                System.out.print(" nam tram ");
                break;
            case 6:
                System.out.print(" sau tram ");
                break;
            case 7:
                System.out.print(" bay tram ");
                break;
            case 8:
                System.out.print(" tam tram ");
                break;
            case 9:
                System.out.print(" chin tram ");
                break;

        }
        switch (b){
            case 1:
                System.out.print("muoi ");
                break;
            case 2:
                System.out.print("hai muoi ");
                break;
            case 3:
                System.out.print("ba muoi ");
                break;
            case 4:
                System.out.print("bon muoi ");
                break;
            case 5:
                System.out.print("nam muoi ");
                break;
            case 6:
                System.out.print("sau muoi ");
                break;
            case 7:
                System.out.print("bay muoi ");
                break;
            case 8:
                System.out.print("tam muoi ");
                break;
            case 9:
                System.out.print("chin muoi ");
                break;

        }
        switch (a){
            case 1:
                System.out.print("mot");
                break;
            case 2:
                System.out.print("hai");
                break;
            case 3:
                System.out.print("ba");
                break;
            case 4:
                System.out.print("bon");
                break;
            case 5:
                System.out.print("nam");
                break;
            case 6:
                System.out.print("sau");
                break;
            case 7:
                System.out.print("bay");
                break;
            case 8:
                System.out.print("tam");
                break;
            case 9:
                System.out.print("chin");
                break;


        }




    }
}
