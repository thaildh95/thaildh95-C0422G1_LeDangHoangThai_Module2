package case_study.common;

import case_study.model.Customer;
import case_study.model.Employee;
import case_study.util.read_and_write.ReadAndWriteForCustomer;
import case_study.util.read_and_write.ReadAndWriteForEmployee;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.List;
import java.util.Scanner;

public class DayOfBirth {
    public static LocalDate checkDayOfBirth(){
        Scanner scanner = new Scanner(System.in);
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
        return dayOfBirth;
    }
    public static void changeDayOfBirthEmployee(int i){
        List<Employee> employeeList = ReadAndWriteForEmployee.readFile();
        Scanner scanner = new Scanner(System.in);
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
        employeeList.get(i).setDayOfBirth(dayOfBirth);
        ReadAndWriteForEmployee.writeFile(employeeList,false);
    }

    public static void changeDayOfBirthCustomer(int i){
        List<Customer> customerList = ReadAndWriteForCustomer.readFile();
        Scanner scanner = new Scanner(System.in);
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
        customerList.get(i).setDayOfBirth(dayOfBirth);
        ReadAndWriteForCustomer.writeFile(customerList,false);
    }
}
