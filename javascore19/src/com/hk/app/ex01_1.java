package com.hk.app;

import java.awt.*;

import javax.swing.*;

public class ex01_1 extends JFrame {
	
	ex01_1() {
		setTitle("login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridLayout grid = new GridLayout(4,2);
		grid.setVgap(5);
		setLayout(grid);
		add(new JLabel("이름"));
		add(new JTextField("이름"));
		add(new JLabel("이름"));
		add(new JTextField("이름"));
		add(new JLabel("이름"));
		add(new JTextField("이름"));
		setSize(400, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {

		ex01_1 g1 = new ex01_1();
	}

}
