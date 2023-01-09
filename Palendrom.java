//To find out whether the given String is Palindrome or not.

import java.util.Scanner;
public class Palendrom {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter String : ");
        String String = input.next();

        String rev="";
        for (int i=String.length()-1;i>=0;i--){
            rev=rev+String.charAt(i);
        }

        if (String.equals(rev)){
            System.out.println("given String is palindrome");
        }
        else {
            System.out.println("given String is not palindrome");
        }

    }
}
