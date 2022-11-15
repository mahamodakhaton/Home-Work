package hw8Inheritance;


public class AnimalTest {
	public void name() {
		Animal animal = new Animal();
		animal.animalinfo();
		
		System.out.println("\n---------------------------------\n");
		Mammal mammal = new Mammal(); //Single Inheritance
		mammal.mammalInfo();
		mammal.animalinfo();
		
		
		System.out.println("\n----------------------------------------------------\n");
		Dog dog = new Dog();
		dog.dogInfo();
		dog.mammalInfo();
		dog.animalinfo();
		
		
		
		System.out.println("\n--------------------------------\n");
		BullDog bullDog = new BullDog();
		bullDog.bullDogInfo();
		bullDog.dogInfo();      //Hierarchical inheritance
		bullDog.mammalInfo();
		bullDog.animalinfo();
		
		System.out.println("/n-----------------------------/n");
		Reptile reptile = new Reptile();
		reptile.reptileInfo();
		reptile.animalinfo();
		
		
		System.out.println("/n-------------------------------/n");
		Snake snake = new Snake();
		snake.snakeInfo();           //multilevel inheritance
		snake.reptileInfo();
		snake.animalinfo();
		
		
		System.out.println("/n---------------------------/n");
		Cobra cobra = new Cobra();
		cobra.cobraInfo();
		cobra.snakeInfo();
		cobra.reptileInfo();
		cobra.animalinfo();

		
		
		System.out.println("/n----------------------------/n");
		Birds birds = new Birds();
		birds.birdsInfo();
		birds.animalinfo();
		
		System.out.println("/n------------------------------/n");
		Robin robin = new Robin();
		robin.robinInfo();
		robin.birdsInfo();
		robin.animalinfo();
		
		
		
				
		
		
	
		
		
		
		
	}

}
