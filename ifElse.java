//Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)

import java.util.Scanner;

public class ifElse {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.println("Enter 1st number : ");
        int num1=input.nextInt();

        System.out.println("enter operator + - * / : ");
        String operator = input.next();

        System.out.println("enter 2nd number : ");
        int num2 = input.nextInt();

        if (operator.equals("+")){
            System.out.println(num1+num2);
        } else if (operator.equals("-")) {
            System.out.println(num1-num2);
        } else if (operator.equals("*")) {
            System.out.println(num1*num2);
        } else if (operator.equals("/")) {
            System.out.println(num1/num2);
        }
        else {
            System.out.println("invalid operator");
        }

    }
}
