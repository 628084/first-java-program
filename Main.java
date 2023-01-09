//Write a program to print whether a number is even or odd, also take input from the user.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter your number : ");
        int num=input.nextInt();
        if (num%2==0){
            System.out.println("number is even");
        }
        else {
            System.out.println("number is odd");
        }
    }
}