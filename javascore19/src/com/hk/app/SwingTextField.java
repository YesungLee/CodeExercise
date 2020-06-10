package com.hk.app;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class SwingTextField extends JFrame {
	
	JPanel pan = new JPanel();
	JPanel pan2 = new JPanel();
	JPanel pan3 = new JPanel();

	JButton btn = new JButton("주문하기");
	JCheckBox ch1 = new JCheckBox("피자");
	JCheckBox ch2 = new JCheckBox("샌드위치");
	
	JRadioButton ra1 = new JRadioButton("회원");
	JRadioButton ra2 = new JRadioButton("비회원");
	ButtonGroup btngrp = new ButtonGroup();
	
	JTextField text = new JTextField("", 10);
	
	
	SwingTextField() {
		setTitle("스윙컨트롤-체크박스");
		setSize(300, 300);
		ch1.setSelected(true); // 선택여부
		pan.add(ch1);
		pan.add(ch2);
		btngrp.add(ra1);
		btngrp.add(ra2);
		pan2.add(ra1);
		pan2.add(ra2);
		
		pan3.add(text);
		pan3.add(btn);

	}

	public void createwindows() {
		Container fmcont = getContentPane();
		fmcont.setLayout(new BorderLayout());
		fmcont.add(pan, BorderLayout.NORTH);
		fmcont.add(pan3, BorderLayout.CENTER);
		fmcont.add(pan2, BorderLayout.SOUTH);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		
		SwingTextField sl = new SwingTextField();
		sl.createwindows();
	}

}
