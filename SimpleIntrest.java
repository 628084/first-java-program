//Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
import java.util.Scanner;
public class SimpleIntrest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter principal amount : ");
        int p = input.nextInt();

        System.out.print("enter rate : ");
        float r = input.nextInt();

        System.out.print("enter time in years : ");
        int t = input.nextInt();

        float si= (p*r*t)/100;
        System.out.println(si);
    }
}
