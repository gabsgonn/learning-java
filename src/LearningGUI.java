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
