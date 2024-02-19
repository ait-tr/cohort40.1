package consultation.cons_09.consultationCode.code.example1;

public class FilmRepository {

    Film[] films;

    public FilmRepository(Film[] films) {
        this.films = films;
    }

    public boolean add(Film newFilm){
        for (int i = 0; i < films.length; i++) {
            if (films[i] == null) {
                films[i] = newFilm;
                return true;
            }
        }
        return false;
    }

    public void printAll(){
        for (int i = 0; i < films.length; i++) {
            if (films[i] != null){
                System.out.println("---------");
                System.out.println("Название фильма: " + films[i].getFilmName());
                System.out.println("Жанр фильма: " + films[i].getGenre());
                System.out.println("Год выхода фильма: " + films[i].getYear());

            }
        }
    }

}
