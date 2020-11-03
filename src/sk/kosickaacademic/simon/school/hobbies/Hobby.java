package sk.kosickaacademic.simon.school.hobbies;

public abstract class Hobby {
    private String name;

    public Hobby(String name){
        this.name=name;
    }

    public String getName(){
        return name;
    }
}
