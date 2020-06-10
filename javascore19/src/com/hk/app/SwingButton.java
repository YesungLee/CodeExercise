package com.hk.app;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class SwingButton extends JFrame {
	
	ImageIcon imgok = new ImageIcon("images/ok.png");
	ImageIcon imgcc = new ImageIcon("images/cancel.png");	
	JButton btnok = new JButton("확인", imgok);
	JButton btncc = new JButton("취소", imgcc);
	
	SwingButton() {
		setTitle("스윙컨트롤-버튼");
		setSize(300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void createwindows() {
		Container fmcont = getContentPane();
		fmcont.setLayout(new BorderLayout());
		fmcont.add(btnok, BorderLayout.NORTH);
		fmcont.add(btncc, BorderLayout.SOUTH);
		setVisible(true);
	}
	public static void main(String[] args) {
		
		SwingButton sl = new SwingButton();
		sl.createwindows();
	}

}
