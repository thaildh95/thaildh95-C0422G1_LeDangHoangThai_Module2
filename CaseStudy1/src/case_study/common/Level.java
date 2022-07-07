package case_study.common;

import case_study.model.Employee;
import case_study.util.read_and_write.ReadAndWriteForEmployee;

import java.util.List;
import java.util.Scanner;

public class Level {


    public static String chooseLevel(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("CHọn Trình độ " +
                "\n 1. Trung cấp" +
                "\n 2. Cao đẳng" +
                "\n 3. Đại học" +
                "\n 4. Sau đại học");
        String choiceLevel;
        String level=null;
        boolean isOkLevel = true;
        do {
            System.out.println("chon trinh do cua nhan vien");
            choiceLevel = scanner.nextLine();

        switch (choiceLevel) {
            case "1":
                level = "Trung Cap";
                isOkLevel = false;
                break;
            case "2":
                level = "Cao Dang";
                isOkLevel = false;
                break;
            case "3":
                level = "Dai Hoc";
                isOkLevel = false;
                break;
            case "4":
                level = "khong di hoc";
                isOkLevel = false;
                break;
        }
        return level;

    }while (isOkLevel);
}
    public static void changeLevel(int i){
        List<Employee> employeeList = ReadAndWriteForEmployee.readFile();
        Scanner scanner = new Scanner(System.in);
        System.out.println("CHọn Trình độ " +
                "\n 1. Trung cấp" +
                "\n 2. Cao đẳng" +
                "\n 3. Đại học" +
                "\n 4. Sau đại học");
        String choiceLevel;
        String level=null;
        boolean isOkLevel = true;
        do {
            System.out.println("chon trinh do cua nhan vien");
            choiceLevel = scanner.nextLine();

            switch (choiceLevel) {
                case "1":
                   employeeList.get(i).setLevel("Trung cấp");
                    isOkLevel = false;
                    break;
                case "2":
                    employeeList.get(i).setLevel("Cao đẳng");
                    isOkLevel = false;
                    break;
                case "3":
                    employeeList.get(i).setLevel("Đại học");
                    isOkLevel = false;
                    break;
                case "4":
                    employeeList.get(i).setLevel("Thạc sĩ");
                    isOkLevel = false;
                    break;
            }


        }while (isOkLevel);

        ReadAndWriteForEmployee.writeFile(employeeList,false);
    }
}