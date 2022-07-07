package case_study.common;

import case_study.model.Employee;
import case_study.util.check.Check;
import case_study.util.read_and_write.ReadAndWriteForEmployee;

import java.util.List;
import java.util.Scanner;

public class EmployeeCode {
    public static String checkEmployeeCode(){
        Scanner scanner = new Scanner(System.in);
        String employeeCode;
        do {
            System.out.println("nhap ma nhan vien");
            employeeCode = scanner.nextLine();

        } while (!Check.checkEmployeeCode(employeeCode));
        return employeeCode;
    }

    public static void changeEmployeeCode(int i){
        List<Employee> employeeList = ReadAndWriteForEmployee.readFile();
        Scanner scanner = new Scanner(System.in);
        String employeeCode;
        do {
            System.out.println("nhap ma nhan vien");
            employeeCode = scanner.nextLine();

        } while (Check.checkEmployeeCode(employeeCode));
      employeeList.get(i).setEmployeeCode(employeeCode);
      ReadAndWriteForEmployee.writeFile(employeeList,false);
    }
}
