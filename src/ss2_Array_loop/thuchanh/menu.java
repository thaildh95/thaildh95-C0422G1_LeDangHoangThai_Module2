package ss2_Array_loop.thuchanh;

import java.util.Scanner;

public class menu {
    public static void main(String[] args) {
        System.out.println("menu");
        System.out.println("1. ve hinh chu nhat");
        System.out.println("2. ve tam giac");
        System.out.println("3. ve hinh vuong");
        Scanner sc = new Scanner(System.in);
        int choice = Integer.parseInt(sc.nextLine());
        boolean flag = true;
        do {
            switch (choice) {
                case 1:
                    System.out.println("moi nhap chieu dai");
                    int wight = sc.nextInt();
                    System.out.println("moi nhap chieu rong");
                    int height = sc.nextInt();
                    for (int i = 0; i < wight; i++) {
                        for (int j = 0; j < height; j++) {
                            System.out.print(" * ");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    System.out.println("nhap chieu cao cho tam giac");
                    int heightRec = sc.nextInt();
                    for (int i = 0; i < heightRec; i++) {
                        for (int j = 0; j < i; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }

                for (int i = heightRec; i >0 ; i--) {
                    for (int j = i-1; j >0 ; j--) {
                        System.out.print("*");

                    }
                    System.out.println();

                }
                    for (int i = 0; i < heightRec; i++) {
                        for (int k = 0; k < i; k++) {
                            System.out.print(" ");
                        }
                        for (int j = 5 - i; j > 0; j--) {
                            System.out.print("*");
                        }

                        System.out.println();
                    }
                    for (int i = heightRec; i > 0; i--) {
                        for (int k = 0; k < i; k++) {
                            System.out.print(" ");
                        }
                        for (int j = heightRec - i; j > 0; j--) {
                            System.out.print("*");
                        }

                        System.out.println();
                    }
                    for (int i = 0; i < heightRec; i++) {
                        for (int k = heightRec - i; k > 0; k--) {
                            System.out.print(" ");
                        }
                        for (int j = 0; j < 2 * i - 1; j++) {
                            System.out.print("*");

                        }
                        System.out.println();

                    }

                    break;
            }
        } while (flag);

    }
}
