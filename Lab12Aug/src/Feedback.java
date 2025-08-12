import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Feedback {
    String[] names = new String[5];
    String[] feedback = new String[5];
    Scanner scanner = new Scanner(System.in);

    void scanElements() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter name for Student " + (i + 1) + ":");
            names[i] = scanner.nextLine();
            System.out.println("Enter feedback for " + names[i] + ":");
            feedback[i] = scanner.nextLine();
        }
    }

    void writeInFile() {
        File file = new File("students.txt");
        try (FileWriter fw = new FileWriter(file, true)) {
            for (int i = 0; i < 5; i++) {
                fw.write("Name: " + names[i] + ", Feedback: " + feedback[i] + "\n");
            }
            fw.write("\n"); // Separate batches
            System.out.println("Data written to file successfully.");
        } catch (Exception e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }

    void readFromFile() {
        File file = new File("students.txt");
        try (FileReader fr = new FileReader(file);
                Scanner fileScanner = new Scanner(fr)) {
            System.out.println("----- Contents of students.txt -----");
            while (fileScanner.hasNextLine()) {
                System.out.println(fileScanner.nextLine());
            }
        } catch (Exception e) {
            System.out.println("Error reading from file: " + e.getMessage());
        }
    }
}
