package com.MarissaKWilson;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class Main {

		public static void main(String args[]){
			JFrame frame = new JFrame("LightScience");
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.getContentPane().add(emptyLabel, BorderLayout.CENTER);
			frame.pack();
			frame.setVisible(true);
		}
}
