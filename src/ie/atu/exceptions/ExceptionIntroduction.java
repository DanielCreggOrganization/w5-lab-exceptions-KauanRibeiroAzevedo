package ie.atu.exceptions;

public class ExceptionIntroduction {
    public static void main(String[] args) {
        String text = null;

        if (text == null) {
            System.out.println("Text is null. Cannot retrieve length.");
        } else {
            System.out.println(text.length());
        }
    }
}
