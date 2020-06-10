package com.hk.app;

import java.awt.BorderLayout;
import java.awt.Container; // swing의 부모 클래스 -> 기능 제한

// 독립적으로 만듬 -> 플랫폼 상관 없음
import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame2 extends JFrame { // JFrame으로 윈도창 생성

	JButton btn = new JButton("테스트");
	JButton btn2 = new JButton("테스트2");

	// 초기화
	MyFrame2() {
		setTitle("타이틀 제목"); // 창 제목
		setSize(300, 300); // 창의 크기
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	// 버튼 생성을 하는 createwindows 메소드
	public void createwindows() {
		Container cont = getContentPane();
		BorderLayout mgr = new BorderLayout();
		cont.add(btn, BorderLayout.CENTER);
		cont.add(btn2, BorderLayout.EAST);
		// cont.add(btn);
	}

	public static void main(String[] args) {
		MyFrame2 myFm = new MyFrame2();
		myFm.createwindows(); // createwindows 메소드 실행
	}

}
