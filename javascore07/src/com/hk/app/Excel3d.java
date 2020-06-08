package com.hk.app;

public class Excel3d {

	public static void main(String[] args) {
		int sum = 0;
		int[][][] score = {
	            { {100, 70},
	              {90, 60},
	              {90, 80},
	              {100, 70} },
	            
	            { {90, 80},
	              {80, 70},
	              {90, 70},
	              {80, 80} },
	             
	            { {80, 70},
	              {90, 70},
	              {100, 80},
	              {80, 80} }};
	      
	      for(int i=0; i<3; i++) {
	         for(int j=0; j<4; j++) {
	            for(int k=0; k<2; k++) {
	               System.out.print(score[i][j][k]+" ");
	            }
	            System.out.println();
	         }
	         System.out.println();
	      }
	      
	      for (int i=0; i<3; i++) {
	    	  for (int j=0; j<4; j++) {
	    		  for (int k=0; k<1; k++) {
	    			  sum += score[i][j][k];
	    		  }
	    	  }
	      }
	      System.out.println("1~3반의 국어 점수의 합 : " + sum);
	}
}
