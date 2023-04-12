package game;
import java.util.Scanner;



import java.util.ArrayList;

public class gamee {

	public static void main(String[] args) {
		//start
		ArrayList<Double> player = new ArrayList<Double>();
		double life = 100;
		double shild = 0;
		player.add(life);		player.add(shild);
		Scanner scanner = new Scanner(System.in);
		//spade
		weapons startSword = new weapons(12, "start Sword", 1.0, 0,true);
		weapons BasicSword = new weapons(20,"Basic Sword",1.0,10,false);
		weapons woodSword  = new weapons(25,"wood Sword",1.0,20,false);
		weapons boneSword = new weapons(27,"bone Sword",1.1,35,false);
		weapons copperSword = new weapons(30,"copper Sword",1.1,45,false);
		weapons katana = new weapons(40, "katana", 1.5, 60, false);
		weapons pistola = new weapons(50, "pistola", 0.9, 75, false);
		
		ArrayList<String> weaponss = new ArrayList<String>();
		weaponss.add(BasicSword.name);
		weaponss.add(woodSword.name);
		weaponss.add(boneSword.name);
		weaponss.add(copperSword.name);
		weaponss.add(katana.name);
		weaponss.add(pistola.name);
		
		
		
		
		//mobs
		
		Mobs start = new Mobs(1,0, "null", true);
		
		Mobs zombie = new Mobs(100,8,"zombie",true);
		Mobs goblin = new Mobs(110,20, "goblin", true);
		Mobs scheletro = new Mobs(120,25,"scheletro",true);
		Mobs mummia = new Mobs(130,35,"mummia", true);
		
		
		// pozioni
		
		Potions basicPotions = new Potions(50, "Basic Potions", 5, 0,false);
		Potions recoveryPotions = new Potions(100, "Recovery Potions", 10, 0,false);
		Potions armorPotions = new Potions(50, "Armor Potions", 20, 0,true);
		Potions plusArmorPotions = new Potions(100, "Plus Armor Potions", 40, 0, true);
		
		ArrayList<String> potionss = new ArrayList<String>();
		potionss.add(basicPotions.name);
		potionss.add(recoveryPotions.name);
		potionss.add(armorPotions.name);
		potionss.add(plusArmorPotions.name);
		
		Double coin = 10.0;
		
		
		
	
		
		
 		
		
		
		
		
		
		
		while(life > 0){
			
			
			
			System.out.println("azione: ");
			System.out.println("1-fight");
			System.out.println("2-shop");
			System.out.println("3-inventario");
			System.out.println("4-usa pozzioni");
			int azz = scanner.nextInt();
			System.out.println(" ");
			
			if(azz ==4) {
				int nu = 0;
				for(String i : potionss) {
					nu++;
					System.out.println(nu+"-"+i);
				}
				System.out.println(" ");
				
				int usa_poz = scanner.nextInt();
				System.out.println(" ");
				switch(usa_poz) {
				case 1:
					if(player.get(0) < 100) {
						if(basicPotions.ammont > 0) {
							player.set(0, player.get(0)+basicPotions.cura);
							basicPotions.ammont--;
							if(player.get(0) > 100) {
								player.set(0,Double.valueOf(100));
							}
							System.out.println("ora hai "+player.get(0)+" di vita e "+player.get(1)+" di scudo");
						}else {
							System.out.println("non hai abbastanza pozzioni");
						}
					}else {
						System.out.println("vita gia al massimo");
					}
					break;
				case 2:
					if(player.get(0) < 100) {
						if(recoveryPotions.ammont>0) {
							player.set(0, player.get(0)+recoveryPotions.cura);
							recoveryPotions.ammont--;
							if(player.get(0) > 100) {
								player.set(0,Double.valueOf(100));
							}
							System.out.println("ora hai "+player.get(0)+" di vita e "+player.get(1)+" di scudo");
						}else {
							System.out.println("non hai abbastanza pozzioni");
						}
					}else {
						System.out.println("vita gia al massimo");
					}
					break;
				case 3:
					if(player.get(1) < 100) {
						if(armorPotions.ammont > 0) {
							player.set(1,armorPotions.cura);
							armorPotions.ammont--;
							if(player.get(1) > 100) {
								player.set(1,Double.valueOf(100));
							}
							System.out.println("ora hai "+player.get(0)+" di vita e "+player.get(1)+" di scudo");
						}else {
							System.out.println("non hai abbastanza pozzioni");
						}
					}else {
						System.out.println("scudo gia al massimo");
					}
					break;
				case 4:
					if(player.get(1) < 100) {
						if(plusArmorPotions.ammont > 0) {
							player.set(1,plusArmorPotions.cura);
							plusArmorPotions.ammont--;
							if(player.get(1) > 100) {
								player.set(1,Double.valueOf(100));
							}
							System.out.println("ora hai "+player.get(0)+" di vita e "+player.get(1)+" di scudo");
						}else {
							System.out.println("non hai abbastanza pozzioni");
						}
					}else {
						System.out.println("scudo gia al massimo");
					}
					break;
					
				}
				usa_poz =0;
			}
			
			if(azz == 3) {
				System.out.println("armi:");
				System.out.println(" ");
				System.out.println("basicSword: "+BasicSword.own);
				System.out.println("woodSword: "+woodSword.own);
				System.out.println("boneSword: "+boneSword.own);
				System.out.println("copperSword: "+copperSword.own);
				System.out.println("katana:"+katana.own);
				System.out.println("pistola"+pistola.own);
				System.out.println(" ");
				System.out.println("pozioni:");
				System.out.println("basicPotions: "+basicPotions.ammont);
				System.out.println("recovertyPotions: "+recoveryPotions.ammont);
				System.out.println("armorPotions: "+armorPotions.ammont);
				System.out.println("plusArmorPotions: "+plusArmorPotions.ammont);
				System.out.println("");
				System.out.println("coin:"+coin);
				System.out.println("");
				System.out.println("vita:"+player.get(0));
				System.out.println("scudo:"+player.get(1));
				System.out.println("");
				
			}
			
			
			if(azz == 1) {
				
				
				// scegli il mob 
				var mob = start;
				
				System.out.println("1-zombie");
				System.out.println("2-goblin");
				System.out.println("3-scheletro");
				System.out.println("4-mummia");
				int mo = scanner.nextInt();
				System.out.println(" ");
				if(mo == 1) {
					mob = zombie;
				}else if(mo == 2) {
					mob = goblin;
				}else if(mo == 3) {
					mob = scheletro;
				}else if(mo == 4) {
					mob = mummia;
				}
				
				
				
				
				//scegli spada
				var swo = BasicSword;
				boolean ownn = false;
				while(ownn == false) {
					System.out.println("scegli la spada ");
					System.out.println("1-startSword");
					System.out.println("2-BasicSword");
					System.out.println("3-woodSword");
					System.out.println("4-boneSword");
					System.out.println("5-copperSword");
					System.out.println("6-katana");
					System.out.println("7-pistola");
					
					int swords = scanner.nextInt();
					System.out.println(" ");
					switch(swords){
						case 1:
							swo = startSword;
							ownn = true;
 							break;
						case 2:	
							if(BasicSword.own == true) {
							swo = BasicSword;
							ownn = true;
							}else {
								System.out.println("non possiedi quest arma");
							}
							break;
						case 3:
							if(woodSword.own == true) {
								swo = woodSword;
								ownn = true;
							}else {
								System.out.println("non possiedi quest arma");
							}
							break;
						case 4:
							if(boneSword.own == true) {
								swo = boneSword;
								ownn = true;
							}else {
								System.out.println("non possiedi quest arma");
							}
							
							break;
						case 5:
							if(copperSword.own == true) {
								swo = copperSword;
								ownn = true;
							}else {
								System.out.println("non possiedi quest arma");
							}
							break;
						case 6:
							if(katana.own == true) {
								swo = katana;
								ownn = true;
							}else {
								System.out.println("non possiedi quest arma");
							}
							break;
						case 7:
							if(pistola.own == true) {
								swo = pistola;
								ownn = true;
							}else {
								System.out.println("non possiedi quest arma");
							}
					}
				}
				
				
				
				
				
				
				
				
				double hp_ = mob.hp;
				
				//verifica se il mob è vivo
				if(mob.hp <= 0) {
					mob.alive = false;
				}
				
				// fight
				if(player.get(0)<= 0) {
					break;
				}
				while(mob.alive == true || player.get(0) <= 0) {
					scanner.nextLine();
					System.out.println(" ");
					mob.hp = swo.attack(mob.hp, mob.name,swo.name);
					ArrayList<Double> playerr = new ArrayList<Double>();
					playerr = mob.damage(player.get(0),player.get(1),mob.damage);
					player.set(0, playerr.get(0));
					player.set(1, playerr.get(1));
					if(player.get(0)<= 0) {
						break;	
					}
					if(mob.hp <= 0) {
						System.out.println(mob.name+" è morto");
						mob.alive = false;
						switch(mob.name) {
						case "zombie":
							coin = coin + 10; 
							break;
						case "scheletro":
							coin = coin + 20;
							break;
						}
					}
					if(player.get(0)<= 0) {
						break;
					}
					
				}
				mob.alive = true;
				mob.hp = hp_;
				ownn = false;
				if(player.get(0)<= 0) {
					break;	
				}
				
				
				
			
				
			}else if(azz == 2){
				System.out.println("hai "+coin+" coin");
				System.out.println("1-armi");
				System.out.println("2-pozzioni");
				
				int ogg = scanner.nextInt();
				System.out.println(" ");
				switch(ogg) {
				case 1:
					double costt = 0;
					int numm= 0;
					for(String i :weaponss) {
						numm= numm+1;
						switch(i) {
						case "Basic Sword":
							costt = BasicSword.cost;
							break;
						case "wood Sword":
							costt = woodSword.cost;
							break;
						case "bone Sword":
							costt = boneSword.cost;
							break;
						case "copper Sword":
							costt = copperSword.cost;
							break;
						case "katana":
							costt = katana.cost;
							break;
						case "pistola":
							costt = pistola.cost;
							break;
						}
						System.out.println(numm+"-"+i +" costo: "+costt);
					}
					System.out.println("");
					
					int shoo = scanner.nextInt();
					System.out.println(" ");
					switch(shoo) {
					case 1:
						if(coin >= BasicSword.cost) {
							BasicSword.own = true;
							coin = coin - BasicSword.cost;
							System.out.println("ora hai "+coin+" coin");
						}else {
							System.out.println("non hai abbastanza soldi");
							System.out.println("possiedi: "+coin+" coin");
						}
						break;
					
						
					case 2:
						if(coin >= woodSword.cost) {
							woodSword.own = true;
							coin = coin - woodSword.cost;
							System.out.println("ora hai "+coin+" coin");
						}else {
							System.out.println("non hai abbastanza soldi");
							System.out.println("possiedi: "+coin+" coin");
						}
						break;
					case 3:
						if(coin >= boneSword.cost) {
							boneSword.own = true;
							coin = coin - boneSword.cost;
							System.out.println("ora hai "+coin+" coin");
						}else {
							System.out.println("non hai abbastanza soldi");
							System.out.println("possiedi: "+coin+" coin");
						}
						break;
					case 4:
						if(coin >= copperSword.cost) {
							copperSword.own = true;
							coin = coin - copperSword.cost;
							System.out.println("ora hai "+coin+" coin");
						}else {
							System.out.println("non hai abbastanza soldi");
							System.out.println("possiedi: "+coin+" coin");
						}
						break;
					case 5 :
						if(coin >= katana.cost) {
							katana.own = true;
							coin = coin - katana.cost;
							System.out.println("ora hai "+coin+" coin");
						}else {
							System.out.println("non hai abbastanza soldi");
							System.out.println("possiedi: "+coin+" coin");
						}
						break;
					case 6:
						if(coin >= pistola.cost) {
							pistola.own = true;
							coin = coin - pistola.cost;
							System.out.println("ora hai "+coin+" coin");
						}else {
							System.out.println("non hai abbastanza soldi");
							System.out.println("possiedi: "+coin+" coin");
						}
						break;
					}
				break;
				case 2:
					int nummm = 0;
					for(String i :potionss) {
						nummm = nummm +1;
						costt = 0;
						switch (i) {
						case "Basic Potions":
							costt = basicPotions.cost;
							break;
						case "Recovery Potions":
							costt =recoveryPotions.cost;
							break;
						case "Armor Potions":
								costt = armorPotions.cost;
							break;
						case "Plus Armor Potions": 
							costt= plusArmorPotions.cost;
							break;
						}
						System.out.println(nummm+"-"+i +" costo: "+costt);
						
						
						}
					
					
					
					int shoo_ = scanner.nextInt();
					System.out.println(" ");
					switch(shoo_) {
					case 1:
						if(coin >= basicPotions.cost) {
							basicPotions.ammont++;
							coin = coin - basicPotions.cost;
							System.out.println("ora hai "+coin+" coin");
						}else {
							System.out.println("non hai abbastanza soldi");
						}
						break;
					case 2:
						
						if(coin >= recoveryPotions.cost) {
							recoveryPotions.ammont++;
							coin = coin - recoveryPotions.cost;
							System.out.println("ora hai "+coin+" coin");
						}else {
							System.out.println("non hai abbastanza soldi");
						}
						break;
					case 3:
						if(coin >= armorPotions.cost) {
							armorPotions.ammont++;
							coin = coin - armorPotions.cost;
							System.out.println("ora hai "+coin+" coin");
						}else {
							System.out.println("non hai abbastanza soldi");
						}
						break;
					case 4:
						if(coin >= plusArmorPotions.cost) {
							plusArmorPotions.ammont++;
							coin = coin - plusArmorPotions.cost;
							System.out.println("ora hai "+coin+" coin");
						}else {
							System.out.println("non hai abbastanza coin");
						}
						break;
						
					}
					}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
				}
		
		
		
		
		
		
		
		
			
	
	
		}
		System.out.println("sei morto");
		scanner.close();
	}
}