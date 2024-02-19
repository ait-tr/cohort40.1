package consultation.cons_09.consultationCode.code.example1;

import java.util.Arrays;

public class FilmCatalog {
    public static void main(String[] args) {
        Film[] myFilms = new Film[10];

        FilmRepository filmRepository = new FilmRepository(myFilms);

        filmRepository.add(new Film("Крестный отец", "криминальная драма", 1972));

        //System.out.println(Arrays.toString(myFilms));

        filmRepository.printAll();

        Film[] cartoons = new Film[5];
        FilmRepository cartoonsRepository = new FilmRepository(cartoons);

        cartoonsRepository.add(new Film("Aladdin", "мультфильм", 1996));

        //System.out.println(Arrays.toString(cartoons));

        cartoonsRepository.printAll();
    }
}

