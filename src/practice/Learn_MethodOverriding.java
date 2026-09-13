package practice;

public class Learn_MethodOverriding {

    public  void sound(){
        System.out.println("Animal is sounding");
    }

}

class Dog  extends Learn_MethodOverriding {

    public static void main(String[] args){

        Dog d1 = new Dog();
        d1.sound();
    }

 @Override
    public void sound(){
        super.sound();
        System.out.println("Dog is barking");
    }
}
