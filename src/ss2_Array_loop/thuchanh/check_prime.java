package ss2_Array_loop.thuchanh;

import java.util.Scanner;

public class check_prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("moi nhap so can kiem tra");
        int number = sc.nextInt();
        int i = 2;
        while (i < number) {
            if (number%i==0){
                System.out.println("khong phai so nguyen to");
                break;

            }else{
                i++;
                System.out.println("la so nguyen to");
                break;


            }


        }
        }
    }
