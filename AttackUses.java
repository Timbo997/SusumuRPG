class AttackUses {
  public void Attack(user,object, attackPower){
    object.currentHP = object.currentHP - (user.attack * defence * object.defence);
  }
}
