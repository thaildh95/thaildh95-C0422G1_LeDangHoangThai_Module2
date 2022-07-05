package case_study.model;

import java.time.LocalDate;

public class Person {
  private String name;
    private LocalDate dayOfBirth;
    private String gender;
    private String id;
    private String phone;
    private String email;

    public Person() {
    }

    public Person(String name, LocalDate dayOfBirth, String gender, String id, String phone, String email) {
        this.name = name;
        this.dayOfBirth = dayOfBirth;
        this.gender = gender;
        this.id = id;
        this.phone = phone;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDayOfBirth() {
        return dayOfBirth;
    }

    public void setDayOfBirth(LocalDate dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", dayOfBirth=" + dayOfBirth +
                ", gender='" + gender + '\'' +
                ", id='" + id + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' ;

    }
}
