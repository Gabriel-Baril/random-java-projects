package com.fenetre;

import java.awt.Font;

import javax.swing.*;

public class PrinciFenetre {

	public static void main(String[] args) throws InterruptedException {

		int c = 0;

		JFrame fenetre = new JFrame();

		fenetre.setSize(600, 400);
		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fenetre.setVisible(true);
		fenetre.setTitle("title");

		JPanel pan = new JPanel();
		fenetre.add(pan);
		JLabel label = new JLabel();
		
		
			public static wait(300){}
			Font font = new Font("test", 3, 20);
			label.setFont(font);
			label.setText("NOMBRE : " + c);
			pan.add(label);
			fenetre.add(pan);
			c++;
		

	}

}
