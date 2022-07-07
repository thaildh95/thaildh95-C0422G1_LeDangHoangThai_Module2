package case_study.common;

import case_study.model.Customer;
import case_study.util.check.CheckSyntax;
import case_study.util.read_and_write.ReadAndWriteForCustomer;

import java.util.List;
import java.util.Scanner;

public class CustomerCode {
    public static String checkCustomerCode() {
        Scanner scanner = new Scanner(System.in);
        String customerCode;

        do {
            System.out.println("nhap ma khach hang ");
            customerCode = scanner.nextLine();

        } while (!CheckSyntax.CustomerCode(customerCode));
        return customerCode;
    }

    public static void changeCustomerCode(int i) {
        List<Customer> customerList = ReadAndWriteForCustomer.readFile();
        Scanner scanner = new Scanner(System.in);
        String customerCode;

        do {
            System.out.println("nhap ma khach hang ");
            customerCode = scanner.nextLine();

        } while (CheckSyntax.CustomerCode(customerCode));
        customerList.get(i).setCustomerCode(customerCode);
        ReadAndWriteForCustomer.writeFile(customerList,false);
    }
}
