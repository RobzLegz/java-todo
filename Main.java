import java.io.File; // Import the File class
import java.io.FileReader;
import java.io.FileWriter; // Import the FileWriter class
import java.io.IOException; // Import the IOException class to handle errors
import java.util.Scanner; // Import the Scanner class

public class Main {
    public static void write(String[] args) {
        try {
            File f = new File("main.txt");

            if (!f.exists()) {
                new File("filename.txt");
            }

            FileWriter writer = new FileWriter("main.txt", true);

            System.out.print("Enter task: ");

            Scanner in = new Scanner(System.in); // Create a Scanner object

            String task = in.nextLine();

            String taskTxt;

            FileReader reader = new FileReader("main.txt");

            Scanner scanner = new Scanner(reader);

            if (scanner.hasNextLine()) {
                taskTxt = "\n" + task;
            } else {
                taskTxt = task;
            }

            writer.write(taskTxt);

            int counter = 0;

            while (scanner.hasNextLine()) {
                counter++;

                String data = scanner.nextLine();
                System.out.println(counter + ". | " + data);
            }

            counter++;

            System.out.println(counter + ". | " + task);

            reader.close();
            writer.close();
            scanner.close();
            in.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        write(args);
    }
}