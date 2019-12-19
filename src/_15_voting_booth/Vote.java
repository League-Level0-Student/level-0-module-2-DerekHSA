package _15_voting_booth;

import javax.swing.JOptionPane;

public class Vote {
public static void main(String[] args) {
	String Age = JOptionPane.showInputDialog("How old are you?");
	int num = Integer.parseInt(Age);
		if(num>=(18)) {
	JOptionPane.showInputDialog("Who should be the next president?");
	}else{
		JOptionPane.showMessageDialog(null, "No one cares what you think!");
	
	
	
	
}
}
}
