package sk.kosickaacademic.simon.school;

import sk.kosickaacademic.simon.school.hobbies.Book;
import sk.kosickaacademic.simon.school.hobbies.Game;
import sk.kosickaacademic.simon.school.hobbies.Hobby;
import sk.kosickaacademic.simon.school.hobbies.Movie;
import sk.kosickaacademic.simon.school.pets.Animal;
import sk.kosickaacademic.simon.school.pets.Cat;
import sk.kosickaacademic.simon.school.pets.Dog;
import sk.kosickaacademic.simon.school.pets.Fish;

import java.util.Date;

public class Student {
    private String firstName;
    private String lastName;
    private ClassName className;
    private Grades grades;
    private Date date;
    private int payout;
    private Hobby[] hobby = new Hobby[5]; private int countHobbies;
    private Animal.Pet animal;

    public Student(String fName, String lastName, ClassName className, Grades grades, Date date){
        firstName=fName;
        this.lastName=lastName;
        this.className=className;
        this.grades=grades;
        this.date=date;
    }

    public void addHobby(Hobby hobby){
        if(countHobbies==this.hobby.length){
            System.out.println("Too much hobbies. (5) is enough. ");
            return;
        }
        this.hobby[countHobbies++]=hobby;
    }

    public void printHobbies(){
        for(int i=0; i<countHobbies; i++){
            System.out.println(hobby[i].getName());
            if(hobby[i] instanceof Book){
                System.out.println(((Book)hobby[i]).getAuthor());
                System.out.println(((Book)hobby[i]).getGenre());
                System.out.println();
            }
            if(hobby[i] instanceof Movie){
                System.out.println(((Movie)hobby[i]).getYear());
                System.out.println(((Movie)hobby[i]).getDirector());
                System.out.println();
            }
            if(hobby[i] instanceof Game){
                System.out.println(((Game)hobby[i]).getGenre());
                System.out.println();
            }
        }
    }

    public void addAnimal(Animal.Pet animal){
        if(animal==null){
            System.out.println("No pets. ");
            return;
        }
        this.animal=animal;
    }

    public void printAnimal(){
        if(animal instanceof Dog){
            System.out.println(((Dog)animal).getName());
            System.out.println(((Dog)animal).getBreed());
            System.out.println(((Dog)animal).getAge());
            System.out.println();
        }
        if(animal instanceof Cat){
            System.out.println(((Cat)animal).getName());
            System.out.println(((Cat)animal).getBreed());
            System.out.println(((Cat)animal).getAge());
            System.out.println();
        }
        if(animal instanceof Fish){
            System.out.println(((Fish)animal).getBreed());
            System.out.println(((Fish)animal).getCount());
            System.out.println();
        }
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public ClassName getClassName(){
        return className;
    }

    public Grades getGrades(){
        return grades;
    }

    public Date getDate(){
        return date;
    }

    public int getPayout(){
        return payout;
    }

}
