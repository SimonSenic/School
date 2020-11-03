package sk.kosickaacademic.simon.school.hobbies;

public class Book extends Hobby {
    private String author, genre;

    public Book(String name, String author, String genre){
        super(name);
        this.author=author;
        this.genre=genre;
    }

    public String getAuthor(){
        return author;
    }

    public String getGenre(){
        return genre;
    }
}
