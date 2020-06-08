package com.hk.app.bank;
import java.util.*;
public class BankApplication {
	private static Account[] accountArray = new Account[100]; // 계좌 정보가 담긴 배열 생성
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		while(true) {
			System.out.println("---------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.입금 | 4.출금 | 5.종료");
			System.out.println("---------------------------------------");
			System.out.print("메뉴를 고르세요(1~5) > ");
			
			// 키보드로 입력한 숫자에 따라 각기 다른 메소드 실행
			int selectNo = sc.nextInt();
			if(selectNo == 1) createAccount();
			else if(selectNo == 2) accountList();
			else if(selectNo == 3) deposit();
			else if(selectNo == 4) withdraw();
			else if(selectNo == 5) break;
			else {
				System.out.println("1~5이외의 숫자를 입력하셨습니다.");
				break;
			}
		}
		System.out.println("프로그램을 종료합니다.");
	}
	
	// 계좌 생성하기
	private static void createAccount() { // 계좌 생성 메소드
		System.out.println("----------");
		System.out.println("계좌 생성");
		System.out.println("----------");
		System.out.print("계좌 번호 : ");
		String ano = sc.next();
		System.out.print("계좌주 : ");
		String owner = sc.next();
		System.out.print("초기 금액 : ");
		int balance = sc.nextInt();
		
		// 입력 받은 정보들을 accountArray 배열에 저장 후 break
		Account account = new Account(ano, owner, balance);
		for (int i=0; i<accountArray.length; i++) {
			if (accountArray[i] == null) {
				accountArray[i] = account;
				break;
			}
		}
		System.out.println("계좌가 생성되었습니다.");
	}
	
	// 계좌 목록보기
	private static void accountList() { // 계좌 목록 메소드
		System.out.println("----------");
		System.out.println("계좌 목록");
		System.out.println("----------");
		
		for (int i=0; i<accountArray.length; i++) {
			Account account = accountArray[i];
			if (accountArray[i] != null) { // 계좌 정보 배열의 내용이 비어 있지 않으면 계좌 정보 내역을 출력
				System.out.print(account.getAno() + "\t" + account.getOwner() + "\t" + account.getBalance());
				System.out.println();
			} else break;
		}
	}
	
	// 예금하기
	private static void deposit() { // 입금 메소드
		System.out.println("----------");
		System.out.println("입금");
		System.out.println("----------");
		System.out.print("계좌 번호 : ");
		String ano = sc.next();
		
		// 입력한 계좌 번호가 accountArray에 있다면 예금을 처리하고 없으면 계좌번호를 찾지 못하는 메시지 출력
		if(findAccount(ano) == null) System.out.println("입력한 계좌번호를 찾지 못했습니다.");
		else {
			System.out.print("입금할 금액 : ");
			int balance = sc.nextInt();
			findAccount(ano).setBalance(findAccount(ano).getBalance() + balance);
			System.out.println("입금이 정상 처리되었습니다.");
			System.out.println("입금된 금액 : " + balance);
			System.out.println("남은 잔액 : " + findAccount(ano).getBalance());
		}
	}

	// 출금하기
	private static void withdraw() { // 출금 메소드
		System.out.println("----------");
		System.out.println("출금");
		System.out.println("----------");
		System.out.print("계좌 번호 : ");
		String ano = sc.next();
		
		if (findAccount(ano) == null) System.out.println("입력한 계좌번호를 찾지 못했습니다.");
		else {
			System.out.print("출금할 금액 : ");
			int balance = sc.nextInt();
			if (balance > findAccount(ano).getBalance()) System.out.println("잔액이 부족합니다.");
		else {
			findAccount(ano).setBalance(findAccount(ano).getBalance() - balance);
			System.out.println("출금이 정상 처리되었습니다.");
			System.out.println("출금된 금액 : " + balance);
			System.out.println("남은 잔액 : " + findAccount(ano).getBalance());
			}
		}
		
	}
	
	// Account 배열에서 ano와 동일한 Account 객체 찾기
	private static Account findAccount(String ano) { // 계좌 번호 찾는 메소드
		for (int i=0; i<accountArray.length; i++) {
			if(accountArray[i] == null) break; // 예금, 출금 메소드에서 입력한 계좌 번호가 null이면 null을 반환
			if(accountArray[i].getAno().contentEquals(ano)) return accountArray[i]; // 계좌 번호가 있으면 accountArray[i]의 값을 반환해준다.
		}
		return null;
	}
}
