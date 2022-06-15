package ss5_static.bai_tap;

public class student {
    private String name = "John";
    private String classes = "C02";
    public void Student () {

    }
    public void Student(String name, String classes) {
        this.name = name;
        this.classes = classes;

    }
    public void setName (String name) {
        this.name = name;
    }
    public void setClasses (String classes) {
        this.classes = classes;
    }
    void display() {
        System.out.println(name + "\t" + classes);
    }
}
