package Day9;

import java.io.*;
import java.util.Scanner;

public class FileCopyByte {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            System.out.println("Enter Source File Name:");
            String source = sc.nextLine();

            System.out.println("Enter Destination File Name:");
            String destination = sc.nextLine();

            FileInputStream fis = new FileInputStream(source);
            FileOutputStream fos = new FileOutputStream(destination);

            int data;

            while ((data = fis.read()) != -1) {
                fos.write(data);
            }

            fis.close();
            fos.close();

            System.out.println("File Copied Successfully");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}
