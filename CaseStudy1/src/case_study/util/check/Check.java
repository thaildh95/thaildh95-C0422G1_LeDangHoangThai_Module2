package case_study.util.check;

import case_study.facility.Villa;
import case_study.model.Customer;
import case_study.model.Employee;
import case_study.util.read_and_write.ReadAndWriteForCustomer;
import case_study.util.read_and_write.ReadAndWriteForEmployee;
import case_study.util.read_and_write.ReadAndWriteForVilla;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Check {
    public static Boolean checkEmployeeCode(String code){
        List<Employee> employeeList = ReadAndWriteForEmployee.readFile();
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getEmployeeCode().equals(code)){
                return true;
            }
        }
        return false;
    }


    public static Boolean checkCustomerCode(String code){
        List<Customer> customerList = ReadAndWriteForCustomer.readFile();
        for (int i = 0; i < customerList.size(); i++) {
            if (customerList.get(i).getCustomerCode().equals(code)){
                return true;
            }
        }
        return false;
    }
    public static boolean CheckIdEmployee(String id){
        List<Employee> employeeList = ReadAndWriteForEmployee.readFile();
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getId().equals(id)){
                return true;
            }
        }return false;
    }
    public static boolean CheckIdCustomer(String id){
        List<Customer> customerList = ReadAndWriteForCustomer.readFile();
        for (int i = 0; i < customerList.size(); i++) {
            if (customerList.get(i).getId().equals(id)){
                return true;
            }
        }return false;
    }
    public static boolean CheckVillaService(String serviceName){
        Map<Villa,Integer> villaMap = ReadAndWriteForVilla.readFile();
        Set< Villa> villaSet = villaMap.keySet();
        boolean flag = true;
        for (Villa s: villaSet) {
            if (s.getServiceName().equals(serviceName)){
                flag = false;
        }
        }
        return flag;
    }
}
