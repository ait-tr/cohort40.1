package consultation.cons_09.consultationCode.code.example1;

public class FilmService {

    private Film[] catalog;

    public FilmService(Integer catalogSize) {
        this.catalog = new Film[catalogSize];
    }

    public boolean add(Film newFilm){
        for (int i = 0; i < catalog.length; i++) {
            if (catalog[i] == null) {
                catalog[i] = newFilm;
                return true;
            }
        }

        return false;
    }
}
