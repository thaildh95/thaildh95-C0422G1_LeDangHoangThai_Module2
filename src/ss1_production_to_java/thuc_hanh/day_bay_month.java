package ss1_production_to_java.thuc_hanh;

import java.util.Scanner;

public class day_bay_month {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap thang ");
        int month = sc.nextInt();
        String dayIsMonth = "";

        switch (month) {
            case 2:
                dayIsMonth = "28 hoac 29 ngay";
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                dayIsMonth = "31 ngay";
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                dayIsMonth = "30 ngay";
                break;
            default:
                dayIsMonth = "";

        }
        if (dayIsMonth != "") {
            System.out.printf("The month %d has %s day",month,dayIsMonth);

        }else {
            System.out.println("nhap sai thang roi");
        }


    }
}
