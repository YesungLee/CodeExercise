package com.hk.app;

import java.awt.*;

import javax.swing.*;

public class FlowLayoutEx extends JFrame {

	// 생성자
	FlowLayoutEx() { // 초기화
	// 프레임 초기 값
	setTitle("예제");
	setSize(400, 300);
	setLayout(new FlowLayout((FlowLayout.CENTER), 50, 50));
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		
		FlowLayoutEx f1 = new FlowLayoutEx();
		
		Container con = f1.getContentPane(); // 회색 영역에 배치
		// JLabel labelId = new JLabel("아이디");
		JTextField textId = new JTextField("아이디");
		JTextField textPw = new JTextField("비밀번호");
		JButton btn1 = new JButton("로그인");
		JButton btn2 = new JButton("취소");
		JButton btn3 = new JButton("회원가입");
		// con.add(labelId);
		con.add(textId);
		con.add(textPw);
		con.add(btn1);
		con.add(btn2);
		con.add(btn3);
		
		f1.setVisible(true);
	}
}
