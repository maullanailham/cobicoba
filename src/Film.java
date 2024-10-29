// src/Film.java
public class Film {
    private String judul;
    private String genre;
    private int tahun;

    public Film(String judul, String genre, int tahun) {
        this.judul = judul;
        this.genre = genre;
        this.tahun = tahun;
    }

    public String getJudul() {
        return judul;
    }

    public String getGenre() {
        return genre;
    }

    public int getTahun() {
        return tahun;
    }

    public void displayFilmInfo() {
        System.out.println("Judul: " + judul + ", Genre: " + genre + ", Tahun: " + tahun);
    }
}
