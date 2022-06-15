package Crud.test;

import java.util.Scanner;

public class studenManagerment {
    static  Scanner sc = new Scanner(System.in);
    static Student[] students;
    static {

        System.out.println("moi nhap so luong sinh vien");

        int size = sc.nextInt();
        students = new Student[size];
        Student student1 = new Student("phuc", 18, "ab543c", "phucgmail");
        Student student2 = new Student("phuc1", 19, "a543", "phucgmail2");
        Student student3 = new Student("phuc2", 21, "354f", "phucgmai3l");
        Student student4 = new Student("phuc3", 22, "adv", "phucgmail4");
        students[0] = student1;
        students[1] = student2;
        students[2] = student3;
        students[3] = student4;
    }

    public static void main(String[] args) {
        boolean flag = true;

        do {
            Scanner sc = new Scanner(System.in);

            System.out.println("Menu");
            System.out.println("1.Display");
            System.out.println("2.Add");
            System.out.println("3.Delete");
            System.out.println("0.Exit");
            System.out.println("moi chon tinh nang");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    add.display();
                    break;
                case 2:
                    add.addStudent();
                    add.display();
                    break;
                case 3:
                    add.delete();
                    break;

                default:
                    flag = false;
            }
        }
        while (flag);
    }


}
