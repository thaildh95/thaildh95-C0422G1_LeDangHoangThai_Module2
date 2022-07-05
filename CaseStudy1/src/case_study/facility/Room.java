package case_study.facility;

public class Room extends Facility {
    private String freeService;

    public Room(){

    }

    public Room(String serviceName, double useArea, double rentPrice, int maximumPeople, String rentType, String freeService) {
        super(serviceName, useArea, rentPrice, maximumPeople, rentType);
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    @Override
    public String toString() {
        return "Room{" + super.toString()+
                "freeService='" + freeService + '\'' +
                '}';
    }
    public String getRoomInfo(){
        return getServiceName() + "," + getUseArea() + "," + getRentPrice() + "," + getMaximumPeople()+
                "," + getRentType() ;
    }
}
