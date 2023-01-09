//Take 2 numbers as input and print the largest number.
import java.util.Scanner;
public class FindLargestNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter 1st number : ");
        int num1=input.nextInt();
        System.out.println("enter 2nd number : ");
        int num2 = input.nextInt();

        if (num1<num2){
            System.out.println("number 2 is largest");
        } else if (num2<num1) {
            System.out.println("number 1 is largest");
        }
        else{
            System.out.println("both are same");
        }
    }
}
