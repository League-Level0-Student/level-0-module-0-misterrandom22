import javax.swing.JOptionPane;

public class IKnowWhatYouDidLastSummer {
public static void main(String[] args) {
	String name=JOptionPane.showInputDialog("what is your name?");
	System.out.println("I know what you did last summer,"+name);
	JOptionPane.showMessageDialog(null, "I know whatyou did last summer, "+name);
}
}
