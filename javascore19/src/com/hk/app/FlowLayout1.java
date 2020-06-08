package com.hk.app;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayout1 extends JFrame {

	// 생성자
	FlowLayout1() { // 초기화
		// 프레임 초기 값
		setTitle("FLOW LAYOUT 1");
		setSize(300, 600);
		setLayout(new FlowLayout((FlowLayout.CENTER), 50, 50));
	}
	public static void main(String[] args) {
		
		FlowLayout1 f1 = new FlowLayout1();
		
		Container con = f1.getContentPane(); // 회색 영역에 배치
		JButton btn1 = new JButton("버튼1");
		JButton btn2 = new JButton("버튼2");
		JButton btn3 = new JButton("버튼3");
		con.add(btn1);
		con.add(btn2);
		con.add(btn3);
		
		f1.setVisible(true);
	}
}
