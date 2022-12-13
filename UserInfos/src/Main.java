import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        String name, fileName, address;
        int age;
        PrintWriter pw;

        Scanner inputs = new Scanner(System.in);

        System.out.println("Enter the name of the file: ");
        fileName = inputs.nextLine();

        if (Files.notExists(Path.of(fileName))) {
            pw = new PrintWriter(new FileWriter(fileName));
        } else {
            pw = new PrintWriter(new FileWriter(fileName, true));
        }
        do {
            System.out.println("Please enter your name: ");
            name = inputs.nextLine();
            System.out.println("Please enter your address: ");
            address = inputs.nextLine();
            System.out.println("Please enter your age: ");
            age = inputs.nextInt();
            inputs.nextLine();
            System.out.println("Do you want to continue? ");
            pw.println(name + ", " + address + ", " + age);
        } while (inputs.nextLine().charAt(0) == 'Y');
        pw.close();
    }
}