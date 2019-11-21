package _06_lottery_numbers;

import java.util.Random;

import javax.swing.JOptionPane;

public class LOTTERY {
public static void main(String[] args) {		
	Random randomMaker = new Random();
	int a1 = randomMaker.nextInt(10);
	int a2 = randomMaker.nextInt(10);
	int a3 = randomMaker.nextInt(10);
	int a4 = randomMaker.nextInt(10);
	int a5 = randomMaker.nextInt(10);
	JOptionPane.showMessageDialog(null, "And the number is!\n"+a1+" "+a2+" "+a3+" "+a4+" "+a5);
}
}
