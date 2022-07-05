package case_study.controller;

import case_study.service.EmployeeService;
import case_study.service.impl.EmployeeServiceImpl;

import java.util.Scanner;

public class FuramaController {
    public static Scanner scanner = new Scanner(System.in);
    public static EmployeeService employeeService = new EmployeeServiceImpl();

    public static void displayMenu() {
        while (true){
            System.out.println("Chức năng hệ thống" +
                    "\n 1. Employee Management" +
                    "\n 2. Customer Management" +
                    "\n 3. Facility Management" +
                    "\n 4. Booking Management" +
                    "\n 5. Promotion Management" +
                    "\n 6. Exit");
            System.out.println("Chọn chức năng");
            String choose = scanner.nextLine();
            switch (choose) {
                case "1":
                    System.out.println("Employee Management");
                    EmployeeController.employeeMenu();
                    break;
                case "2":
                    System.out.println("Customer Management");
                    CustomerController.displayMenu();
                    break;
                case "3":
                    System.out.println("Facility Management");
                    FacilityController.displayFacilityMenu();
                    break;
                case "4":
//                    System.out.println("Booking Management");
//                    displayBooking();
                    break;
                case "5":
//                    System.out.println("Promotion Management");
//                    displayPromotion();
                    break;
                case "6":
                    System.exit(6);
                    break;
                default:
                    System.err.println("Nhập lại");
            }
        }
    }

    private static void displayEmployee() {
        boolean flag = true;
        do {
            System.out.println("Chức năng Employee Management" +
                    "\n 1. Display list employees" +
                    "\n 2. Add new employee" +
                    "\n 3. Edit employee" +
                    "\n 4. Return main menu");
            System.out.println("Chọn chức năng");
            String chosse = scanner.nextLine();
            switch (chosse) {
                case "1":
                    System.out.println("Display list employees");
                    employeeService.display();
                    break;
                case "2":
                    System.out.println("Add new employee");
                    employeeService.add();
                    break;
                case "3":
                    System.out.println("Edit employee");
                    employeeService.edit();
                    break;
                case "4":
                    System.out.println("Return main menu");
                    displayMenu();
                    break;
                default:
                    flag = true;
                    System.err.println("Nhập lại");
            }
        } while (flag = true);
    }
}