package bai_tap_ve_nha.service.impl;

import bai_tap_ve_nha.controller.Transport;
import bai_tap_ve_nha.model.Car;
import bai_tap_ve_nha.service.Icar;

import java.util.ArrayList;
import java.util.Scanner;

public class CarService implements Icar {
    Scanner scanner = new Scanner(System.in);
   private static ArrayList<Car> carArrayList = new ArrayList<>();
   static {
       carArrayList.add(new Car(1001,"toyota",2022,"thai","xe so san",4 ));
       carArrayList.add(new Car(1331,"huyndai",2002,"long","xe so san",8 ));
       carArrayList.add(new Car(1221,"mecedes",2012,"trung","xe so tu dong",6 ));
   }


    @Override
    public void add() {
        System.out.println("nhap bien so xe");
        long licensePlate = Long.parseLong(scanner.nextLine());
        System.out.println("nhap hang san xuat");
        String productName = scanner.nextLine();
        System.out.println("nhap nam san xuat");
        long productYear = Long.parseLong(scanner.nextLine());
        System.out.println("nhap ten chu so huu");
        String ownerName = scanner.nextLine();
        System.out.println("nhap loai xe");
        String type = scanner.nextLine();
        System.out.println("nhap so cho ngoi");
        int seat = Integer.parseInt(scanner.nextLine());
        carArrayList.add(new Car(licensePlate,productName,productYear,ownerName,type,seat));
        display();

    }
    

    @Override
    public void display() {
        for (Car c:carArrayList) {
            System.out.println(c);
        }
    }
}
