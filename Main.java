import java.util.Scanner;
/**
 *
 * @author 
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // crete scanner for user input
    Scanner input= new Scanner(System.in);
final int INTEGERS = 2;
int number1 = 0;
int number2 = 0;
    //create an array with 10 spots
    double[] user = new double[INTEGERS];
//put integers into the array using a loop
 System.out.println("Please enter the 2 values for the array");
for(int i =0; i < INTEGERS; i++){
    user[i] = input.nextDouble();
}

// user a for loop to go through the array and find the number

if(user[0] > user[1]){
   System.out.println("Your numbers in ascending order are " + user[1] + " and " + user[0]);
} else 
if(user[0] < user[1]){
  System.out.println("Your numbers in ascending order are " + user[0] + " and " + user[1]);
  
}
}
}