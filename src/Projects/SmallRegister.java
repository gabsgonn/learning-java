package Projects;

import javax.swing.JOptionPane;

// create an interface that receives inputs and then prints everything: Expressions, If, Math, RandomNumbers, Variables

public class SmallRegister {

    public static void main(String[] args) {

        // Input normal:
        // String to the program shows the message
        String name = JOptionPane.showInputDialog("Enter your name: ");
        int age = Integer.parseInt(JOptionPane.showInputDialog("And your age: "));

        // Simple math operations
        int ageNextYear = age + 1; // Age next year
        double ageDouble = age * 2; // Double age results

        // Display results
        String message = "Your name is " + name + ".\n" +
                "You are " + age + " years old.\n" +
                "Next year, you will be " + ageNextYear + " years old.\n" +
                "The double of your age is " + ageDouble + ".\n"
                ;

        JOptionPane.showMessageDialog(null, message);
    }
}
