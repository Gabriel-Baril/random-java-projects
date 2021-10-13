package com.fenetre;

import java.awt.FlowLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Action implements ActionListener {

	public void actionPerformed(ActionEvent e) {
		
		JFrame fr = new JFrame();
		fr.setSize(300, 200);
		fr.setVisible(true);
		
		JPanel panel = new JPanel();
		JLabel label = new JLabel("Bienvenue dans ma modeste application");
		
		fr.add(panel);
		panel.add(label);
		
		
		
	}
}
