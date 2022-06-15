package Crud.test;

import java.util.Scanner;

public class add {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    }

    public static void addStudent() {

        for (int i = 0; i < studenManagerment.students.length; i++) {
            if (studenManagerment.students[i] == null) {
                Scanner sc = new Scanner(System.in);
                System.out.println("nhap ten sinh vien");
                String name = sc.nextLine();
                System.out.println("nhap tuoi sinh vien");
                int age = sc.nextInt();
                System.out.println("nhap dia chi sinh vien");
                String address = sc.nextLine();
                System.out.println("nhap email sinh vien");
                String email = sc.nextLine();
                Student student = new Student(name, age, address, email);
                studenManagerment.students[i] = student;
            }
        }
    }

    public static void delete() {
        System.out.println("nhap vi tri can xoa");
        Scanner sc = new Scanner(System.in);
        int index = sc.nextInt();
        for (int i = 0; i < studenManagerment.students.length; i++) {
            if (index == i) {
                studenManagerment.students[i] = null;
            }
            for (int j = i; j < studenManagerment.students.length; j++) {
                studenManagerment.students[j] = studenManagerment.students[j + 1];
            }
        }

    }
    public static void display() {

        for (Student s : studenManagerment.students) {
            if (s != null) {
                System.out.println(s);
            } else {
                break;
            }

        }

    }
}
