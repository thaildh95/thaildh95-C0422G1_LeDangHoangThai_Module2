package case_study.service.impl;

import case_study.facility.House;
import case_study.facility.Room;
import case_study.facility.Villa;
import case_study.service.RoomService;

import case_study.util.read_and_write.ReadAndWriteForRoom;
import case_study.util.read_and_write.ReadAndWriteForVilla;


import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class RoomServiceImpl implements RoomService {
    Scanner scanner = new Scanner(System.in);

    @Override
    public void displaylistfacility() {
        Map<Room,Integer> roomMap = ReadAndWriteForRoom.readFile();
        Set<Room> roomSet = roomMap.keySet();
        for (Room v: roomSet) {
            System.out.println(v + "," + roomMap.get(v));
        }

    }

    @Override
    public void addNewFacility() {
        System.out.println("moi nhap ten dich vu");
        String serviceName = scanner.nextLine();
        System.out.println("nhap dien tich su dung");
        double useArea = Double.parseDouble(scanner.nextLine());
        System.out.println("nhap gia thue ");
        double rentPrice = Double.parseDouble(scanner.nextLine());
        System.out.println("nhap so nguoi thue toi da");
        int maximumPeople = Integer.parseInt(scanner.nextLine());

        System.out.println("kieu thue");
        String rentType = null;
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
                    rentType = "Thuê theo giờ";
                    break;
                case "2":
                    rentType = "Thuê theo ngày";
                    break;
                case "3":
                    rentType = "Thuê theo tháng";
                    break;
                case "4":
                    rentType = "Thuê theo năm";
                    break;
            }
        } while (choiceTypeRent.equals("4"));


        System.out.println("nhap dich vu mien phi");
        String freeService = scanner.nextLine();
        Map<Room, Integer> roomMap = new LinkedHashMap<>();
        roomMap.put(new Room(serviceName,useArea,rentPrice,maximumPeople,rentType,freeService),0);
        ReadAndWriteForRoom.writeFile(roomMap,true);

    }


    @Override
    public void displayListFacilityMaintenance() {

    }
}
