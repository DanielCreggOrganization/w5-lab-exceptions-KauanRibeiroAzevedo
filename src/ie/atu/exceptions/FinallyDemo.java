package ie.atu.exceptions;

public class FinallyDemo {
    public static void main(String[] args) {
        try {
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[5]); // This will throw an exception.
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("[Exception message]");
        } finally {
            System.out.println("File processing complete.");
        }
    }
}