package case_study.util.read_and_write;

import case_study.model.Employee;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class  ReadAndWriteForEmployee {
    public static List<Employee> readFile() {
        List<Employee> employeeList = new ArrayList<>();
        File file = new File("src/case_study/data/employee_data.csv");
        FileReader fileReader;
        BufferedReader bufferedReader;
        String string;
        String[] arr;
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            while ((string = bufferedReader.readLine()) != null) {
                arr = string.split(",");
//
                employeeList.add(new Employee(arr[0], LocalDate.parse(arr[1]), arr[2], arr[3], arr[4], arr[5], arr[6], arr[7], arr[8], Integer.parseInt(arr[9])));
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return employeeList;
    }

    public static  void writeFile(List<Employee> employeeList, Boolean append) {
        File file = new File("src/case_study/data/employee_data.csv");
        FileWriter fileWriter;
        BufferedWriter bufferedWriter;
        try {
            fileWriter = new FileWriter(file,append);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (Employee e: employeeList) {
                bufferedWriter.write(e.getEmployeeInfo());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
