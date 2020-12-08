package _04_popcorn;

import javax.swing.JOptionPane;

public class PopcornMaker {
	
	public static void main(String[] args) {
		
		Microwave microwave = new Microwave();
		
		String Corn = JOptionPane.showInputDialog("What flavor popcorn would you like?");
		
		Popcorn popcorn = new Popcorn(Corn);
		
		microwave.putInMicrowave(popcorn);
		
		String time = JOptionPane.showInputDialog("How many seconds would you like to cook your popcorn for?");
		
		int cookTime = Integer.parseInt(time);
		
		microwave.setTime(cookTime);
		
		popcorn.applyHeat();
}}
