package practice;

public class Animal implements Learn_interface_1,LearnInterface_2 {

    public void animalSound() {

        System.out.println("Meoww meoww !");

    }
    @Override
    public void animaSleep() {

        System.out.println("Zzzzzz !");
    }

    @Override
    public void sleep() {
        System.out.println("Cat is sleeping !");
    }
}
class Main1 {
    public static void main(String[]args){

        Animal a1 = new Animal();
        a1.animalSound();
        a1.animaSleep();
        a1.sleep();
    }

}
