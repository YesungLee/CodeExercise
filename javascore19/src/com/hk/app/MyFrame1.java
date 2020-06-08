package com.hk.app;

import java.awt.Container; // swing의 부모 클래스 -> 기능 제한
import java.awt.FlowLayout;

// 독립적으로 만듬 -> 플랫폼 상관 없음
import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame1 extends JFrame { // JFrame으로 윈도창 생성
	
	MyFrame1() {
		setTitle("JFrame 메인 창"); // 창 제목
		setSize(400, 300); // 창의 크기
		// setVisible(true);
	}

	public static void main(String[] args) {
		
		MyFrame1 myFm = new MyFrame1();
		Container myCont = myFm.getContentPane(); // 컨테이너
		
		// 레이아웃 변경
		FlowLayout mgr = new FlowLayout(); // 선형
		myCont.setLayout(mgr);
		
		JButton btn = new JButton("테스트 버튼");
		JButton btn2 = new JButton("테스트 버튼2");
		
		// 컨테이너에 btn을 추가
		myCont.add(btn);
		myCont.add(btn2);
		
		myFm.setVisible(true); // 그려주는 함수
		
	}
	
	public static void close() {
		
	}

}
