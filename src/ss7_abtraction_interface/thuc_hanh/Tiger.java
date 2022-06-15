package ss7_abtraction_interface.thuc_hanh;

public class Tiger extends Animal implements Edible {

    @Override
    public void makeSound() {
        System.out.println("gau gau");
    }

    @Override
    public void howToEat() {

    }
}
