package com.hk.app;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class SwingPerform extends JFrame implements ActionListener {
	
	JButton btnprt = new JButton("프린트출력");
	JButton btncc = new JButton("출력취소");
	JLabel txt = new JLabel("상태 : ", JLabel.CENTER);
	JPanel pan = new JPanel();
	
	
	SwingPerform() {
		setTitle("이벤트-액션퍼폼");
		setSize(300, 300);
		pan.add(btnprt);
		pan.add(btncc);
	}

	public void createwindows() {
		Container fmcont = getContentPane();
		fmcont.setLayout(new BorderLayout());
		fmcont.add(txt, BorderLayout.CENTER);
		fmcont.add(pan, BorderLayout.SOUTH);
		
		btnprt.addActionListener(this);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		
		SwingPerform sl = new SwingPerform();
		sl.createwindows();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource().equals(btnprt) )
		JOptionPane.showMessageDialog(this, "출력중");
	}

}
