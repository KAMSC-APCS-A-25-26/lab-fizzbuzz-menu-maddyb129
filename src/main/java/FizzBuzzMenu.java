import java.util.Scanner;

// DO NOT CHANGE THE CLASS NAME, IT WILL BREAK THE AUTO GRADER
public class FizzBuzzMenu {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        boolean running = true;
        while (running)
        {
            System.out.println("\n");
            System.out.println("----FizzBuzz Menu----");
            System.out.println("1. Fizz (multiples of 3)");
            System.out.println("2. Buzz (multiples of 5)");
            System.out.println("3. FizzBuzz (multiples of 3 and 5)");
            System.out.println("4. Exit");
            System.out.print("Enter your choice:  ");
            int choice = sc.nextInt();
            switch(choice)
            {
                case 1:
                    int num1 = 3;
                    for (int i=0; i<=100; i++)
                    {
                        if (num1 % 3 == 0)
                        {
                            System.out.print(num1 + " ");
                        }
                        num1 = num1 + 1;
                    }
                    break;
                case 2:
                    int num5 = 5;
                    for (int i=0; i<=100; i++)
                    {
                        if (num5 % 5 == 0) {
                            System.out.print(num5 + " ");
                        }
                        num5 = num5 + 1;
                    }
                    break;
                case 3:
                    int num15 = 15;
                    for (int i=0; i<=100; i++)
                    {
                        if (num15 % 5 == 0 && num15 % 3 == 0)
                        {
                            System.out.print(num15 + " ");
                        }
                        num15 = num15 + 1;
                    }
                    break;

                case 4:
                    System.out.print("Goodbye!");
                    running = false;
            }


        }
    }
}