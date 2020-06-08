package com.hk.app.example;

public class BallUtils extends Shape3dVo {
	
	int r;
	
	BallUtils(int x, int y, int z, int r) {
		this.x=x;
		this.y=y;
		this.z=z;
		this.r=r;
	}
	
	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}
	
	double CalcVolume() {
		return (4/3)*Math.PI*Math.pow(r, 3);
	}
	
	public static void main(String[] args) {
		BallUtils answer = new BallUtils(4,3,5,10);
		
		System.out.println("X 좌표 : " + answer.getX());
		System.out.println("Y 좌표 : " + answer.getY());
		System.out.println("Z 좌표 : " + answer.getZ());
		System.out.println("반지름 : " + answer.getR());
		System.out.println("원의 부피 : " + answer.CalcVolume());
	}

}
