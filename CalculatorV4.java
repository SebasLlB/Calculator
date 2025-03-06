import java.util.Scanner;

/* 7/18/2024 Sebastian Llauce Bautista
 * Improvements: 
 * Will repeat initial prompt even if an Exception Error is found
 */
public class CalculatorV4{
    //Creates scanner that can be used anywhere
    private static Scanner scanner;
    public static void main(String[] args){
        scanner = new Scanner(System.in);
        try{
            System.out.print("New calculation: ");
            double number = scanner.nextDouble();
            result(number);}
        catch(Exception e){
            System.out.println("Wrong input");
            main(null);
        }
    }
    /*The recursive method that will recalculate the answer
     * Asks for the operator and then a second number
     * After returning the result, it's able to recalculate using the most recent result
     * Resets the program if anything other than a math operator is inputed for the function
    */
    public static void result(double num){
        //Sets result variable
        double equals = 0;

        //Asks for the function
        //System.out.print("Enter function :: ");
        String function = scanner.next();

        //Checks if the user inputs anything other than the 4 math operators and restarts the program from start()
        //Major improvements :: 
        if(!(function.equals("+") || function.equals("-") || function.equals("/") || function.equals("*"))){
            //If the input for function is not a math operator, it restarts the program, starting from main() with a null parameter
            main(null);
        } else{

            //If the input is one of the 4 math operators, then the second number is asked
            //System.out.print("Enter number :: ");
            double newNum = scanner.nextDouble();
            //This part checks for all the math inputs that can be given and calculates the result based on it(Re-used from V2)

        if(function.equals("+")){
            equals = num + newNum;
        } else if(function.equals("-")){
            equals = num - newNum;
        } else if(function.equals("*")){
            equals = num * newNum;
        } else if(function.equals("/")){
            equals = num / newNum;
        }
            System.out.println("A: " + equals);
            result(equals);
        }
    }
}
