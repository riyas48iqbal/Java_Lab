import java.util.Scanner;

public class StringManipulations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        int length = inputString.length();
        System.out.println("Length of the string: " + length);

        String upperCaseString = inputString.toUpperCase();
        System.out.println("Uppercase: " + upperCaseString);

        String lowerCaseString = inputString.toLowerCase();
        System.out.println("Lowercase: " + lowerCaseString);

        System.out.print("Enter an index to extract a character: ");
        int index = scanner.nextInt();
        if (index >= 0 && index < length) {
            char extractedChar = inputString.charAt(index);
            System.out.println("Character at index " + index + ": " + extractedChar);
        } else {
            System.out.println("Invalid index.");
        }

        scanner.nextLine();
        System.out.print("Enter the starting index of the substring: ");
        int startIndex = scanner.nextInt();
        System.out.print("Enter the ending index of the substring: ");
        int endIndex = scanner.nextInt();
        if (startIndex >= 0 && endIndex <= length && startIndex < endIndex) {
            String substring = inputString.substring(startIndex, endIndex);
            System.out.println("Substring from index " + startIndex + " to " + endIndex + ": " + substring);
        } else {
            System.out.println("Invalid indices for the substring.");
        }

        String reversedString = new StringBuilder(inputString).reverse().toString();
        System.out.println("Reversed string: " + reversedString);

        scanner.close();
    }
}
