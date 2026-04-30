package pet;

public class petTest {

	public static void main(String[] args) {
	//polymorphism
		pet myPet;
		
		myPet=new cat();
		System.out.println(myPet.speak());
		
		myPet=new dog();
		System.out.println(myPet.speak());
	
		
		

	}

}
