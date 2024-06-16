package code.HW41.Task5;

public class Students implements Comparable<Students>{
    private String name;
    private Integer year;
    private Double grades;

    public Students(String name, Integer year, Double grades) {
        this.name = name;
        this.year = year;
        this.grades = grades;
    }

    public String getName() {
        return name;
    }

    public Integer getYear() {
        return year;
    }

    public Double getGrades() {
        return grades;
    }

    @Override
    public int compareTo(Students o) {
        return Double.compare(grades, o.getGrades());
    }
}
