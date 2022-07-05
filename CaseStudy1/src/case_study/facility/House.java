package case_study.facility;

public class House extends Facility {
    private String typeRoom;
    private int floor;

    public House(){

    }

    public House(String serviceName, double useArea, double rentPrice, int maximumPeople, String rentType, String typeRoom, int floor) {
        super(serviceName, useArea, rentPrice, maximumPeople, rentType);
        this.typeRoom = typeRoom;
        this.floor = floor;
    }

    public String getTypeRoom() {
        return typeRoom;
    }

    public void setTypeRoom(String typeRoom) {
        this.typeRoom = typeRoom;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

public String getHouseInfo(){
        return getServiceName() + "," + getUseArea() + "," + getRentPrice() + "," + getMaximumPeople()+
                "," + getRentType() + "," + getTypeRoom() + "," + getFloor();
    }
}
