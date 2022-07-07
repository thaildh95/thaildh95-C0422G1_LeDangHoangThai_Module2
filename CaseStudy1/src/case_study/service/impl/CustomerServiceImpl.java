package case_study.service.impl;

import case_study.common.*;
import case_study.model.Customer;

import case_study.service.CustomerService;

import case_study.util.read_and_write.ReadAndWriteForCustomer;


import java.time.LocalDate;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceImpl implements CustomerService {
    Scanner scanner = new Scanner(System.in);


    @Override
    public void display() {
        List<Customer> customerList = ReadAndWriteForCustomer.readFile();
        for (Customer c : customerList) {
            System.out.println(c);
        }
    }

    @Override
    public void add() {
        List<Customer> customerList = new ArrayList<>();

        String name = Name.checkName();  //nhập tên khách hàng

        LocalDate dayOfBirth = DayOfBirth.checkDayOfBirth(); //nhập ngày sinh khách hàng

        String gender = Gender.chooseGender();//nhập giới tính khách hàng

        String id = Id.checkId();//nhập id khách hàng

        String phone = Phone.checkPhone(); //nhập số điện thoại khách hàng

        String email = Email.checkEmail(); //nhập email khách hàng

        String typeOfGuest = TypeOfGuest.checkTypeOfGuest(); //nhập loại khách hàng

        String customerCode = CustomerCode.checkCustomerCode();//nhập mã khách hàng

        System.out.println("Moi nhap dia chi khach hang");
        String address = scanner.nextLine();

        customerList.add(new Customer(name, dayOfBirth, gender, id, phone, email, customerCode, typeOfGuest, address));
        ReadAndWriteForCustomer.writeFile(customerList, true);

    }

    @Override
    public void edit() {
        List<Customer> customerList = ReadAndWriteForCustomer.readFile();
        for (int i = 0; i < customerList.size(); i++) {
            System.out.println("Id" + (i + 1) + "\t" + customerList.get(i).getCustomerCode() + "\t" + "Name" + "\t" + customerList.get(i).getName());
        }
        System.out.println("chon id cua khach hang can sua");
        String customerCode = scanner.nextLine();
        for (int i = 0; i < customerList.size(); i++) {

            if (customerList.get(i).getCustomerCode().equals(customerCode)) {
                String choice;
                do {
                    System.out.println(EditMenu.editMenuCustomer());
                    choice = scanner.nextLine();
                    String address;
                    switch (choice) {
                        case "1":
                            Name.changeNameCustomer(i);//Đổi tên khách hàng
                            break;
                        case "2":
                            DayOfBirth.changeDayOfBirthCustomer(i);// đổi ngày sinh của khách hàng
                            break;
                        case "3":
                            Gender.changeGenderCustomer(i);//nhập lại giới tính khách hàng
                            break;
                        case "4":
                            Id.changeIdCustomer(i);//nhập lại id khách hàng
                            break;
                        case "5":
                            Phone.changePhoneCustomer(i);//nhập lại số điện thoại khách hàng
                            break;
                        case "6":
                           Email.changeEmailCustomer(i);//nhập lại email cho khách hàng
                            break;
                        case "7":
                            CustomerCode.changeCustomerCode(i);// nhập lại mã số khách hàng
                            break;

                        case "8":
                            TypeOfGuest.changeTypeOfGuest(i);//nhập lại loại khách hàng

                        case "9":
                            System.out.println("nhap lai dia chi cho khach hang");
                            address = scanner.nextLine();
                            customerList.get(i).setAddress(address);
                            break;
                        case "10":
                            ReadAndWriteForCustomer.writeFile(customerList, false);
                            System.out.println("Edited");
                            break;
                    }

                } while (!choice.equals("10"));
            }
        }
    }
}
