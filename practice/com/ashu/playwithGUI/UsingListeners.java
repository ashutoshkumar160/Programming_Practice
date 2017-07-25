package com.ashu.playwithGUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class UsingListeners implements ActionListener {
	JButton button;

	public static void main(String[] args) {
		UsingListeners ul = new UsingListeners();
		ul.go();
	}

	public void go() {
		JFrame frame = new JFrame();
		button = new JButton("click me");

		button.addActionListener(this);
		frame.getContentPane().add(button);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 300);
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent event) {
		button.setText("i hv been clicked");
	}
}
