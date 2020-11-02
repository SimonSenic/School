package sk.kosickaacademic.simon.school;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    private static Student[] initStudents(){
        Student[] s = new Student[3];
        Student s1 = new Student("Jozin", "Zbazin", ClassName.N1, new Grades(2, 1, 1), createDate("1990-3-14")); s[0]=s1;
        Student s2 = new Student("Donald", "Trump", ClassName.N1, new Grades(5, 5, 5), createDate("1991-1-1")); s[1]=s2;
        Student s3 = new Student("Omegalul", "Kekw", ClassName.N3, new Grades(1, 1, 1), createDate("2003-12-4")); s[2]=s3;
        return s;
    }

    private static Date createDate(String dt){
        try { return new SimpleDateFormat("yyyy-MM-dd").parse(dt); }
        catch(ParseException exc){
            exc.printStackTrace();
        }
        return null;
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
    }

    public static void main(String[] args) {
        printN1Students(initStudents());
        printStudentsWithAverageGradeBeneath2(initStudents());
        printAge(initStudents());
    }

}
