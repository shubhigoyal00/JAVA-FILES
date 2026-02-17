import java.io.*;

public class ThrowsExample {

    // ArithmeticException: Division by zero
    static void divideByZero() throws ArithmeticException {
        int a = 10, b = 0;
        int result = a / b;  // This will naturally throw ArithmeticException
        System.out.println("Result: " + result);
    }

    // ArrayIndexOutOfBoundsException: Accessing an invalid index
    static void accessInvalidArrayIndex() throws ArrayIndexOutOfBoundsException {
        int[] arr = {1, 2, 3};
        int value = arr[5];  // This will naturally throw ArrayIndexOutOfBoundsException
        System.out.println("Array value: " + value);
    }

    // NullPointerException: Trying to access a method on a null object
    static void accessNullReference() throws NullPointerException {
        String str = null;
        int length = str.length();  // This will naturally throw NullPointerException
        System.out.println("String length: " + length);
    }

    // FileNotFoundException: Trying to read a non-existent file
    static void openNonExistentFile() throws FileNotFoundException {
        FileReader fr = new FileReader("non_existent_file.txt");  // This will naturally throw FileNotFoundException
    }

    // StringIndexOutOfBoundsException: Accessing an invalid character index in a string
    static void accessInvalidStringIndex() throws StringIndexOutOfBoundsException {
        String s = "Java";
        char ch = s.charAt(10);  // This will naturally throw StringIndexOutOfBoundsException
        System.out.println("Character: " + ch);
    }

    public static void main(String[] args) {
        try {
            divideByZero();
        } catch (ArithmeticException e) {
            System.out.println("Caught: " + e);
        }

        try {
            accessInvalidArrayIndex();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught: " + e);
        }

        try {
            accessNullReference();
        } catch (NullPointerException e) {
            System.out.println("Caught: " + e);
        }

        try {
            openNonExistentFile();
        } catch (FileNotFoundException e) {
            System.out.println("Caught: " + e);
        }

        try {
            accessInvalidStringIndex();
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught: " + e);
        }
    }
}