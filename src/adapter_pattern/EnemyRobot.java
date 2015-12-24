package adapter_pattern;

import java.util.Random;

public class EnemyRobot {
	Random genrator=new Random();
	
	void smashWithHands(){
		int attackDamage=genrator.nextInt(10)+1;
		System.out.println("Enemy Robot Causes "+attackDamage+" Damage");
	}

	void walkForward(){
		int attackDamage=genrator.nextInt(5)+1;
		System.out.println("Enemy Robot Walkes "+attackDamage+" Damage");
	}
	
	void reactToHuman(String name){
		System.out.println("Enemy Robot Tramps on "+name);
	}
}