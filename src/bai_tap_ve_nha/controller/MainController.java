//package bai_tap_ve_nha.controller;
//
//import bai_tap_ve_nha.model.Car;
//import bai_tap_ve_nha.service.Icar;
//import bai_tap_ve_nha.service.impl.CarService;
//
//import java.util.Scanner;
//
//public class MainController {
//    private static Icar icar = new ICar();
//    public static void main(String[] args) {
//        boolean flag =true;
//        do {
//            System.out.println("Chức năng của hệ thống " +
//                    "\n 1.Display" +
//                    "\n 2. Add" +
//                    "\n 3.Delete" +
//                    "\n 4. Edit" +
//                    "\n 5. Search" +
//                    "\n 6. Exit");
//            Scanner scanner = new Scanner(System.in);
//            System.out.println("Chọn chức năng");
//            int choose = Integer.parseInt(scanner.nextLine());
//            switch (choose){
//                case 1:
//                    // code display
//                    System.out.println("chức năng hiện thị");
//                    studentService.display();
//                    break;
//                case 2:
//                    // code thêm mới
//                    System.out.println("Chức năng thêm mới");
//                    studentService.add();
//                    break;
//
//                case 3:
//                    // code xóa
//                    System.out.println("chức năng xóa");
//                    break;
//                case 4:
//                    // code sửa
//                    studentService.edit();
//                    System.out.println("chức năng sửa");
//                    break;
//                case 5:
//                    // code tìm kiếm
//                    studentService.searchByName("Chanh");
//                    System.out.println("chức năng tìm kiếm");
//                    break;
//                default:
//                    flag=false;
//            }
//        }while (flag);
//    }
//    }
//}
