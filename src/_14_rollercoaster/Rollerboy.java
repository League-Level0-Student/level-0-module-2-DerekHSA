package _14_rollercoaster;

import javax.swing.JOptionPane;

public class Rollerboy {
public static void main(String[] args) {
	String Height = JOptionPane.showInputDialog("What height are you(in inches)?");
	int num = Integer.parseInt(Height);
		if(num>=(48)) {
	JOptionPane.showMessageDialog(null, "Come on in!");
	}else{
		JOptionPane.showMessageDialog(null, "Get out and grow up!");
		
	}
}
}
