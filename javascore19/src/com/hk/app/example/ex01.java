package com.hk.app.example;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ex01 extends JFrame {

	JPanel pan1 = new JPanel();
	JButton btn = new JButton("확인");
	JButton btn2 = new JButton("취소");
	JLabel txt = new JLabel("0", JLabel.RIGHT);
	JButton[] btns = new JButton[16];
	String[] arr = { "7", "8", "9", "/", "4", "5", "6", "*", "1", "2", "3", "-", "C", "0", "=", "+" };

	ex01() {
		setTitle("계산기");
		setSize(220, 250);
		for (int i = 0; i < btns.length; i++) {
			btns[i] = new JButton(arr[i]);
		}
		GridLayout mgr = new GridLayout(4, 4, 1, 1);
		pan1.setLayout(mgr);
		for (int i = 0; i < btns.length; i++) {
			pan1.add(btns[i]);
		}
	}

	public void createWindows() {

		BorderLayout mgr2 = new BorderLayout();
		setLayout(mgr2);
		txt.setFont(new Font("굴림", Font.BOLD, 30));
		add(txt, BorderLayout.NORTH);
		add(pan1);

		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		ex01 newWin = new ex01();
		newWin.createWindows();
	}
}
