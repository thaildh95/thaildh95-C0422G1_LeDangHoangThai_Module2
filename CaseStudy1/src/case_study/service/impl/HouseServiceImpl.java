package case_study.service.impl;

import case_study.facility.House;
import case_study.service.HouseService;
import case_study.util.read_and_write.ReadAndWriteForHouse;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class HouseServiceImpl implements HouseService {
    Scanner scanner = new Scanner(System.in);

    @Override
    public void displaylistfacility() {
        Map<House, Integer> houseMap = ReadAndWriteForHouse.readFile();
        Set<House> houseSet = houseMap.keySet();
        for (House v : houseSet) {
            System.out.println(v + "," + houseMap.get(v));
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
        System.out.println("nhap so tang");
        int floor = Integer.parseInt(scanner.nextLine());
        Map<House, Integer> houseMap = new LinkedHashMap<>();
        houseMap.put(new House(serVice, useArea, rentPrice, maximumPeople, typeRent, typeRoom, floor), 0);
       ReadAndWriteForHouse.writeFile(houseMap,true);

    }

    @Override
    public void displayListFacilityMaintenance() {

    }
}
