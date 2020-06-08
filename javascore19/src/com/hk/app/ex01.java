package com.hk.app;

import java.awt.*;

import javax.swing.*;

public class ex01 extends JFrame {
	
	ex01() {
		setTitle("login");
		setSize(400, 300);
		setLayout(new GridLayout(3,3,50,50));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {

		ex01 g1 = new ex01();
		
		Container con = g1.getContentPane();
		
		JLabel lblId = new JLabel("아이디");
		JTextField txtId = new JTextField("");
		JLabel lblPw = new JLabel("비밀번호");
		JTextField txtPw = new JTextField("");
		JButton btnReset = new JButton("다시 입력");
		JButton btnLogin = new JButton("로그인");
		
		con.add(lblId);
		con.add(txtId);
		con.add(lblPw);
		con.add(txtPw);
		con.add(btnReset);
		con.add(btnLogin);
		
		g1.setVisible(true);
	}

}
