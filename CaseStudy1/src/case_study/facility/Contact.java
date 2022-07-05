package case_study.facility;

public class Contact {
    private String someContracts;
    private String codeBooking;
    private int depositMoney;
    private int totalPayment;
    private String codeCustomer;

    public Contact(String someContracts, String codeBooking, int depositMoney,
                   int totalPayment, String codeCustomer) {
        this.someContracts = someContracts;
        this.codeBooking = codeBooking;
        this.depositMoney = depositMoney;
        this.totalPayment = totalPayment;
        this.codeCustomer = codeCustomer;
    }

    public Contact() {
    }

    public String getSomeContracts() {
        return someContracts;
    }

    public void setSomeContracts(String someContracts) {
        this.someContracts = someContracts;
    }

    public String getCodeBooking() {
        return codeBooking;
    }

    public void setCodeBooking(String codeBooking) {
        this.codeBooking = codeBooking;
    }

    public int getDepositMoney() {
        return depositMoney;
    }

    public void setDepositMoney(int depositMoney) {
        this.depositMoney = depositMoney;
    }

    public int getTotalPayment() {
        return totalPayment;
    }

    public void setTotalPayment(int totalPayment) {
        this.totalPayment = totalPayment;
    }

    public String getCodeCustomer() {
        return codeCustomer;
    }

    public void setCodeCustomer(String codeCustomer) {
        this.codeCustomer = codeCustomer;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "someContracts='" + someContracts + '\'' +
                ", codeBooking='" + codeBooking + '\'' +
                ", depositMoney=" + depositMoney +
                ", totalPayment=" + totalPayment +
                ", codeCustomer='" + codeCustomer + '\'' +
                '}';
    } public String getContactInfor(){
        return getSomeContracts() + "," +getCodeBooking()+ ","+ getDepositMoney()+","+getTotalPayment()
                +","+getCodeCustomer();
    }
}
