package Task2;

public class Movies {
    String title;
    String director;
    int year;
    double rating;

    public Movies(String title, String director, int year, double rating) {
        this.title = title;
        this.director = director;
        this.year = year;
        this.rating = rating;
    }

    public void getInfo() {
        System.out.println("Фильм: " + title + ", режиссер: " + director + ", год: " + year + ", рейтинг: " + rating);
}

}

