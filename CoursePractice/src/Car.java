public class Car {
    String brand;
    int year;

    // constructor
    public Car(String brand, int year) {
        this.brand = brand;
        this.year = year;
            }
            // metoda 1
    public void showDetails() {
        System.out.println("Car: " + brand + ", Year: " + year);
    }
    // metoda 2
    public void startEngine() {
        System.out.println(brand + " engine started!");
    }
}
