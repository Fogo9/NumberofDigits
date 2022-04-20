import java.util.Scanner;

public class numberofdigits{
    public static void main(String[] args) {

        int a, b, c = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter The Number : ");

        a = input.nextInt();


        while (a != 0){

            b = a % 10;

            c += b;

            a /= 10;

        }
        System.out.println("Sum of Digits : " + c);
    }

}
