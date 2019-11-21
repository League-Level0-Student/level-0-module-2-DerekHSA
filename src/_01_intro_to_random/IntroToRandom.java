//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

package _01_intro_to_random;

import java.util.Random;

public class IntroToRandom {
	public static void main(String[] args) {
		
		int num = 0;
		Random ran = new Random();
		num=ran.nextInt(100);
		num=ran.nextInt(75 - 25)+25;
		System.out.println(num);
		//2. Run the program.  What number appears in the console?
		//   Run it again. Is the number the same?
	}
}
