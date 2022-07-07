package case_study.common;

import case_study.model.Customer;
import case_study.model.Employee;
import case_study.util.read_and_write.ReadAndWriteForCustomer;
import case_study.util.read_and_write.ReadAndWriteForEmployee;

import java.util.List;
import java.util.Scanner;

public class Gender {

    public static String chooseGender() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Giới tính" +
                "\n 1. Nam" +
                "\n 2. Nữ");
        String gender = null;
        String choice;
        boolean isOkGender=true;
        do {
            System.out.println("moi chon gioi tinh ");
            choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    gender = "nam";
                    isOkGender = false;
                    break;
                case "2":
                    gender = "nu";
                    isOkGender = false;
                    break;

            }
        } while (isOkGender);
    return gender;
    }


    public static void changeGenderEmployee(int i) {
        List<Employee> employeeList = ReadAndWriteForEmployee.readFile();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Giới tính" +
                "\n 1. Nam" +
                "\n 2. Nữ");

        String choice;
        boolean isOkGender=true;
        do {
            System.out.println("moi chon gioi tinh ");
            choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    employeeList.get(i).setGender("Nam");
                    isOkGender = false;
                    break;
                case "2":
                    employeeList.get(i).setGender("Nữ");
                    isOkGender = false;
                    break;

            }

        } while (isOkGender);
     ReadAndWriteForEmployee.writeFile(employeeList,false);
    }
    public static void changeGenderCustomer(int i) {
        List<Customer> customerList = ReadAndWriteForCustomer.readFile();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Giới tính" +
                "\n 1. Nam" +
                "\n 2. Nữ");

        String choice;
        boolean isOkGender=true;
        do {
            System.out.println("moi chon gioi tinh ");
            choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    customerList.get(i).setGender("Nam");
                    isOkGender = false;
                    break;
                case "2":
                    customerList.get(i).setGender("Nữ");
                    isOkGender = false;
                    break;

            }

        } while (isOkGender);
        ReadAndWriteForCustomer.writeFile(customerList,false);
    }
}