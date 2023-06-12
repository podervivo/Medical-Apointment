import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class read {
    public static void main(String[] args) {
        String filePath = ".\\text.txt";
        File file = new File(filePath);

        try {
            Scanner scanner = new Scanner(file);

            // Iterar sobre cada línea del archivo
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}