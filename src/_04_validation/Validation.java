//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

package _04_validation;

import java.util.Random;

import javax.swing.JOptionPane;

public class Validation {
	public static void main(String[] args) {
		
		Random randomMaker = new Random();
		
		int randomNumber = randomMaker.nextInt(10)+1;
		System.out.println(randomNumber);

		// 1. Use each value of randomNumber to give the user a random compliment.
		int Com1 = 1;
		if (randomNumber==Com1) {
		JOptionPane.showMessageDialog(null,("Your awesome!"));
		}
		int Com2 = 2;
		if (randomNumber==Com2) {
		JOptionPane.showMessageDialog(null,("Your cool!"));
		}		
		int Com3 = 3;
		if (randomNumber==Com3) {
		JOptionPane.showMessageDialog(null,("Your an amazing person!"));
		}
		int Com4 = 4;
		if (randomNumber==Com4) {
		JOptionPane.showMessageDialog(null,("Cool shoes!"));
		}
		int Com5 = 5;
		if (randomNumber==Com5) {
		JOptionPane.showMessageDialog(null,("Cool watch!"));
		}
		int Com6 = 6;
		if (randomNumber==Com6) {
		JOptionPane.showMessageDialog(null,("Cool T-Shirt!"));
		}
		int Com7 = 7;
		if (randomNumber==Com7) {
		JOptionPane.showMessageDialog(null,("Nice attitude!"));
		}
		int Com8 = 8;
		if (randomNumber==Com8) {
		JOptionPane.showMessageDialog(null,("Cool haircut!"));
		}
		int Com9 = 9;
		if (randomNumber==Com9) {
		JOptionPane.showMessageDialog(null,("Nice phone!"));
		}
		int Com10 = 10;
		if (randomNumber==Com10) {
		JOptionPane.showMessageDialog(null,("Nice try!"));
		}
		// 3. Find someone to test out your program. They will like it :)
	}
}
