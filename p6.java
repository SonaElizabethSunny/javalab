import java.util.Scanner;

public class Str {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter a string: ");
        String str = sc.nextLine();


        System.out.print("Enter an index to get the character at: ");
        int index = sc.nextInt();
        if (index >= 0 && index < str.length()) {
            System.out.println("Character at index " + index + ": " + str.charAt(index));
        } else {
            System.out.println("Invalid index.");
        }

        sc.nextLine();
        System.out.print("Enter a string to compare with: ");
        String compareString = sc.nextLine();
        System.out.println("Comparing with '" + compareString + "': " + str.compareTo(compareString));


        System.out.print("Enter a string to concatenate: ");
        String concatString = sc.nextLine();
        System.out.println("Concatenated string: " + str.concat(concatString));


        System.out.print("Enter a string to check equality: ");
        String equalsString = sc.nextLine();
        System.out.println("Is the entered string equal to '" + equalsString + "'? " + str.equals(equalsString));


        System.out.println("Length of the string: " + str.length());


        System.out.print("Enter a character to replace: ");
        char oldChar = sc.next().charAt(0);
        sc.nextLine(); 
        System.out.print("Enter a character to replace it with: ");
        char newChar = sc.next().charAt(0);
        sc.nextLine(); 
        System.out.println("String after replacement: " + str.replace(oldChar, newChar));


        System.out.print("Enter a prefix to check if the string starts with it: ");
        String prefix = sc.nextLine();
        System.out.println("Does the string start with '" + prefix + "'? " + str.startsWith(prefix));

        System.out.println("String in lowercase: " + str.toLowerCase());

        System.out.println("String in uppercase: " + str.toUpperCase());

        sc.close();
    }
}
