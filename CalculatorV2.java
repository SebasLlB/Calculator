import java.util.Scanner;

/* 7/1/2024 Sebastian Llauce Bautista
 * Improvements:
 * Recalculates the most recent result, like a regular calculator
 * Repeats until a mistake is found or the user inputs 0 for the function
 * Checks if the function input is correct before the second number is inputed
 */

public class CalculatorV2 {
    //Create a scanner that can be used anywhere
    private static Scanner scanner;
    public static void main (String[] args){
        scanner = new Scanner(System.in);

        System.out.print("Enter number :: ");
        double firstNum = scanner.nextDouble();

        System.out.print("Enter function (Number Keypad) :: " );
        String function = scanner.next();
        
        double result = 0;

        if(function.equals("+")){
            //Each block asks for a second number and sets the result
            System.out.print("Enter number :: ");
            double secondNum = scanner.nextDouble();
            result = firstNum + secondNum;
            System.out.println(result);
            //Repeat method is called. Since it's recursive, this part is no longer used.
            repeat(function, result);
        } else if(function.equals("-")){
            System.out.print("Enter number :: ");
            double secondNum = scanner.nextDouble();
            result = firstNum - secondNum;
            System.out.println(result);
            repeat(function, result);
        } else if(function.equals("*")){
            System.out.print("Enter number :: ");
            double secondNum = scanner.nextDouble();
            result = firstNum * secondNum;
            System.out.println(result);
            repeat(function, result);
        } else if(function.equals("/")){
            System.out.print("Enter number :: ");
            double secondNum = scanner.nextDouble();
            result = firstNum / secondNum;
            System.out.println(result);
            repeat(function, result);
        } else{
            System.out.println("Can't perform that function. Try again.");
        }
    }
    //Major improvements :: 
    public static void repeat(String function, double result){
        //The method starts by asking for a new function
        System.out.print("Enter function :: ");
        function = scanner.next();
        
        //Base case = Input given is 0;
        if(function.equals("0")) System.out.println("0");

        /*Same as last blocks, using the same Scanner
         * If function inputed matches, then the new number is asked for
         * Then the result is recalculated
         * Finally, the method calls itself again
        */
        if(function.equals("+")){
            System.out.print("Enter number :: ");
            double newNum = scanner.nextDouble();
            result = result + newNum;
            System.out.println(result);
            repeat(function, result);
        } else if(function.equals("-")){
            System.out.print("Enter number :: ");
            double newNum = scanner.nextDouble();
            result = result - newNum;
            System.out.println(result);
            repeat(function, result);
        } else if(function.equals("*")){
            System.out.print("Enter number :: ");
            double newNum = scanner.nextDouble();
            result = result * newNum;
            System.out.println(result);
            repeat(function, result);
        } else if(function.equals("/")){
            System.out.print("Enter number :: ");
            double newNum = scanner.nextDouble();
            result = result / newNum;
            System.out.println(result);
            repeat(function, result);
        } else{
            System.out.println("Can't perform that function. Try again.");
        }
    }
}
