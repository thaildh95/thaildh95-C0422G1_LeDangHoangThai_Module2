package case_study.facility;

import java.time.LocalDate;

public class Booking {
    private String bookingCode;
    private LocalDate arrivalDate;
    private LocalDate DateOfDepartment;
    private String customerCode;
    private String nameService;
    private String serviceOfTybe;

    public Booking() {
    }

    public Booking(String bookingCode, LocalDate arrivalDate,
                   LocalDate dateOfDepartment, String customerCode, String nameService, String serviceOfTybe) {
        this.bookingCode = bookingCode;
        this.arrivalDate = arrivalDate;
        DateOfDepartment = dateOfDepartment;
        this.customerCode = customerCode;
        this.nameService = nameService;
        this.serviceOfTybe = serviceOfTybe;
    }

    public String getBookingCode() {
        return bookingCode;
    }

    public void setBookingCode(String bookingCode) {
        this.bookingCode = bookingCode;
    }

    public LocalDate getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(LocalDate arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public LocalDate getDateOfDepartment() {
        return DateOfDepartment;
    }

    public void setDateOfDepartment(LocalDate dateOfDepartment) {
        DateOfDepartment = dateOfDepartment;
    }

    public String getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    public String getServiceOfTybe() {
        return serviceOfTybe;
    }

    public void setServiceOfTybe(String serviceOfTybe) {
        this.serviceOfTybe = serviceOfTybe;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "bookingCode='" + bookingCode + '\'' +
                ", arrivalDate=" + arrivalDate +
                ", DateOfDepartment=" + DateOfDepartment +
                ", customerCode='" + customerCode + '\'' +
                ", nameService='" + nameService + '\'' +
                ", serviceOfTybe='" + serviceOfTybe + '\'' +
                '}';
    }
    public String getBookingInfor(){
        return getBookingCode() + "," +getArrivalDate()+ ","+ getDateOfDepartment()+","+getCustomerCode()
               +","+getCustomerCode()+","+getNameService()+","+getServiceOfTybe();
    }
}
