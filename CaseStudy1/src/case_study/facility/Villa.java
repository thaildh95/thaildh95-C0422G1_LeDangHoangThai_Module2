package case_study.facility;

import case_study.facility.Facility;

public class Villa extends Facility {
    private String typeRoom;
    private double poolArea;
    private int floor;

    public Villa() {
    }


    public Villa(String serviceName, double useArea, double rentPrice,
                 int maximumPeople, String rentType, String typeRoom, double poolArea, int floor) {
        super(serviceName, useArea, rentPrice, maximumPeople, rentType);
        this.typeRoom = typeRoom;
        this.poolArea = poolArea;
        this.floor = floor;
    }

    public String getTypeRoom() {
        return typeRoom;
    }

    public void setTypeRoom(String typeRoom) {
        this.typeRoom = typeRoom;
    }

    public double getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(double poolArea) {
        this.poolArea = poolArea;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    @Override
    public String toString() {
        return "Villa{" +
                "typeRoom='" + typeRoom + '\'' +
                ", poolArea=" + poolArea +
                ", floor=" + floor +
                '}';
    }

    public String getVillaInfo(){
        return getServiceName() + "," + getUseArea() + "," + getRentPrice() + "," + getMaximumPeople()+
                "," + getRentType() + "," + getTypeRoom() + "," + getFloor();
}

}
