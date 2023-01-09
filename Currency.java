//Input currency in rupees and output in USD.
import java.util.Scanner;

public class Currency {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter rupees : ");
        float rupees = input.nextInt();

        float dollor = rupees/82;

        System.out.println(dollor);

    }
}
