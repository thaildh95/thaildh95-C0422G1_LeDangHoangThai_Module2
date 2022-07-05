package case_study.service.impl;

import case_study.common.EditMenu;
import case_study.common.Gender;
import case_study.common.TypeOfGuest;
import case_study.model.Customer;

import case_study.service.CustomerService;
import case_study.util.check.*;
import case_study.util.read_and_write.ReadAndWriteForCustomer;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
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

        System.out.println("moi nhap ten khach hang (ten chu cai dau phai viet hoa ) ");
        String name = scanner.nextLine();

        boolean isOkDayOfBirth;
        LocalDate dayOfBirth = null ;
        do {
            isOkDayOfBirth = false;

        try {
            System.out.println("moi nhap ngay thang nam sinh (dd/MM/yyyy) ");
            String day = scanner.nextLine();
            dayOfBirth = LocalDate.parse(day, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                if (dayOfBirth.until(LocalDate.now()).getYears()<18 || dayOfBirth.until(LocalDate.now()).getYears()>100){
                    System.out.println("tuoi khong phu hop moi nhap lai");
                    isOkDayOfBirth =true;
                }else {
                    isOkDayOfBirth = false;
                }
        }
        catch (DateTimeParseException e){

        }
        }while (isOkDayOfBirth);

        boolean flag = true;
        String gender = null;
        do {
            System.out.println("moi chon gioi tinh");
            System.out.println("Giới tính" +
                    "\n 1. Nam" +
                    "\n 2. Nữ");
            String choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    gender = "nam";
                    flag = false;
                    break;
                case "2":
                    gender = "nu";
                    flag = false;
                    break;
            }
        } while (flag);

        String id;
        boolean isOke;
        do {
            System.out.println("nhap chung minh nhan dan cua khach hang ");
            id = scanner.nextLine();
            if (CheckSyntaxId.chekId(id) && !Check.CheckIdEmployee(id) && !Check.CheckIdCustomer(id)) {
                isOke = false;
            } else {
                System.out.println("chung minh da co hoac sai dinh dang");
                isOke = true;
            }

        } while (isOke);

        String phone;
        do {
            System.out.println("nhap so dien thoai cua khach hang ");
            phone = scanner.nextLine();

        } while (!CheckPhoneSyntax.checkPhone(phone));
        System.out.println("moi nhap email cua khach hang ");
        String email = scanner.nextLine();
        String typeOfGuest = null;
        String choiceTypeOfGuest;

        do {
            System.out.println(TypeOfGuest.typeOfGuests());
            System.out.println("Chọn loại khách hàng");

            choiceTypeOfGuest = scanner.nextLine();
            switch (choiceTypeOfGuest) {
                case "1":
                    typeOfGuest = "Member";
                    break;
                case "2":
                    typeOfGuest = "Silver";
                    break;
                case "3":
                    typeOfGuest = "Gold";
                    break;
                case "4":
                    typeOfGuest = "Platinum";
                    break;
                case "5":
                    typeOfGuest = "Diamond";
                    break;
            }
        } while (choiceTypeOfGuest.equals("5"));

        String customerCode;

        do {
            System.out.println("nhap ma khach hang ");
            customerCode = scanner.nextLine();

        } while (CheckSyntaxCustomerCode.CustomerCode(customerCode));
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
            boolean flag = true;
            if (customerList.get(i).getCustomerCode().equals(customerCode)) {
                String choice;
                do {
                    System.out.println(EditMenu.editMenuCustomer());
                    choice = scanner.nextLine();
                    String name;
                    LocalDate dayOfBirth=null;
                    String id;
                    String phone;
                    String email;
                    String typeOfGuest;
                    String address;

                    switch (choice) {
                        case "1":
                            System.out.println("moi nhap lai ten cho khach hang (chu cai dau phai viet hoa)");
                            name = scanner.nextLine();
                            customerList.get(i).setName(name);
                            break;
                        case "2":
                            boolean isOkDayOfBirth;

                            do {
                                isOkDayOfBirth = false;

                                try {
                                    System.out.println("moi nhap ngay thang nam sinh (dd/MM/yyyy) ");
                                    String day = scanner.nextLine();
                                    dayOfBirth = LocalDate.parse(day, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                                    if (dayOfBirth.until(LocalDate.now()).getYears()<18 || dayOfBirth.until(LocalDate.now()).getYears()>100){
                                        System.out.println("tuoi khong phu hop moi nhap lai");
                                        isOkDayOfBirth =true;
                                    }else {
                                        isOkDayOfBirth = false;
                                    }
                                }
                                catch (DateTimeParseException e){

                                }
                            }while (isOkDayOfBirth);
                            customerList.get(i).setDayOfBirth(dayOfBirth);
                            break;
                        case "3":
                            String choiceGender = null;
                            do {
                                System.out.println(Gender.gender());
                                choiceGender = scanner.nextLine();
                                switch (choiceGender) {
                                    case "1":
                                        customerList.get(i).setGender("nam");
                                        break;
                                    case "2":
                                        customerList.get(i).setGender("nữ");
                                        break;
                                    case "3":
                                        customerList.get(i).setGender("khác");
                                        break;
                                }
                            } while (choiceGender.equals("3"));
                            break;
                        case "4":

                            Boolean isOkId = true;
                            do {
                                System.out.println("moi nhap lai so cmnd cho khach hang");
                                id = scanner.nextLine();
                                if (!Check.CheckIdCustomer(id) && CheckSyntaxId.chekId(id)) {
                                    isOkId = false;
                                } else {
                                    isOkId = true;
                                }
                            } while (isOkId);
                            customerList.get(i).setId(id);
                            break;
                        case "5":
                            Boolean isOkPhone = true;
                            do {
                                System.out.println("moi sua lai so dien thoai cho khach hang");
                                phone = scanner.nextLine();
                                if (CheckPhoneSyntax.checkPhone(phone)) {
                                    isOkPhone = false;
                                } else {
                                    isOkPhone = true;
                                }
                            } while (isOkPhone);
                            customerList.get(i).setPhone(phone);
                            break;
                        case "6":
                            System.out.println("moi nhap lai email cho khach hang");
                            email = scanner.nextLine();
                            customerList.get(i).setEmail(email);
                            break;
                        case "7":
                            boolean isOkCode;
                            do {
                                customerCode = scanner.nextLine();
                                if (!Check.checkCustomerCode(customerCode)) {
                                    isOkCode = false;
                                } else {
                                    isOkCode = true;
                                }
                            } while (isOkCode);
                            customerList.get(i).setCustomerCode(customerCode);
                            break;
                        case "8":
                            String choiceTypeOfGuest="";
                            do {
                                System.out.println(TypeOfGuest.typeOfGuests());
                                System.out.println("cap nhat lai loai khach hang");
                               choiceTypeOfGuest = scanner.nextLine();
                                switch (choiceTypeOfGuest) {
                                    case "1":
                                        customerList.get(i).setTypeOfGuest("Member");
                                        break;
                                    case "2":
                                        customerList.get(i).setTypeOfGuest("Silver");
                                        break;
                                    case "3":
                                        customerList.get(i).setTypeOfGuest("Gold");
                                        break;
                                    case "4":
                                        customerList.get(i).setTypeOfGuest("Platinum");
                                        break;
                                    case "5":
                                        customerList.get(i).setTypeOfGuest("Diamond");
                                        break;
                                }
                            } while (choiceTypeOfGuest.equals("5"));
                            break;

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
