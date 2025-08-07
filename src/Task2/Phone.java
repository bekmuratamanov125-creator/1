package Task2;

public class Phone {

    String brand;
    String model;
    int releaseYear;
    int storageGB;

    public Phone(String brand, String model, int releaseYear, int storageGB) {
        this.brand = brand;
        this.model = model;
        this.releaseYear = releaseYear;
        this.storageGB = storageGB;
    }

    public void getInfo() {
        System.out.println("Телефон: " + brand + " " + model + ", год выпуска: " + releaseYear + ", память: " + storageGB +"GB");

    }
}
