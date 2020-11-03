package sk.kosickaacademic.simon.school;

import sk.kosickaacademic.simon.school.hobbies.Book;
import sk.kosickaacademic.simon.school.hobbies.Game;
import sk.kosickaacademic.simon.school.hobbies.Hobby;
import sk.kosickaacademic.simon.school.hobbies.Movie;

import java.util.Date;

public class Student {
    private String firstName;
    private String lastName;
    private ClassName className;
    private Grades grades;
    private Date date;
    private int payout;
    private Hobby[] hobby;
    private int countHobbies;

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
            }
            if(hobby[i] instanceof Movie){
                System.out.println(((Movie)hobby[i]).getYear());
                System.out.println(((Movie)hobby[i]).getDirector());
            }
            if(hobby[i] instanceof Game)
                System.out.println(((Game)hobby[i]).getGenre());
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

    public Hobby[] getHobby(){
        return hobby;
    }

}
