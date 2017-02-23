public class AttackUses { // gdi timothy use your dang access modifiers
	
	public void Attack(Unit user, Unit object/*, int attackPower*/){ // java needs to know what type your arguments are. (they're Units)
		
		object.currentHP = object.currentHP - (user.attack * defence * object.defence);
		
		/* you don't seem to be using
		 * attackPower. i'm assuming you mean the 
		 * power of the user's attack? you don't
		 * need to have that in the arguments -  
		 * if your method takes the user, it can
		 * access any stats that the user has 
		 * regardless.
		 * 
		 * as far as the algorithm goes i'm used to
		 * fire emblem attack algorithms so 
		 * i'm not sure what you want to do there
		 * thus i can't fix it,,
		 * 
		 * so this stuff throws errors but it'S FINE
		 */
		
	}
  
}
