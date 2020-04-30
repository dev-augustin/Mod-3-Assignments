import java.util.Scanner;

public class MultiplyOutput {
    public static void main(String[] args) {
        System.out.println("Enter first number: ");
        Scanner firstNum = new Scanner(System.in); // Scanner class used to read user input from console
        int i= firstNum.nextInt();
        System.out.println("Enter second number: ");
        Scanner secondNum = new Scanner(System.in);
        int j= secondNum.nextInt(); //nextInt() is used to input the value of an integer
        int product= i*j; //product of two numbers
        System.out.println("Product of "+i+" * "+j+"= "+product);
    }

}
