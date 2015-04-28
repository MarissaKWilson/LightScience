package com.MarissaKWilson;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class View {
	
	static private Thread animator;
	
	public static void Main(String[] args){
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1000, 600);
		
		//experiment space
		JPanel space = new JPanel();
		space.setVisible(true);
		
	}
}
