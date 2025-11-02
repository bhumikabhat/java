public class Abstract {
    public static void main(String[] args) {
        // abstrsct = used to define abstract classes and methods.
        //            Abstraction is the process of hiding implementation details
        //            and showing only the essential features;
        //            Abstract classes cant be instantiated directly.
        //            can contain abstract methods (which must be implemented)
        //            and concrete methods (which are inherited)
        Circle circle = new Circle(3);
        Triangle triangle = new Triangle(4, 5);
        Rectangle rectangle = new Rectangle(6, 7);
        circle.display();
        triangle.display();
        rectangle.display();
        System.out.println("Circle area: " + circle.area());
        System.out.println("Triangle area: " + triangle.area());
        System.out.println("Rectangle area: " + rectangle.area());
    }
}
