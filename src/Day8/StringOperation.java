package Day8;

import java.util.Scanner;

public class StringOperation {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        System.out.println("\nChoose Operation:");
        System.out.println("1. Change Case");
        System.out.println("2. Reverse String");
        System.out.println("3. Compare Two Strings");
        System.out.println("4. Insert One String into Another");
        System.out.println("5. Convert to Uppercase and Lowercase");
        System.out.println("6. Check Character Position");
        System.out.println("7. Check Palindrome");
        System.out.println("8. Count Words, Vowels, Consonants");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();
        sc.nextLine(); // consume newline

        switch (choice) {

            case 1:
                StringBuilder changed = new StringBuilder();
                for (char ch : str.toCharArray()) {
                    if (Character.isUpperCase(ch))
                        changed.append(Character.toLowerCase(ch));
                    else if (Character.isLowerCase(ch))
                        changed.append(Character.toUpperCase(ch));
                    else
                        changed.append(ch);
                }
                System.out.println("Changed Case: " + changed);
                break;

            case 2:
                String reversed = new StringBuilder(str).reverse().toString();
                System.out.println("Reversed String: " + reversed);
                break;

            case 3:
                System.out.print("Enter second string: ");
                String str2 = sc.nextLine();
                if (str.equals(str2))
                    System.out.println("Both strings are equal.");
                else
                    System.out.println("Strings are not equal.");
                break;

            case 4:
                System.out.print("Enter string to insert: ");
                String insertStr = sc.nextLine();
                System.out.print("Enter position to insert: ");
                int pos = sc.nextInt();
                String newStr = str.substring(0, pos) + insertStr + str.substring(pos);
                System.out.println("After Insertion: " + newStr);
                break;

            case 5:
                System.out.println("Uppercase: " + str.toUpperCase());
                System.out.println("Lowercase: " + str.toLowerCase());
                break;

            case 6:
                System.out.print("Enter character to search: ");
                char ch = sc.next().charAt(0);
                int index = str.indexOf(ch);
                if (index != -1)
                    System.out.println("Character found at position: " + (index + 1));
                else
                    System.out.println("Character not found.");
                break;

            case 7:
                String rev = new StringBuilder(str).reverse().toString();
                if (str.equalsIgnoreCase(rev))
                    System.out.println("String is Palindrome.");
                else
                    System.out.println("String is Not Palindrome.");
                break;

            case 8:
                int words = str.trim().split("\\s+").length;
                int vowels = 0, consonants = 0;

                for (char c : str.toLowerCase().toCharArray()) {
                    if (Character.isLetter(c)) {
                        if ("aeiou".indexOf(c) != -1)
                            vowels++;
                        else
                            consonants++;
                    }
                }

                System.out.println("Number of Words: " + words);
                System.out.println("Number of Vowels: " + vowels);
                System.out.println("Number of Consonants: " + consonants);
                break;

            default:
                System.out.println("Invalid choice.");
        }

        sc.close();
    }
}
