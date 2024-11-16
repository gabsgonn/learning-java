//imports the Scanner class from the java.util package
import java.util.Scanner;

// Create Class
public class LearningScanner {

    public static void main(String[] args) {

        //A Scanner object called scanner is created to read the input
        Scanner scanner = new Scanner(System.in);

        //Reads the entire line of text entered by the user using scanner.nextLine()
        System.out.println("What is your name? ");
        String name = scanner.nextLine();

        System.out.println("How old are you? ");
        int age = scanner.nextInt();

        //This clears the newline character (\n) left in the buffer after calling nextInt().
        //Without this step, subsequent calls to scanner.nextLine() would skip input
        scanner.nextLine();

        System.out.println("What is your favorite food? ");
        String food = scanner.nextLine();

        //Constructs a message using the input values (name, age and food)
        System.out.println("Hello "+name+", you are "+age+" years old. " +
                "You like "+food+".");

        scanner.close();
    }
}
