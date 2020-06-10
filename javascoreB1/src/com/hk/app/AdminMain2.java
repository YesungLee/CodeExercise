package com.hk.app;

import java.util.*;

import com.hk.app.dao.WorkerDao;
import com.hk.app.vo.WorkerVo;

public class AdminMain2 {

	public static void main(String[] args) {

		// 아이디를 입력 받음
		Scanner sc = new Scanner(System.in);
		System.out.print("아이디를 입력하세요 : ");
		String id = sc.next();
		
		// 해당 아이디의 정보를 출력
		WorkerDao worker = new WorkerDao();
		WorkerVo result = new WorkerVo();
		worker.getWorketById(id);
		
		System.out.println("아이디 : " + result.getId());
		System.out.println("비밀번호 : " + result.getPwd());
		System.out.println("이름 : " + result.getName());
		System.out.println("전화번호 : " + result.getPhone());
	}

}
