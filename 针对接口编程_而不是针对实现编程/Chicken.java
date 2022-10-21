package 针对接口编程_而不是针对实现编程;

public class Chicken implements Animal{
    @Override
    public void makeSound() {
        System.out.println("咯咯咯");
    }
}
