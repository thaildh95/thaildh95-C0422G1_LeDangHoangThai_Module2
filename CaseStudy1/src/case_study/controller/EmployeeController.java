package case_study.controller;

import case_study.service.impl.EmployeeServiceImpl;

import java.util.Scanner;

public class EmployeeController {
    public static void employeeMenu() {
        Scanner scanner = new Scanner(System.in);
        EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
        String chosse;
        do {
            System.out.println(
                    "1\tDisplay list employees\n" +
                            "2\tAdd new employee\n" +
                            "3\tEdit employee\n" +
                            "4\tReturn main menu\n");
            System.out.println("Chọn chức năng");
            chosse = scanner.nextLine();
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
                    break;
                default:
                    System.err.println("Nhập lại");
            }
        } while (!chosse.equals("4"));
    }
}

