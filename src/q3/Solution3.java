package q3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Search {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Usage: java Search <word> <file1> <file2> ...");
            return;
        }

        String word = args[0];

        for (int i = 1; i < args.length; i++) {
            String fileName = args[i];
            try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    if (line.contains(word)) {
                        System.out.println(fileName + ": " + line);
                    }
                }
            } catch (IOException e) {
                System.out.println("Error reading file: " + fileName);
            }
        }
    }
}
