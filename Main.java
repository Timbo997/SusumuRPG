public class Main { //puBLIC
				
	public static void main(String[] args){ 
		/* the main method should not be contained within
		 * anything else since it is executed immediately by default.
		 */
		
		public String battle(Unit ally, Unit enemy){
			System.out.print(enemy + " attacked!\n" + ally + " is ready to fight");
		}
		
		Unit Susumu = new Unit(10, 10, 5, 4, 5);
		Unit blob = new Unit(3, 5, 8, 13, 21);
		
		while(blob.currentHP != 0 && Susumu.currentHP != 0){
			battle(Susumu, blob);
		}
		
		/* this stuff is kind of broken,, but i've already
		 * modified your code so much that i don't want to take
		 * any liberties in hacking it up that will confuse you
		 */
		
		/*for(blob.currentHP = blob.maxHP, blob.currentHP = 0 | Susumu.currentHP = 0,){  
			battle(Susumu, blob)
		}*/
		
		// something tells me this is a c thing?? for loops in java work differently
	}
}


