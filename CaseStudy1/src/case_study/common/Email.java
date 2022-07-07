package case_study.common;

import case_study.model.Customer;
import case_study.model.Employee;
import case_study.util.check.CheckSyntax;
import case_study.util.read_and_write.ReadAndWriteForCustomer;
import case_study.util.read_and_write.ReadAndWriteForEmployee;

import java.util.List;
import java.util.Scanner;

public class Email {
    public static String checkEmail() {
        Scanner scanner = new Scanner(System.in);
        boolean isOkEmail = true;
        String email;
        do {
            System.out.println("moi nhap email");
            email = scanner.nextLine();

        } while (!CheckSyntax.checkEmail(email));
        return email;
    }

    public static void chageEmailEmployee(int i) {
        List<Employee> employeeList = ReadAndWriteForEmployee.readFile();
        Scanner scanner = new Scanner(System.in);

        String email;
        do {
            System.out.println("moi nhap email");
            email = scanner.nextLine();

        } while (CheckSyntax.checkEmail(email));
        employeeList.get(i).setEmail(email);
        ReadAndWriteForEmployee.writeFile(employeeList,false);
    }

    public static void changeEmailCustomer(int i) {
        List<Customer> customerList = ReadAndWriteForCustomer.readFile();
        Scanner scanner = new Scanner(System.in);

        String email;
        do {
            System.out.println("moi nhap email");
            email = scanner.nextLine();

        } while (CheckSyntax.checkEmail(email));
        customerList.get(i).setEmail(email);
        ReadAndWriteForCustomer.writeFile(customerList,false);
    }
}