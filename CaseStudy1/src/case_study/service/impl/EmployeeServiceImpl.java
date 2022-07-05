package case_study.service.impl;


import case_study.common.EditMenu;
import case_study.common.Gender;
import case_study.common.Level;
import case_study.model.Employee;
import case_study.service.EmployeeService;
;
import case_study.util.check.Check;
import case_study.util.check.CheckPhoneSyntax;
import case_study.util.check.CheckSyntaxId;
import case_study.util.read_and_write.ReadAndWriteForEmployee;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
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
//        String name, LocalDate dayOfBirth, String gender, String id, String phone, String email,
//                String employeeCode, String level, String position, int salary) {
        System.out.println("moi nhap ten ");
        String name = scanner.nextLine();
        boolean isOkDayOfBirth;
        LocalDate dayOfBirth = null;
        do {
            isOkDayOfBirth = false;

            try {
                System.out.println("moi nhap ngay thang nam sinh (dd/MM/yyyy) ");
                String day = scanner.nextLine();
                dayOfBirth = LocalDate.parse(day, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                if (dayOfBirth.until(LocalDate.now()).getYears() < 18 || dayOfBirth.until(LocalDate.now()).getYears() > 100) {
                    System.out.println("tuoi khong phu hop moi nhap lai");
                    isOkDayOfBirth = true;
                } else {
                    isOkDayOfBirth = false;
                }           } catch (DateTimeParseException e) {
                System.err.println("nhap khong dung moi nhap lai");

            }
        } while (isOkDayOfBirth);

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
                    gender = " nu";
                    flag = false;
                    break;
            }
        } while (flag);

        String id;
        boolean isOke = true;
        do {
            System.out.println("nhap chung minh nhan dan");
            id = scanner.nextLine();
            if (CheckSyntaxId.chekId(id) && !Check.CheckIdEmployee(id)) {
                isOke = false;
            } else {
                System.out.println("chung minh da co hoac sai dinh dang");
                isOke = true;
            }

        } while (isOke);

        String phone;
        do {
            System.out.println("nhap so dien thoai");
            phone = scanner.nextLine();

        } while (!CheckPhoneSyntax.checkPhone(phone));
        System.out.println("moi nhap email");
        String email = scanner.nextLine();

        String employeeCode;
        do {
            System.out.println("nhap ma nhan vien");
            employeeCode = scanner.nextLine();

        } while (Check.checkEmployeeCode(employeeCode));
        String level = null;
        String choiceLevel = "";
        do {
            System.out.println(Level.getLevel());
            System.out.println("chon trinh do hoc van");

            choiceLevel = scanner.nextLine();
            switch (choiceLevel) {

                case "1":
                    level = "Trung Cap";
                    break;
                case "2":
                    level = "Cao Dang";
                    break;
                case "3":
                    level = "Dai Hoc";
                    break;
                case "4":
                    level = "khong di hoc";
                    break;
                default:
                    System.out.println("Khong hop le moi chon lai");
                    break;
            }

        } while (choiceLevel.equals("4"));
        String position = null;
        String choicePosition ;
        do {
            System.out.println(" Chức vụ " +
                    "\n 1. Lễ tân" +
                    "\n 2. Phục vụ" +
                    "\n 3. Chuyên viên" +
                    "\n 4. Giám sát" +
                    "\n 5. Quản lý" +
                    "\n 6. Giám đốc");

            choicePosition = scanner.nextLine();
            switch (choicePosition) {
                case "1":
                    position = "Le tan";
                    break;
                case "2":
                    position = "Phuc vu";
                    break;
                case "3":
                    position = "Chuyen vien";
                    break;
                case "4":
                    position = " Giam sat ";
                    break;
                case "5":
                    position = "Quan li";
                    break;
                case "6":
                    position = "Giam doc";
                    break;
                default:
                    System.out.println("khong hop le moi chon lai");
                    break;
            }
        } while (choicePosition!=null);
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

            boolean flag = true;
            if (employeeList.get(i).getEmployeeCode().equals(employeeCode)) {
                String choice = "";
                do {
                    System.out.println(EditMenu.editMenuEmployee());
                    choice = scanner.nextLine();
                    String name;
                    LocalDate dayOfBirth = null;
                    String gender = "";
                    String id;
                    String phone;
                    String email;
                    String level = "";
                    String position = "";
                    int salary = 0;
                    switch (choice) {
                        case "1":
                            System.out.println("moi nhap ten moi ");
                            name = scanner.nextLine();
                            employeeList.get(i).setName(name);
                            break;
                        case "2":
                            boolean isOkDayOfBirth;
                            do {
                                isOkDayOfBirth = false;

                                try {
                                    System.out.println("moi nhap ngay thang nam sinh (dd/MM/yyyy) ");
                                    String day = scanner.nextLine();
                                    dayOfBirth = LocalDate.parse(day, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                                    if (dayOfBirth.until(LocalDate.now()).getYears() < 18 || dayOfBirth.until(LocalDate.now()).getYears() > 100) {
                                        System.out.println("tuoi khong phu hop moi nhap lai");
                                        isOkDayOfBirth = true;
                                    } else {
                                        isOkDayOfBirth = false;
                                    }
                                } catch (DateTimeParseException e) {

                                }
                            } while (isOkDayOfBirth);
                            employeeList.get(i).setDayOfBirth(dayOfBirth);
                            break;
                        case "3":

                            do {
                                System.out.println(Gender.gender());
                                String choiceGender = scanner.nextLine();
                                switch (choiceGender) {

                                    case "1":
                                        gender = "nam";
                                        break;
                                    case "2":
                                        gender = " nu";
                                        break;
                                    case "3":
                                        gender = "không xác định";
                                        break;
                                }
                            } while (!flag);

                            employeeList.get(i).setGender(gender);
                            break;
                        case "4":

                            boolean isOke;
                            do {
                                System.out.println("nhap lai chung minh nhan dan");
                                id = scanner.nextLine();
                                if (CheckSyntaxId.chekId(id) && !Check.CheckIdEmployee(id)) {
                                    isOke = false;
                                } else {
                                    System.out.println("chung minh da co hoac sai dinh dang");
                                    isOke = true;
                                }

                            } while (isOke);
                            employeeList.get(i).setId(id);
                            break;
                        case "5":

                            do {
                                System.out.println("nhap so dien thoai");
                                phone = scanner.nextLine();

                            } while (!CheckPhoneSyntax.checkPhone(phone));
                            employeeList.get(i).setPhone(phone);
                        case "6":
                            System.out.println("moi nhap email");
                            email = scanner.nextLine();
                            employeeList.get(i).setEmail(email);
                            break;
                        case "7":
                            do {
                                System.out.println("nhap ma nhan vien");
                                employeeCode = scanner.nextLine();

                            } while (Check.checkEmployeeCode(employeeCode));
                            employeeList.get(i).setEmployeeCode(employeeCode);
                            break;
                        case "8":
                            String choiceLevel;
                            do {
                                System.out.println(" CHọn Trình độ " +
                                        "\n 1. Trung cấp" +
                                        "\n 2. Cao đẳng" +
                                        "\n 3. Đại học" +
                                        "\n 4. Sau đại học");
                                System.out.println("chon trinh do hoc van");

                                choiceLevel = scanner.nextLine();
                                switch (choiceLevel) {

                                    case "1":
                                        level = "Trung Cap";
                                        break;
                                    case "2":
                                        level = "Cao Dang";
                                        break;
                                    case "3":
                                        level = "Dai Hoc";
                                        break;
                                    case "4":
                                        level = "khong di hoc";
                                        break;
                                }

                            } while (choiceLevel.equals("4"));
                            employeeList.get(i).setLevel(level);
                            break;
                        case "9":

                            boolean flag2 = true;
                            do {
                                System.out.println(" Chức vụ " +
                                        "\n 1. Lễ tân" +
                                        "\n 2. Phục vụ" +
                                        "\n 3. Chuyên viên" +
                                        "\n 4. Giám sát" +
                                        "\n 5. Quản lý" +
                                        "\n 6. Giám đốc");

                                String choicePosition = scanner.nextLine();
                                switch (choicePosition) {
                                    case "1":
                                        position = "Le tan";
                                        break;
                                    case "2":
                                        position = "Phuc vu";
                                        break;
                                    case "3":
                                        position = "Chuyen vien";
                                        break;
                                    case "4":
                                        position = " Giam sat ";
                                        break;
                                    case "5":
                                        position = "Quan li";
                                        break;
                                    case "6":
                                        position = "Giam doc";
                                    default:
                                        flag2 = false;
                                }
                            } while (!flag2);
                            employeeList.get(i).setPosition(position);
                            break;
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

