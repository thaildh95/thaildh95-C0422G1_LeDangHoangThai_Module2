package case_study.common;

import case_study.model.Customer;
import case_study.model.Employee;
import case_study.util.check.Check;
import case_study.util.check.CheckSyntax;
import case_study.util.read_and_write.ReadAndWriteForCustomer;
import case_study.util.read_and_write.ReadAndWriteForEmployee;

import java.util.List;
import java.util.Scanner;

public class Id {
    public static String checkId(){
        Scanner scanner = new Scanner(System.in);
        String id;
        boolean isOke;
        do {
            System.out.println("nhap chung minh nhan dan cua khach hang ");
            id = scanner.nextLine();
            if (CheckSyntax.checkId(id) && !Check.CheckIdEmployee(id) && !Check.CheckIdCustomer(id)) {
                isOke = false;
            } else {
                System.out.println("chung minh da co hoac sai dinh dang");
                isOke = true;
            }
        } while (isOke);
        return id;
    }

    public static void changeIdEmployee(int i){
        List<Employee> employeeList = ReadAndWriteForEmployee.readFile();

        Scanner scanner = new Scanner(System.in);
        String id;
        boolean isOke;
        do {
            System.out.println("nhap chung minh nhan dan cua khach hang ");
            id = scanner.nextLine();
            if (CheckSyntax.checkId(id) && !Check.CheckIdEmployee(id) && !Check.CheckIdCustomer(id)) {
                isOke = false;
            } else {
                System.out.println("chung minh da co hoac sai dinh dang");
                isOke = true;
            }
        } while (isOke);
        employeeList.get(i).setId(id);
        ReadAndWriteForEmployee.writeFile(employeeList,false);

    }
    public static void changeIdCustomer(int i){
        List<Customer> customerList = ReadAndWriteForCustomer.readFile();

        Scanner scanner = new Scanner(System.in);
        String id;
        boolean isOke;
        do {
            System.out.println("nhap chung minh nhan dan cua khach hang ");
            id = scanner.nextLine();
            if (CheckSyntax.checkId(id) && !Check.CheckIdCustomer(id)) {
                isOke = false;
            } else {
                System.out.println("chung minh da co hoac sai dinh dang");
                isOke = true;
            }
        } while (isOke);
        customerList.get(i).setId(id);
        ReadAndWriteForCustomer.writeFile(customerList,false);


    }
}
