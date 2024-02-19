package consultation.cons_09.consultationCode.code.example1;

public class Film {
    private String filmName;
    private String genre;
    private Integer year;


    public Film(String filmName, String genre, Integer year) {
        this.filmName = filmName;
        this.genre = genre;
        this.year = year;
    }

    public String getFilmName() {
        return filmName;
    }

    public String getGenre() {
        return genre;
    }

    public Integer getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Film{" +
                "filmName='" + filmName + '\'' +
                ", genre='" + genre + '\'' +
                ", year=" + year +
                '}';
    }
}
