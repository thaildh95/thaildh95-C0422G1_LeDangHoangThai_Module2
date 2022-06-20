package bai_tap_ve_nha.controller;

public class Transport {
    protected long licensePlate ;
    protected String productName;
    protected long productYear;
    protected String ownerName;

    public Transport(long licensePlate, String productName, long productYear, String ownerName) {
        this.licensePlate = licensePlate;
        this.productName = productName;
        this.productYear = productYear;
        this.ownerName = ownerName;
    }

    public long getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(long licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public long getProductYear() {
        return productYear;
    }

    public void setProductYear(long productYear) {
        this.productYear = productYear;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    @Override
    public String toString() {
        return "Transport{" +
                "licensePlate=" + licensePlate +
                ", productName='" + productName + '\'' +
                ", productYear=" + productYear +
                ", ownerName='" + ownerName + '\'' +
                '}';
    }
}
