package 针对接口编程_而不是针对实现编程;

public class Demo {
    public static void main(String[] args) {
        hear_sound(new Cow());
        hear_sound(new Chicken());
    }

    public static void  hear_sound(Animal animal){
        animal.makeSound();
    }
}
