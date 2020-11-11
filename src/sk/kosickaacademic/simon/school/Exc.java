package sk.kosickaacademic.simon.school;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exc {
    public static void main(String[] args) {
        int[] arr = new int[] { 14, 0, 17, -5, 8, 36, 27, 81, 0, 11 };
        Scanner sc = new Scanner(System.in);

        try{
            System.out.println("Enter index 1: ");
            int index1 = sc.nextInt();
            System.out.println("Enter index 2: ");
            int index2 = sc.nextInt();

            int result = getResult(arr[index1], arr[index2]);
            System.out.println("Result: " +result);
        }catch(ArithmeticException ex){
            System.out.println(ex);
        }catch(ArrayIndexOutOfBoundsException ex){
            System.out.println(ex);
        }catch(InputMismatchException ex){
            System.out.println("Error: Only numbers are allowed. ");
        }catch(Exception ex){
            System.out.println("Unknown error: " +ex);
        }
    }

    private static int getResult(int a, int b) {
        return a/b;
    }
}
