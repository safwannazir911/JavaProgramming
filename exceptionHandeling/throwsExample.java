package exceptionHandeling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class throwsExample {
    public void readFile() throws IOException {
        BufferedReader reader = null;
        try {
            // Specify the path to the file
            String filePath = "/home/safwannazir911/Desktop/example.txt";
            reader = new BufferedReader(new FileReader(filePath));
            String line;

            // Read the file line by line
            while ((line = reader.readLine()) != null) {
                // Process the line
                System.out.println(line);
            }
        } catch (IOException e) {
            // Handle the exception
            System.err.println("An IOException was caught: " + e.getMessage());
            throw e; // Re-throw the exception if necessary
        } finally {
            // Ensure the reader is closed to avoid resource leaks
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    System.err.println("Failed to close the reader: " + e.getMessage());
                }
            }
        }
    }

    public static void main(String[] args) {
        throwsExample example = new throwsExample();
        try {
            example.readFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
