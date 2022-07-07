package case_study.common;

import case_study.model.Customer;
import case_study.model.Employee;
import case_study.util.check.CheckSyntax;
import case_study.util.read_and_write.ReadAndWriteForCustomer;
import case_study.util.read_and_write.ReadAndWriteForEmployee;

import java.util.List;
import java.util.Scanner;

public class Phone {
    public static String checkPhone(){
        Scanner scanner = new Scanner(System.in);
        String phone;
        do {
            System.out.println("nhap so dien thoai cua khach hang ");
            phone = scanner.nextLine();
        } while (!CheckSyntax.checkPhone(phone));
        return phone;
    }
    public static void changePhoneEmployee(int i){
        List<Employee> employeeList = ReadAndWriteForEmployee.readFile();
        Scanner scanner = new Scanner(System.in);
        String phone;
        do {
            System.out.println("nhap so dien thoai cua khach hang ");
            phone = scanner.nextLine();
        } while (!CheckSyntax.checkPhone(phone));
        employeeList.get(i).setPhone(phone);
        ReadAndWriteForEmployee.writeFile(employeeList,false);
    }
    public static void changePhoneCustomer(int i){
        List<Customer> customerList = ReadAndWriteForCustomer.readFile();
        Scanner scanner = new Scanner(System.in);
        String phone;
        do {
            System.out.println("nhap so dien thoai cua khach hang ");
            phone = scanner.nextLine();
        } while (!CheckSyntax.checkPhone(phone));
        customerList.get(i).setPhone(phone);
        ReadAndWriteForCustomer.writeFile(customerList,false);
    }
}
