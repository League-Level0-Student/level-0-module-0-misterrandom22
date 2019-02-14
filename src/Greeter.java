import javax.swing.JOptionPane;

public class Greeter {
public static void main(String[] args) {
	String name=JOptionPane.showInputDialog("what's your name");
	System.out.println("hi " +name);
	JOptionPane.showMessageDialog(null,"hi "+name);
}
}
