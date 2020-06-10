package com.hk.app;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class LayoutBorder1 extends JFrame {

	static JButton btn = new JButton("첫 번째 버튼");
	static JButton btn2 = new JButton("두 번째 버튼");
	static JButton btn3 = new JButton("세 번째 버튼");
	static JButton btn4 = new JButton("네 번째 버튼");
	static JButton btn5 = new JButton("다섯 번째 버튼");

	LayoutBorder1() { // 초기화
		// 프레임 초기 값
		setTitle("FLOW LAYOUT 1");
		setSize(500, 600);
		BorderLayout border = new BorderLayout(20,20);
		setLayout(border);
	}

	public void createWindows() {
		add(btn, BorderLayout.CENTER);
		add(btn2, BorderLayout.NORTH);
		add(btn3, BorderLayout.WEST);
		add(btn4, BorderLayout.EAST);
		add(btn5, BorderLayout.SOUTH);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	// 보통 다른 클래스에 메인 작성
	public static void main(String[] args) {
		LayoutBorder1 newWin = new LayoutBorder1();
		newWin.createWindows();
	}
}
