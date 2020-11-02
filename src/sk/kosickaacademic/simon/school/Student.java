package sk.kosickaacademic.simon.school;

import java.util.Date;

public class Student {
    private String firstName;
    private String lastName;
    private ClassName className;
    private Grades grades;
    private Date date;
    private int payout;

    public Student(String fName, String lastName, ClassName className, Grades grades, Date date){
        firstName=fName;
        this.lastName=lastName;
        this.className=className;
        this.grades=grades;
        this.date=date;
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
