package bai_tap_ve_nha.model;

import bai_tap_ve_nha.controller.Transport;

public  class Car extends Transport {
    protected String type;
    protected int seat;

    public Car(long licensePlate, String productName, long productYear, String ownerName, String type, int seat) {
        super(licensePlate, productName, productYear, ownerName);
        this.type = type;
        this.seat = seat;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getSeat() {
        return seat;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }


}

