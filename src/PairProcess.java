import java.util.Scanner;

public class PairProcess {
    public static void main(String[] args) {
        int num1, num2, sum, product;
        double avg;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("First number? : ");
        num1 = keyboard.nextInt();

        System.out.print("Second number? : ");
        num2 = keyboard.nextInt();

        sum = num1 + num2;
        product = num1 * num2;
        avg = sum / 2;

        System.out.println("The sum of " + num1 + " and " + num2 + " is " + sum);
        System.out.println("The Multiplication of " + num1 + " and " + num2 + " is " + product);
        System.out.println("The Average of " + num1 + " and " + num2 + " is " + avg);

        if(sum > 200 && sum < 1000)
        {
            System.out.println(sum + " * ~");
        } else
            {
                System.out.println(sum + " is not between 200 and 1000.");
            }

    }

}
