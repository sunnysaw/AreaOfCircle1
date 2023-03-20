/*
Question : Java Program to Find the Area of a Circle
________________________________________________________
Test case :
Enter radius of circle: 22
Area of circle: 1519.76
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double radius,pai = 3.14,sum = 0;
        System.out.println("Enter the radius of circle : ");
        radius = sc.nextDouble();
        sum += pai * radius * radius;
        System.out.println("Printing the result : " + sum);
    }
}