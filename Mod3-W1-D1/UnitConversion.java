import java.util.Scanner;

public class UnitConversion {
    public static void main(String[] args) {
        System.out.println("Enter number in inches to convert it to meters: ");
        Scanner conversion = new Scanner(System.in); // Scanner class used to read user input from console
        double i= conversion.nextDouble(); //nextDouble() is used to input the value of an double with decimal points
        double meters= i* 0.0254; //inches to meters formula 1 inch = 0.0254m
        System.out.println(i +" inch is "+meters+ " meters");
    }
}

