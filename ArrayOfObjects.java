public class ArrayOfObjects {
    public static void main(String[] args) {
        Car1 car1 = new Car1("Toyota", "Red");
        Car1 car2 = new Car1("Honda", "Blue");
        Car1 car3 = new Car1("Ford", "Green");
        //Car1[] garage = {car1, car2, car3};
        Car1[] garage = {new Car1("Toyota", "Red"), new Car1("Honda", "Blue"), new Car1("Ford", "Green")};
        for (Car1 car : garage) {
            car.drive();
        }
    }
}

