package sk.kosickaacademic.simon.school.hobbies;

public class Game extends Hobby {
    private String genre;

    public Game(String name, String genre){
        super(name);
        this.genre=genre;
    }

    public String getGenre(){
        return genre;
    }
}
