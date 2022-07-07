package case_study.common;

import case_study.model.Customer;
import case_study.model.Employee;
import case_study.util.check.Check;
import case_study.util.check.CheckSyntax;
import case_study.util.read_and_write.ReadAndWriteForCustomer;
import case_study.util.read_and_write.ReadAndWriteForEmployee;

import java.util.List;
import java.util.Scanner;

public class Name {
    public static String checkName() {
        Scanner scanner = new Scanner(System.in);

        String name = "";
        do {
            System.out.println("mời nhập tên");
            name = scanner.nextLine();

        } while (!CheckSyntax.chekName(name));
        return name;
    }

    public static void changeNameEmployee(int i) {
        List<Employee> employeeList = ReadAndWriteForEmployee.readFile();
        Scanner scanner = new Scanner(System.in);
        String name = "";
        do {
            System.out.println("mời nhập tên");
            name = scanner.nextLine();

        } while (!CheckSyntax.chekName(name));
        employeeList.get(i).setName(name);
        ReadAndWriteForEmployee.writeFile(employeeList,false);

    }
    public static void changeNameCustomer(int i) {
        List<Customer> customerList = ReadAndWriteForCustomer.readFile();
        Scanner scanner = new Scanner(System.in);
        String name = "";
        do {
            System.out.println("mời nhập tên");
            name = scanner.nextLine();

        } while (!CheckSyntax.chekName(name));
        customerList.get(i).setName(name);
        ReadAndWriteForCustomer.writeFile(customerList,false);

    }
}