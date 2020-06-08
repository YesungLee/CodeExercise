package com.hk.app.elect;

public class Tv {
	// 필드 - 데이터 저장 장소 - TV의 상태
	boolean pow; // 전원
	String col; // 색상
	int vol; // 볼륨
	int size; // 크기
	int chn; // 채널
	
	// 메소드 - 실행 블록 - 행동
	void powOn() { pow = !pow; } // 전원 조작
	void volUp() { vol++; } // 볼륨 올리기
	void chgChn(int c) { chn = c; } // 채널 변경
}
