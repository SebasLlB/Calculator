import java.util.Scanner;

// 6/31/2024 Sebastian Llauce Bautista

public class Calculator {
    public static void main (String[] args){
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter first number :: ");
        double firstNum = keyboard.nextDouble();

        System.out.print("Enter second number :: ");
        double secondNum = keyboard.nextDouble();

        System.out.print("Press the function type (Number Keypad) :: " );
        String function = keyboard.next();
        keyboard.close();

        double timeStart = System.nanoTime();
        double endTime = 0;

        if(function.equals("+")){
            endTime = System.nanoTime();
            double time = endTime - timeStart;
            System.out.println(firstNum + secondNum + " " + time);
        } else if(function.equals("-")){
            endTime = System.nanoTime();
            double time = endTime - timeStart;
            System.out.println(firstNum - secondNum + " " + time);
        } else if(function.equals("*")){
            endTime = System.nanoTime();
            double time = endTime - timeStart;
            System.out.println(firstNum * secondNum + " " + time);
        } else if(function.equals("/")){
            endTime = System.nanoTime();
            double time = endTime - timeStart;
            System.out.println(firstNum / secondNum + " " + time);
        } else{
            System.out.println("Can't perform that function. Try again.");
        }   
    }

}
