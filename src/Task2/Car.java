package Task2;

public class Car {
    String brand;
    String model;
    int year;
    double engineVolume;

    public Car(String brand, String model, int year, double engineVolume) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.engineVolume = engineVolume;
    }

    public void getInfo() {
        System.out.println("Машина: " + brand + " " + model + ", год: " + year + ", объем двигателя: " + engineVolume+"L");
    }

}
