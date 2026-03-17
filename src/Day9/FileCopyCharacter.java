import java.io.*;
import java.util.Scanner;

public class FileCopyCharacter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter Source File Name:");
            String source = sc.nextLine();

            System.out.println("Enter Destination File Name:");
            String destination = sc.nextLine();

            FileReader fr = new FileReader(source);
            FileWriter fw = new FileWriter(destination);

            int ch;

            while ((ch = fr.read()) != -1) {
                fw.write(ch);
            }

            fr.close();
            fw.close();

            System.out.println("File Copied Successfully (Character Stream)");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}
