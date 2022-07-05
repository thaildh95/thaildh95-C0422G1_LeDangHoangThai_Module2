package case_study.util.read_and_write;

import case_study.model.Customer;


import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteForCustomer {
    public static List<Customer> readFile() {
        List<Customer> customerList = new ArrayList<>();
        File file = new File("src/case_study/data/customedata.csv");
        FileReader fileReader;
        BufferedReader bufferedReader;
        String string;
        String[] arr;
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            while ((string = bufferedReader.readLine()) != null) {
                arr = string.split(",");
                customerList.add(new Customer(arr[0], LocalDate.parse(arr[1]), arr[2], arr[3], arr[4], arr[5], arr[6], arr[7], arr[8]));
                //        String name, LocalDate dayOfBirth, String gender, String id, String phone,
//                String email, String customerCode, String guestOfType, String address) {
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return customerList;
    }

    public static  void writeFile(List<Customer> customerList, Boolean append) {
        File file = new File("src/case_study/data/customedata.csv");
        FileWriter fileWriter;
        BufferedWriter bufferedWriter;
        try {
            fileWriter = new FileWriter(file,append);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (Customer e: customerList) {
                bufferedWriter.write(e.getCustomerInfo());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
