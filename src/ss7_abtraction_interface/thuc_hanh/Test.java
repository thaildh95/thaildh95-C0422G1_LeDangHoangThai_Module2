package ss7_abtraction_interface.thuc_hanh;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Animal chicken = new Chicken();
        chicken.makeSound();
        ((Chicken) chicken).howToEat();
        Tiger tiger = new Tiger();
        tiger.makeSound();
        tiger.howToEat();
    }
}