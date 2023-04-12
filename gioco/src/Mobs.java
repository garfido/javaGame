package game;

import java.util.ArrayList;

public class Mobs {
	double hp;
	String name;
	boolean alive;
	double damage;
	double dan_ag = 0;
	ArrayList<Double> playerr = new ArrayList<Double>();
	
	
	
	
	Mobs(double hp,double damage,String name, boolean alive){
		this.hp = hp;
		this.damage = damage;
		this.name = name;
		this.alive = alive;
	}
	
	ArrayList<Double> damage(double life,double shild,double damage) {
		playerr.add(0.0);
		playerr.add(0.0);
		if(damage < shild) {
			shild = shild-damage;
		}else {
			if(shild != 0) {
				dan_ag = damage-shild;
				shild = 0;
				life = life - dan_ag;
			}else {
				life = life - damage;
				
			}
			
			
		}
		playerr.set(0,life);
		playerr.set(1,shild);
		System.out.println("hai "+playerr.get(0)+" e "+playerr.get(1)+" di scudo");
		return playerr;
	}
	
	
		
	
}
