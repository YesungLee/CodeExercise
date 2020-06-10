package com.hk.app;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

// 상속받지 않고 만들기
public class LayoutGrid1 {

	JFrame frame = new JFrame("grid");
	JButton btn = new JButton("1번");
	JButton btn2 = new JButton("2번");
	JButton btn3 = new JButton("3번");
	JButton btn4 = new JButton("4번");
	JButton[] btns = new JButton[4];

	LayoutGrid1() {
		for (int i = 0; i < 4; i++) {
			btns[i] = new JButton(i + 1 + "");
		}
	}

	public void createWindows() {
		frame.setTitle("그리드 레이아웃");
		frame.setSize(400, 400);

		GridLayout manager = new GridLayout(2, 2, 10, 10);
		frame.setLayout(manager);

		for (int i = 0; i < 4; i++) {
			frame.add(btns[i]);
		}

		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

	// 보통 다른 클래스에 메인 작성
	public static void main(String[] args) {
		LayoutGrid1 newWin = new LayoutGrid1();
		newWin.createWindows();
	}
}
