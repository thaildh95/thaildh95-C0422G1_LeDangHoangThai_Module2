package case_study.service.impl;


import case_study.common.*;
import case_study.model.Employee;
import case_study.service.EmployeeService;
import case_study.util.read_and_write.ReadAndWriteForEmployee;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService {
   Scanner scanner = new Scanner(System.in);

    @Override
    public void display() {
        List<Employee> employeeList = ReadAndWriteForEmployee.readFile();
        for (Employee e : employeeList) {
            System.out.println(e);
        }
    }

    @Override
    public void add() {
        List<Employee> employeeList = new ArrayList<>();
        // --------------------------------Nhập tên------------------------

        String name = Name.checkName();

        //-----------------------------nhập ngày tháng năm sinh nhân viên-----------------------

        LocalDate dayOfBirth = DayOfBirth.checkDayOfBirth();

        // ------------------------------Nhập giới tính------------------------------

        String gender = Gender.chooseGender();

        // ----------------------------- Nhập chứng minh nhân dân---------------------
        String id = Id.checkId();

        //----------------------------Nhập số điện thoại---------------------------

        String phone = Phone.checkPhone();
        //-------------------------------Nhập Email-------------------------------------

        String email = Email.checkEmail();


        //------------------------------Nhập mã nhân viên--------------------------------------
        String employeeCode = EmployeeCode.checkEmployeeCode();

        //--------------------------Nhập trình độ học vấn của nhân viên------------------------

        String level = Level.chooseLevel();

        //-----------------------------Nhập chức vụ của nhân viên-------------------------------

        String position = Position.checkPosition();
        //-----------------------------Nhập lương cho nhân viên---------------------------------

        System.out.println("Nhap luong nhan vien");

        int salary = Integer.parseInt(scanner.nextLine());

        employeeList.add(new Employee(name, dayOfBirth, gender, id, phone, email, employeeCode, level, position, salary));

        ReadAndWriteForEmployee.writeFile(employeeList, true);
    }

    @Override
    public void edit() {
        List<Employee> employeeList = ReadAndWriteForEmployee.readFile();
        for (int i = 0; i < employeeList.size(); i++) {
            System.out.println("Id" + (i + 1) + "\t" + employeeList.get(i).getEmployeeCode() + "\t" + "Name" + "\t" + employeeList.get(i).getName());
        }
        System.out.println("moi nhap ma so cua nhan vien can sua");
        String employeeCode = scanner.nextLine();
        for (int i = 0; i < employeeList.size(); i++) {

            if (employeeList.get(i).getEmployeeCode().equals(employeeCode)) {
                String choice;
                do {
                    System.out.println(EditMenu.editMenuEmployee());
                    choice = scanner.nextLine();
                    int salary;
                    switch (choice) {
                        //---------------------------nhập lại tên nhân viên----------------------------------
                        case "1":
                            Name.changeNameEmployee(i);
                            break;
                        //-----------------------------nhập lại ngày sinh của nhân viên--------------------------
                        case "2":
                            DayOfBirth.changeDayOfBirthEmployee(i);
                            break;

                        //-------------------------------nhập lại giới tính nhân viên--------------------------
                        case "3":
                            Gender.changeGenderEmployee(i);
                            break;
                        //---------------------------nhập lại id nhân viên-----------------------------
                        case "4":
                            Id.changeIdEmployee(i);
                            break;
                        //----------------------sửa số điện thoại nhân viên-----------------------
                        case "5":
                            Phone.changePhoneEmployee(i);
                            //-------------------------sửa email nhân viên--------------------------
                        case "6":
                            Email.chageEmailEmployee(i);
                            break;
                        //----------------------------sửa mã nhân viên-----------------------
                        case "7":
                            EmployeeCode.changeEmployeeCode(i);
                            break;

                        //----------------------nhập lại trình độ nhân viên------------------------
                        case "8":
                            Level.changeLevel(i);
                            break;

                        //-----------------------------nhập lại vị trí của nhân viên----------------------
                        case "9":
                            Position.changePosition(i);
                            break;
                        //----------------------------nhập lại lương nhân viên-----------------------
                        case "10":
                            System.out.println("Nhap luong nhan vien");
                            salary = Integer.parseInt(scanner.nextLine());
                            employeeList.get(i).setSalary(salary);
                            break;
                        case "11":
                            ReadAndWriteForEmployee.writeFile(employeeList, false);
                            System.out.println("Edited");
                            break;
                    }
                } while (!choice.equals("11"));
            }
        }
    }
}

