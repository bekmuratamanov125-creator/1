package Task2;

public class Series {

    String name;
    int seasons;
    String genre;
    double rating;

    public Series(String name, int seasons, String genre, double rating) {
        this.name = name;
        this.seasons = seasons;
        this.genre = genre;
        this.rating = rating;
    }

    public void getInfo() {
        System.out.println("Сериал: " + name + ", сезонов: " + seasons + ", жанр: " + genre + ", рейтинг: " + rating);
}

}
