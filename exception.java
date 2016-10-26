package exception;
//import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 *
 * @author daylinhenry
 */
public class Exception {

    /**
     * @param args the command line arguments
     */
  public static void main(String[] args) {
 
  int a, b, result;
   
  try{
  
  Scanner input = new Scanner(System.in);
  System.out.println("Input two integers");
 
  a = input.nextInt();
  b = input.nextInt();
 
  result = a / b;
  System.out.println("Result = " + result);
  
  
  }catch(ArithmeticException e){
    System.out.println("Somethings not right here");  
  
  
  }
        finally {
            System.out.println("finally block will execute.");
        }
  } 

} 


     
