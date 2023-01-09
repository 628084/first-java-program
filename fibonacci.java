//To calculate Fibonacci Series up to n numbers.

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number : ");
        int num = input.nextInt();
        int [] fib = new int[num];

        fib[0]=0;
        fib[1]=1;

        for (int i=2;i<num;i++){
            fib[i]=fib[i-1]+fib[i-2];
        }
        for (int arr:fib) {
            System.out.println(arr);

        }
    }
}
