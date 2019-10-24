import java.util.*;
// make a calculator with choice using switch

public class Apple {
    public static void main(String[] args) {

        double fnum, snum, answer;
        int operation;
        answer = 0;

        System.out.println("This is a advanced calculator;");
        System.out.println("Enter first number");
        Scanner input = new Scanner(System.in);
        fnum = input.nextDouble();
        System.out.println("Enter second number");
        snum = input.nextDouble();

        System.out.println("Please choose one of the options, type in the number");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        operation = input.nextInt();

        switch (operation) {
            case 1:
                answer = fnum + snum;
                break;
            case 2:
                answer = fnum - snum;
                break;
            case 3:
                answer = fnum * snum;
                break;
            case 4:
                answer = fnum / snum;
                break;
            default:
                System.out.println("You didnt choose anything");
                break;
        }

        if (operation != 1 && operation != 2 && operation != 3 && operation != 4) {
            System.out.println("You chose the wrong option / Operation couldn't be identified");
        }else{
            System.out.println("The answer is " + answer);
        }
    }
}


