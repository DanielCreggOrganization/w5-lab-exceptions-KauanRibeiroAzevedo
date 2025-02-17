package ie.atu.exceptions;
import java.util.Scanner;

public class TryWithResourcesSquareDemo {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt(); 
            int square = number * number;  
            System.out.println("Square: " + square);
        }
    }
}


