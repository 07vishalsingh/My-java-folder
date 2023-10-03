import javax.swing.JOptionPane;
public class GUI {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("ENTER YOUR NAME");
        JOptionPane.showMessageDialog(null, "Hello "+name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("ENTER YOUR AGE"));
        JOptionPane.showMessageDialog(null, "You are "+age+" years old");

        double height = Double.parseDouble(JOptionPane.showInputDialog("ENTER YOUR HEIGHT"));
        JOptionPane.showMessageDialog(null, "You are "+height+" cm tall");

    }
}
