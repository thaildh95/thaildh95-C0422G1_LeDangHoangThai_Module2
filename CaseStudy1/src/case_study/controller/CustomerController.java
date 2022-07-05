package case_study.controller;

import case_study.model.Customer;
import case_study.service.impl.CustomerServiceImpl;

import java.util.Scanner;

public class CustomerController {
    static Scanner scanner = new Scanner(System.in);

    public static void displayMenu() {
        boolean flag = true;
        CustomerServiceImpl customerService = new CustomerServiceImpl();
        do {
            System.out.println("Chức năng Customer Management" +
                    "\n 1. Display list customers" +
                    "\n 2. Add new customer" +
                    "\n 3. Edit customer" +
                    "\n 4. Return main menu");
            System.out.println("Chọn chức năng");
            String chosse = scanner.nextLine();
            switch (chosse) {
                case "1":
                    System.out.println("Display list customers");
                    customerService.display();
                    break;
                case "2":
                    System.out.println("Add new customer");
                    customerService.add();
                    break;
                case "3":
                    System.out.println("Edit customer");
                    customerService.edit();
                    break;
                case "4":
                    System.out.println("Return main menu");
                    displayMenu();
                    break;
                default:
                    flag = true;
                    System.err.println("Nhập lại");
            }
        } while (flag);
    }
}