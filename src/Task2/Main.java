package Task2;

public class Main {
    public static void main(String[] args) {

        Movies[] movies = {
                new Movies("Inception", "Nolan", 2010, 8.8),
                new Movies("Avatar", "Cameron", 2009, 7.8)
        };

        for (Movies m : movies) {
            m.getInfo();

            System.out.println("----------------------------------------");
        }

        Car[] cars = {
                new Car("BMW", "M5", 2022, 4.4),
                new Car("Toyota", "Camry", 2020, 2.5)
        };

        for (Car c : cars) {
            c.getInfo();

            System.out.println("----------------------------------------");
        }

        Phone[] phones = {
                new Phone("Samsung", "S23", 2023, 256),
                new Phone("Apple", "iPhone 14", 2022, 128)
        };

        for (Phone p : phones) {
            p.getInfo();

            System.out.println("----------------------------------------");
        }

        Series[] seriesArray = {
                new Series("Breaking Bad", 5, "Crime", 9.5),
                new Series("Stranger Things", 4, "Sci-Fi", 8.9)
        };

        for (Series s : seriesArray) {
            s.getInfo();

            System.out.println("----------------------------------------");
        }

        Game[] games = {
                new Game("FIFA Mobile", "Sports", "Mobile", 2024),
                new Game("GTA V", "Action", "PC", 2013)
        };

        for (Game g : games) {
            g.getInfo();

        }
    }
}
