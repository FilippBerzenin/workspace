package praktikum;

public class petMaster {

	public static void main(String[] args) {
		String petReaction;
		pet myPet = new pet ();
//		myPet.eat();
//		petReaction = myPet.say("Chik! Cherik!");
//		System.out.println(petReaction);
//		myPet.sleep();
		Fish myLittelFish = new Fish (40);
		myLittelFish.dive(2);
		myLittelFish.dive(9);
		myLittelFish.dive(2);
//		petReaction = myLittelFish.say("Hello!");
//		System.out.println(petReaction);		
		myLittelFish.sleep();
	}

}
