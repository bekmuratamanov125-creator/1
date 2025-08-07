package Task2;

public class Game {

    String title;
    String genre;
    String platform;
    int releaseYear;

    public Game(String title, String genre, String platform, int releaseYear) {
        this.title = title;
        this.genre = genre;
        this.platform = platform;
        this.releaseYear = releaseYear;
    }

    public void getInfo() {
        System.out.println("Оюн: " + title + ", жанр: " + genre + ", платформа: " + platform + ", год выпуска: " + releaseYear);
}
}

