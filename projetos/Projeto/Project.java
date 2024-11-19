package Projeto;

import javax.swing.JOptionPane;
import java.util.Random;

// in this project i 

public class Project {

    public static void main(String[] args) {
        
	String name = JOptionPane.showInputDialog("Enter your name");
	int age = Integer.parseInt(JOptionPane.showInputDialog("And your age"));
	
	Random random = new Random();
	int number = random.nextInt()+1;

	JOptionPane.showMessageDialog(null, "Hello "+name+"."+"\n"+
	"You are "+age+" years old."+"\n"+
	"Your random number is "+number+
	""
		
	);
    }
}



/*

RandomNumbers:
import java.util.Random;

public class LearningRandomNumbers {

    public static void main(String[] args) {
        
        Random random = new Random();

        // int x = random.nextInt(6)+1;
        // double y = random.nextDouble();
        boolean z = random.nextBoolean();

        System.out.println(z);
    }
}

OptionPane:
import javax.swing.JOptionPane;
// import javax.swing.JOptionPane;

public class LearningGUI {

    public static void main(String[] args) {

        String name = JOptionPane.showInputDialog("Enter your name");
        JOptionPane.showMessageDialog(null, "Hello " + name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
        JOptionPane.showMessageDialog(null, "You are "+age+" years old :D.");

        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter you height"));
        JOptionPane.showMessageDialog(null, "You are "+height+" cm tall :O.");

    }
}
*/