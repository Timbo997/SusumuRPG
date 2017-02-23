public class AttackUses { // gdi timothy use your dang access modifiers
	
	public void Attack(Unit user, Unit object, int attackPower){ 
		
		object.currentHP = object.currentHP - (user.attack * attackPower * object.defence);
		
	
	}
  
}
