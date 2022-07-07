package case_study.model;

import java.time.LocalDate;

public class Customer extends Person {
   private String customerCode;
    private String typeOfGuest;
    private String address;

    public Customer(){

    }

    public Customer(String name, LocalDate dayOfBirth, String gender, String id, String phone, String email, String customerCode, String typeOfGuest, String address) {
        super(name, dayOfBirth, gender, id, phone, email);
        this.customerCode = customerCode;
        this.typeOfGuest = typeOfGuest;
        this.address = address;
    }

    public String getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }

    public String getTypeOfGuest() {
        return typeOfGuest;
    }

    public void setTypeOfGuest(String typeOfGuest) {
        this.typeOfGuest = typeOfGuest;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" + super.toString() +
                "customerCode='" + customerCode + '\'' +
                ", typeOfGuest='" + typeOfGuest + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
    public String getCustomerInfo(){
        return getName() + "," +getDayOfBirth()+ ","+ getGender()+","+getId()+","+getPhone()+","+
                getEmail()+","+getCustomerCode()+","+getTypeOfGuest()+","+getAddress() ;
    }

}
