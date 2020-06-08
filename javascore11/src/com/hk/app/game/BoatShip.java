package com.hk.app.game;
import java.util.*;
public class BoatShip extends Character {
	
	@Override
	void move(int x, int y, int z) {
		this.x = x*50;
		this.y = y*50;
		this.z = 0;
		Random rnd = new Random();
	}

}
