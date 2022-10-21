package 抽象工厂模式;

public class AbstractFactoryPatternDemo {
    public static void main(String[] args) {
        Shape shape1= new ShapeFactory().getShape("Circle");
        shape1.draw();

        Shape shape2= new ShapeFactory().getShape("Rectangle");
        shape2.draw();
    }

}
