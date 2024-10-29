// src/Main.java
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Film> daftarFilm = new ArrayList<>();
        daftarFilm.add(new Film("Inception", "Sci-Fi", 2010));
        daftarFilm.add(new Film("Titanic", "Romance", 1997));

        System.out.println("Daftar Film:");
        for (Film film : daftarFilm) {
            film.displayFilmInfo();
        }
    }
}
