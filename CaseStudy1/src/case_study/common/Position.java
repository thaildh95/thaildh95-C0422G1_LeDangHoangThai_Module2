package case_study.common;

import case_study.model.Employee;
import case_study.util.read_and_write.ReadAndWriteForEmployee;

import java.util.List;
import java.util.Scanner;

public class Position {


    public static String checkPosition() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Chức vụ " +
                "\n 1. Lễ tân" +
                "\n 2. Phục vụ" +
                "\n 3. Chuyên viên" +
                "\n 4. Giám sát" +
                "\n 5. Quản lý" +
                "\n 6. Giám đốc");
        boolean isOkPosition = true;
        String position = null;
        String choicePosition;
        do {
            choicePosition = scanner.nextLine();

        switch (choicePosition) {
            case "1":
                position = "Le tan";
                isOkPosition = false;
                break;
            case "2":
                position = "Phuc vu";
                isOkPosition = false;
                break;
            case "3":
                position = "Chuyen vien";
                isOkPosition = false;
                break;
            case "4":
                position = " Giam sat ";
                isOkPosition = false;
                break;
            case "5":
                position = "Quan li";
                isOkPosition = false;
                break;
            case "6":
                position = "Giam doc";
                isOkPosition = false;
                break;
        }
        }while (isOkPosition);
        return position;
    }
    public static void changePosition(int i) {
        List<Employee> employeeList = ReadAndWriteForEmployee.readFile();
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Chức vụ " +
                "\n 1. Lễ tân" +
                "\n 2. Phục vụ" +
                "\n 3. Chuyên viên" +
                "\n 4. Giám sát" +
                "\n 5. Quản lý" +
                "\n 6. Giám đốc");
        boolean isOkPosition = true;

        String choicePosition;
        do {
            choicePosition = scanner.nextLine();

            switch (choicePosition) {
                case "1":
                    employeeList.get(i).setPosition("Lễ tân");
                    isOkPosition = false;
                    break;
                case "2":
                    employeeList.get(i).setPosition("Phục vụ");
                    isOkPosition = false;
                    break;
                case "3":
                    employeeList.get(i).setPosition("Chuyên viên");
                    isOkPosition = false;
                    break;
                case "4":
                    employeeList.get(i).setPosition("Giám sát");
                    isOkPosition = false;
                    break;
                case "5":
                    employeeList.get(i).setPosition("Quản lí");
                    isOkPosition = false;
                    break;
                case "6":
                    employeeList.get(i).setPosition("Giám đốc");
                    isOkPosition = false;
                    break;
            }
        }while (isOkPosition);
        ReadAndWriteForEmployee.writeFile(employeeList,false);

    }
}