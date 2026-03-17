package Day9;

import java.io.FileInputStream;
import java.io.IOException;

public class CompareBinaryFile {

    public static void main(String[] args) {

        String file1 = "file1.bin";
        String file2 = "file2.bin";

        try {
            FileInputStream fis1 = new FileInputStream(file1);
            FileInputStream fis2 = new FileInputStream(file2);

            int b1, b2;
            int position = 1;
            boolean equal = true;

            while (true) {

                b1 = fis1.read();
                b2 = fis2.read();

                // If both reach end → files are equal
                if (b1 == -1 && b2 == -1) {
                    break;
                }

                // If bytes differ
                if (b1 != b2) {
                    System.out.println("Files differ at byte position: " + position);
                    equal = false;
                    break;
                }

                position++;
            }

            if (equal) {
                System.out.println("Two files are equal");
            }

            fis1.close();
            fis2.close();

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
