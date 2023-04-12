package game;

public class Potions {
	double cura;
	double cost;
	String name;
	int ammont;
	boolean armor;
	
	Potions(double cura, String name, double cost, int ammont,boolean armor){
		this.cura = cura;
		this.name = name;
		this.cost = cost;
		this.ammont = ammont;
		this.armor  = armor;
	}
	
	
	double heal(double life, double cura, String name) {
		life = life + cura ;
		System.out.println("hai usato "+name);
		System.out.println("vita: "+life);
		return life;
		
				
	}
	
	
	
	
	
	
}
