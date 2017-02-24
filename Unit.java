public class Unit{ // needs "public" access modifier

	int maxHP; 
	int currentHP;
	int attack;
	int defend;
	int speed;
	int[] attackList;
	
	public Unit(int inMaxHP, int inCurrentHP, int inAttack, int inDefend, int inSpeed, int[] inAttackList){ // each argument needs type int
    		
		maxHP = inMaxHP;
		currentHP = inCurrentHP;
		attack = inAttack;
		defend = inDefend;
		speed = inSpeed;
		attackList = inAttackList.lol
		
	}
	
 }

/* fixed some formatting; feel free to change it to your heart's desire and
 * i'll adjust, just don't make it ugly or i'll rightly call it trash
 * 
 * moved Susumu creation to main class. you only need one main method and it'll
 * reference all the files in the directory that it needs to
 * 
 * THE MOST IMPORTANT THING: i deleted the class "Enemy" and renamed this one "Unit". 
 * there are multiple reasons for this:
 * 1) they do the same thing. they create a unit with the exact same types of stats,
 * regardless of whether they're an ally or an enemy. if you're planning to do different
 * things in the future between allies and enemies then my bad,, feel free to recreate the
 * classes BUT
 * 2) in AttackUses, you have a basic attack algorithm that uses a "user" and an "object". because 
 * you need types for either of these variables (ally, enemy, etc) you would need to create different methods
 * for an Ally user attacking an Enemy object and an Enemy object attacking an Ally user. in order to keep your Ally/Enemy
 * classes you would need to write at least two different algorithms instead and that would both be a little
 * confusing in implementation and also you'd probably want to change at least the name of the class to 
 * something more fitting (like AttackAlgorithms or smthn). but since your enemies and allies function
 * the same way atm, it's kind of unnecessary.
 */
