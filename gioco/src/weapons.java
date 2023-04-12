package game;

public class weapons {
	double damage;
	String name;
	double attackSpeed;
	double cost;
	Boolean own;
	
	weapons(double damage,String name,double attackSpeed,double cost,boolean own){
		this.damage = damage;
		this.name = name;
		this.attackSpeed = attackSpeed;
		this.cost = cost;
		this.own = own;
		
	
	}

	int attack(double hpMob,String nameMob,String nameSword) {
		hpMob = hpMob-damage;
		System.out.println("hai usato "+nameSword+" contro "+nameMob);
		System.out.println("hp di "+nameMob+":"+hpMob);
		return (int) hpMob;
	}
}
