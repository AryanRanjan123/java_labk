package Day9;

import java.io.*;
import java.util.Scanner;

public class Studentfile {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            System.out.println("Enter Roll No:");
            int roll = sc.nextInt();
            sc.nextLine();   // clear buffer

            System.out.println("Enter Name:");
            String name = sc.nextLine();

            System.out.println("Enter Subject:");
            String subject = sc.nextLine();

            System.out.println("Enter Marks:");
            int marks = sc.nextInt();
            sc.nextLine();


            System.out.println("Enter existing file name:");
            String filename = sc.nextLine();


            FileWriter fw = new FileWriter(filename, true);
            BufferedWriter bw = new BufferedWriter(fw);

            bw.write("Roll No: " + roll);
            bw.newLine();
            bw.write("Name: " + name);
            bw.newLine();
            bw.write("Subject: " + subject);
            bw.newLine();
            bw.write("Marks: " + marks);
            bw.newLine();
            bw.write("----------------------");
            bw.newLine();

            bw.close();

            System.out.println("\nData Written Successfully!\n");

            // Reading file
            FileReader fr = new FileReader(filename);
            BufferedReader br = new BufferedReader(fr);

            String line;
            System.out.println("File Content:\n");

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close();

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}
