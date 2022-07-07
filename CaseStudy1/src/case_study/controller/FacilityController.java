package case_study.controller;

import case_study.service.impl.HouseServiceImpl;
import case_study.service.impl.RoomServiceImpl;
import case_study.service.impl.VillaServiceImpl;

import java.util.Scanner;

public class FacilityController {

    public static void displayFacilityMenu() {
        Scanner scanner = new Scanner(System.in);
        VillaServiceImpl villaServiceImpl = new VillaServiceImpl();
        HouseServiceImpl houseServiceImpl = new HouseServiceImpl();
        RoomServiceImpl roomServiceImpl = new RoomServiceImpl();
        boolean flag = true;
        do {

            System.out.println("Chức năng Facility Management" +
                    "\n 1. Display list Facility" +
                    "\n 2. Add new Facility" +
                    "\n 3. Display list facility maintenance" +
                    "\n 4. Return main menu");
            System.out.println("Chọn chức năng");
            String choose = scanner.nextLine();
            switch (choose) {
                case "1":
                    villaServiceImpl.displaylistfacility();
                    houseServiceImpl.displaylistfacility();
                    roomServiceImpl.displaylistfacility();

                    break;

                case "2":
                    String choice;
                    do {

                        System.out.println("chọn dịch vụ để thêm mới" +
                                "\n 1. Villa" +
                                "\n 2. House" +
                                "\n 3. Room" +
                                "\n 4. Return Menu");
                        choice = scanner.nextLine();
                        switch (choice) {
                            case "1":
                                System.out.println("Thêm mới villa");
                                villaServiceImpl.addNewFacility();
                                break;
                            case "2":
                                System.out.println("Thêm mới House");
                                houseServiceImpl.addNewFacility();
                                break;
                            case "3":
                                System.out.println("thêm mới Room");
                                roomServiceImpl.addNewFacility();
                                break;
                            case "4":
                                System.out.println("Return main menu");
                                break;

                        }
                    } while (!choice.equals("4"));
                    break;
            }
        } while (!flag);
    }
}
//         case "1":
//                 System.out.println("Display list Facility Management");
//                 break;
//                 case "2":
//                 System.out.println("Add new Facility");
//                 villaService.addNewFacility();
//                 break;
//                 case "3":
//                 System.out.println("Display list facility maintenance");
//                 break;
//                 case "4":
//                 System.out.println("Return main menu");
//
//                 break;
//default:
//        flag = true;
//        System.err.println("Nhập lại");