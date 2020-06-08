package com.hk.app;

import java.util.Scanner;

import com.hk.app.dao.WorkerDao;

public class AdminMain {

	public static void main(String[] args) {

		WorkerDao wd = new WorkerDao(); // worker 테이블에 sql
		// int result = wd.getTotalWorker();
		// System.out.println("총 인원 수 : " + result);
		Scanner sc = new Scanner(System.in);
		System.out.print("아이디 : ");
		String id = sc.next();
		System.out.print("비밀번호 : ");
		String pwd = sc.next();
		
		int login = wd.checkLogin(id, pwd);
		if (login == 1) {
			System.out.println("로그인 성공");
		} else System.out.println("로그인 실패");
		int selectNo;
		
		while(true) {
			System.out.println("==================================================");
			System.out.println("1. 전화번호 변경 | 2. 비밀번호 변경 | 3. 게시판 접속 | 4. 종료");
			System.out.println("==================================================");
			selectNo = sc.nextInt();
			if (selectNo == 1) {
				System.out.print("아이디 : ");
				id = sc.next();
				int chgphone = wd.idcheck(id);
				if (chgphone == 1) {
					System.out.print("수정할 전화번호 : ");
					String phone = sc.next();
					System.out.println("변경 완료");
					wd.updatePhone(id, phone);
				} else System.out.println("아이디가 다릅니다.");
			} else {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			
		}
				
		
	}

}
