package sk.kosickaacademic.simon.school.pets;

public class Fish implements Animal.Pet {
    private String breed;
    private int count;

    public Fish(String breed, int count){
        this.breed=breed;
        this.count=count;
    }

    public String getBreed(){
        return breed;
    }

    public int getCount(){
        return count;
    }
}
