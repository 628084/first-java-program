//Take name as input and print a greeting message for that particular name.
import java.util.Scanner;
public class Greet {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter your name : ");
        String name=input.nextLine();

        System.out.println("hii, "+name+" how are you");
    }
}
