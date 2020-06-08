package com.hk.app;

import java.util.ArrayList;

import com.hk.app.vo.DolphinVo;
import com.hk.app.vo.LionVo;

public class ArrayListEx {

	public static void main(String[] args) {

		LionVo king = new LionVo(); king.food = "햄버거";
		LionVo baby = new LionVo(); baby.food = "소세지";
		
		DolphinVo swim = new DolphinVo(); swim.food = "떡볶이";
		DolphinVo fast = new DolphinVo(); fast.food = "오징어";
		
		ArrayList zoo = new ArrayList();
		zoo.add(king);
		zoo.add(baby);
		zoo.add(swim);
		zoo.add(fast);
		
		for (int i=0; i<zoo.size(); i++) {
			
			if (i == 0 || i == 1) {
				LionVo temp1 = (LionVo)zoo.get(i);
				System.out.println(temp1.food);
			}
			else {
				DolphinVo temp1 = (DolphinVo)zoo.get(i);
				System.out.println(temp1.food);
			}
		}
	}

}
