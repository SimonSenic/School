package sk.kosickaacademic.simon.school;

public class Factorial {
    public static int factNumber(int a){
        if(a==1) return 1;
        else return a*factNumber(a-1);
    }

    public static void main(String[] args) {
        long result = factNumber(5);
        System.out.println(result);
    }
}
