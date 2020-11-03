package sk.kosickaacademic.simon.school.hobbies;

public class Movie extends Hobby {
    private int year;
    private String director;

    public Movie(String name, int year, String director){
        super(name);
        this.year=year;
        this.director=director;
    }

    public int getYear(){
        return year;
    }

    public String getDirector(){
        return director;
    }
}
