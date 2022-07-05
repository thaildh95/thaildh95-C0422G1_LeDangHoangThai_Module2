package case_study.service.impl;

import case_study.facility.Villa;
import case_study.service.VillaService;
import case_study.util.read_and_write.ReadAndWriteForVilla;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class VillaServiceImpl implements VillaService {
    Scanner scanner = new Scanner(System.in);

    @Override
    public void displaylistfacility() {
    Map<Villa,Integer> villaMap = ReadAndWriteForVilla.readFile();
        Set<Villa> villaSet = villaMap.keySet();
        for (Villa v: villaSet) {
            System.out.println(v + "," + villaMap.get(v));
        }

    }

    @Override
    public void addNewFacility() {
        System.out.println("moi nhap ten dich vu");
        String serVice = scanner.nextLine();
        System.out.println("nhap dien tich su dung");
        double useArea = Double.parseDouble(scanner.nextLine());
        System.out.println("nhap gia thue ");
        double rentPrice = Double.parseDouble(scanner.nextLine());
        System.out.println("nhap so nguoi thue toi da");
        int maximumPeople = Integer.parseInt(scanner.nextLine());

        System.out.println("kieu thue");
        String typeRent = null;
        String choiceTypeRent;
        do {

            System.out.println("Chọn kiểu thuê " +
                    "\n 1. Theo giờ" +
                    "\n 2. Theo ngày" +
                    "\n 3. Theo tháng" +
                    "\n 4. Theo năm");
            choiceTypeRent = scanner.nextLine();
            switch (choiceTypeRent) {
                case "1":
                    typeRent = "Thuê theo giờ";
                    break;
                case "2":
                    typeRent = "Thuê theo ngày";
                    break;
                case "3":
                    typeRent = "Thuê theo tháng";
                    break;
                case "4":
                    typeRent = "Thuê theo năm";
                    break;
            }
        } while (choiceTypeRent.equals("4"));

        System.out.println("nhap loai phong ");
        String typeRoom = scanner.nextLine();
        System.out.println("nhap dien tich ho boi");
        double poolArea = Double.parseDouble(scanner.nextLine());
        System.out.println("nhap so tang");
        int floor = Integer.parseInt(scanner.nextLine());
        Map<Villa, Integer> villaMap = new LinkedHashMap<>();
        villaMap.put(new Villa(serVice, useArea, rentPrice, maximumPeople, typeRent, typeRoom, poolArea, floor), 0);
        ReadAndWriteForVilla.writeFile(villaMap,true);
    }

    @Override
    public void displayListFacilityMaintenance() {

    }


}
