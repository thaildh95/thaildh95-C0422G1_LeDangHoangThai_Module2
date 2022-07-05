package case_study.model;

import java.time.LocalDate;

public class Employee extends Person{
    private String employeeCode;
    private String level;
    private String position;
    private int salary;

    public Employee() {
    }



    public Employee(String name, LocalDate dayOfBirth, String gender, String id, String phone, String email,
                    String employeeCode, String level, String position, int salary) {
        super(name, dayOfBirth, gender, id, phone, email);
        this.employeeCode = employeeCode;
        this.level = level;
        this.position = position;
        this.salary = salary;
    }



    public String getEmployeeCode() {
        return employeeCode;
    }

    public void setEmployeeCode(String employeeCode) {
        this.employeeCode = employeeCode;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString()+"Employee" +
                "employeeCode='" + employeeCode + '\'' +
                ", level='" + level + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary;
    }
    public String getEmployeeInfo(){
        return getName() + "," +getDayOfBirth()+ ","+ getGender()+","+getId()+","+getPhone()+","+
              getEmail()+","+getEmployeeCode()+","+getLevel()+","+getPosition()+","+getSalary()  ;
    }
}
