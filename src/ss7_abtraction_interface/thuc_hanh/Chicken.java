package ss7_abtraction_interface.thuc_hanh;

public class Chicken extends Animal implements Edible{

    @Override
    public void makeSound() {
        System.out.println("cuc tac");
    }

    @Override
    public void howToEat() {
        System.out.println("ga luoc len de an");
    }
}
