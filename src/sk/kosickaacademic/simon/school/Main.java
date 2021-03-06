package sk.kosickaacademic.simon.school;

import sk.kosickaacademic.simon.school.hobbies.Book;
import sk.kosickaacademic.simon.school.hobbies.Game;
import sk.kosickaacademic.simon.school.hobbies.Movie;
import sk.kosickaacademic.simon.school.hobbies.Sport;
import sk.kosickaacademic.simon.school.pets.Dog;
import sk.kosickaacademic.simon.school.pets.Fish;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    private static Student[] initStudents(){
        Student[] s = new Student[4];
        Student s1 = new Student("Jozin", "Zbazin", ClassName.N1, new Grades(2, 1, 1), createDate("1990-3-14")); s[0]=s1;
        Student s2 = new Student("Donald", "Trump", ClassName.N1, new Grades(5, 5, 5), createDate("1991-1-1")); s[1]=s2;
        Student s3 = new Student("Omegalul", "Kekw", ClassName.N3, new Grades(1, 1, 1), createDate("2003-12-4")); s[2]=s3;
        Student s4 = new Student("Jozef", "Bugal", ClassName.N1, new Grades(2, 2, 3), createDate("1978-10-28")); s[3]=s4;
        return s;
    }

    private static Date createDate(String dt){
        try { return new SimpleDateFormat("yyyy-MM-dd").parse(dt); }
        catch(ParseException exc){
            exc.printStackTrace();
        }
        return null;
    }

    private static void sortByAverage(Student[] std){
        for(int i=0; i<std.length; i++)
            for(int j=0; j<std.length-1-i; j++)
                if(std[j].getGrades().getAverage()>std[j+1].getGrades().getAverage()){
                    Student temp = std[j];
                    std[j]=std[j+1];
                    std[j+1]=temp;
                }
    }

    private static void printN1Students(Student[] std){
        for(int i=0; i<std.length; i++)
            if(std[i].getClassName()==ClassName.N1)
                System.out.println(std[i].getFirstName() +" " +std[i].getLastName() +" " +std[i].getClassName());
    }

    private static void printStudentsWithAverageGradeBeneath2(Student[] std){
        for(int i=0; i<std.length; i++){
            double avg=(std[i].getGrades().getPro()+std[i].getGrades().getWeb()+std[i].getGrades().getDsy())/3.0;
            if(avg<=2) System.out.println(std[i].getFirstName() +" " +std[i].getLastName() +" " +avg);
        }
    }

    private static void printAge(Student[] std){
        Date currentDate = new Date();
        DateFormat y = new SimpleDateFormat("yyyy");
        DateFormat m = new SimpleDateFormat("MM");
        DateFormat d = new SimpleDateFormat("dd");

        for(int i=0; i<std.length; i++){
            int year=Integer.parseInt(y.format(std[i].getDate()));
            int month=Integer.parseInt(m.format(std[i].getDate()));
            int day=Integer.parseInt(d.format(std[i].getDate()));
            int currentYear=Integer.parseInt(y.format(currentDate));
            int currentMonth=Integer.parseInt(m.format(currentDate));
            int currentDay=Integer.parseInt(d.format(currentDate));

            int age=currentYear-year;
            if(currentMonth<month || (currentMonth==month && currentDay<day)) age--;
            System.out.println(std[i].getFirstName() +" " +std[i].getLastName() +" " +age);
        }
        System.out.println();
    }

    private static void printStudents(Student[] std){
        for(int i=0; i<std.length; i++)
            System.out.println(std[i].getFirstName() +" " +std[i].getLastName() +" " +std[i].getGrades().getAverage());
        System.out.println();
    }

    public static void main(String[] args) {
        Student[] students ;
        students = initStudents();

        printN1Students(students);
        printStudentsWithAverageGradeBeneath2(students);
        printAge(students);
        sortByAverage(students);
        printStudents(students);

        Book b1 = new Book("Harry Potter", "J. K. Rowlings", "Fantasy");
        Book b2 = new Book("Hercule Poirot", "Agatha Christie", "Detective");
        students[0].addHobby(b1);
        students[0].addHobby(b2);

        Sport s1 = new Sport("Ice Hockey");
        Sport s2 = new Sport("Football");
        students[1].addHobby(s1);
        students[1].addHobby(s2);

        Game g1 = new Game("World of Warcraft", "MMORPG");
        Fish f1 = new Fish("Fantail", 12);
        students[2].addHobby(g1);
        students[2].addAnimal(f1);
        students[2].printHobbies();
        students[2].printAnimal();

        Movie m1 = new Movie("Interstellar", 2014, "Christopher Nolan");
        Movie m2 = new Movie("The Dark Knight", 2008, "Christopher Nolan");
        Movie m3 = new Movie("Lord of the Rings", 2001, "Peter Jackson");
        Movie m4 = new Movie("Terminator 2", 1991, "James Cameron");
        Movie m5 = new Movie("Troy", 2004, "Wolfgang Petersen");
        Dog d1 = new Dog("Bob", "American Bulldog", 5);
        students[3].addHobby(m1);
        students[3].addHobby(m2);
        students[3].addHobby(m3);
        students[3].addHobby(m4);
        students[3].addHobby(m5);
        students[3].addAnimal(d1);
        students[3].printHobbies();
        students[3].printAnimal();
    }

}
