package com.ashu.playwithGUI;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFirstGUI {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		JButton button = new JButton("click me");
		// to close as soon as jframe quits
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(button);
		frame.setSize(300, 300);
		frame.setVisible(true);
	}
}
