import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Ex2 {
    public static void main(String[] args) throws Exception{
        Scanner fileScanner = new Scanner(new File("./users.txt"));
        double sum = 0;
        int count = 0;

        while(fileScanner.hasNext()) {
            String line = fileScanner.nextLine();

            StringTokenizer reader = new StringTokenizer(line, ", ");

            if (reader.countTokens() != 3) {
                throw new IOException("Invalid input format!");
            } else {
                String name = reader.nextToken();
                String address = reader.nextToken();
                int age = Integer.parseInt(reader.nextToken());
                sum += age;
                count++;
                System.out.println(name
                        + " lives at " + address
                        + " and is "
                        + age + " years old");
            }
        }
        if (count > 0) {
            System.out.printf("Average age = %.2f \n", sum / count);
            fileScanner.close();
        }
    }
}
