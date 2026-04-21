public class FirstClass {
    public static void main(String[] args) {
        System.out.println("Hello Java World!");

        Car car1 = new Car("BMW", 2020);
        Car car2 = new Car("Audi", 2022);

        car1.showDetails();
        car1.startEngine();

        car2.showDetails();
        car2.startEngine();
    }
}
