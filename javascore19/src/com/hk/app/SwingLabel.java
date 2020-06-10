package com.hk.app;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class SwingLabel extends JFrame {
	
	JLabel txt = new JLabel("타이틀 제목 : 레이블");
	JLabel txt2 = new JLabel("", JLabel.CENTER);
	
	SwingLabel() {
		setTitle("스윙컨트롤-레이블");
		setSize(300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void createwindows() {
		Container fmcont = getContentPane();
		fmcont.setLayout(new BorderLayout());
		String temp = txt.getText(); // 텍스트 가져오는 함수
		txt2.setText(temp); // 텍스트 변경하는 함수
		txt2.setText("중앙");
		txt2.setOpaque(true);
		txt2.setForeground(Color.blue);
		txt2.setBackground(Color.GREEN);
		fmcont.add(txt2, BorderLayout.CENTER);
		setVisible(true);
	}
	public static void main(String[] args) {
		
		SwingLabel sl = new SwingLabel();
		sl.createwindows();
	}

}
