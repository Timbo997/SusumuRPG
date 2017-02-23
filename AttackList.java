public class AttackList { // needs "public" access modifier

	public String findAttack(int attackNumber){ // "String" is capitalized because it's not a primitive type
		
		String attackName;
		
		switch (attackNumber) {
			case 1:  attackName = "January Breeze";
            break;
			default: attackName = "Invalid attack";
            break;
		}
		
		return attackName; // this is a String method that isn't void; it has to return a String
	
	}
}

/* i fixed more formatting, feel free to yell at me
 * i like the name january breeze. that is a good attack name
 */
