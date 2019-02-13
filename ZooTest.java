import java.util.Arrays;

public class ZooTest
{
	public void constructorTest() throws AssertException 
	{
		Zoo zoo = new Zoo(25);
		
		Animal animal1 = new Animal("Brown", "Johnny", 150.2, 60.2);
		Animal animal2 = new Animal("Crimson", "Cream", 120.2, 50.3);
		Animal animal3 = new Animal("Brown","Ryan",130.4, 55.2);
		
		Animal[] animalArray = new Animal[3];
		animalArray[0] = animal1;
		animalArray[1] = animal2;
		animalArray[2] = animal3;
		
		zoo.addAnimal(animal1);
		zoo.addAnimal(animal2);
		zoo.addAnimal(animal3);
		
		
		Assert.assertEquals(25, zoo.getCapacity());
		Assert.assertEquals(((int) ((150.2 + 120.2 + 130.4)/3.0)), zoo.getAverageWeight()); // Hard Code 22-23 because the method getAverageWeight()
		Assert.assertEquals(((int) ((150.2 + 130.4)/2.0)), zoo.getAverageWeight("Brown"));  // already uses Animal.getWeight() 
		Assert.assertEquals((60.2 + 50.3 + 55.2), zoo.getTotalHeight()); // Hard Code , getTotalHeight() uses Animal.getHeight()
		Assert.assertEquals("These animals live in the zoo: \n"
				+ "Johnny, a Brown-colored animal. 150.2 pounds, 60.2 inches\n"
				+ "Cream, a Crimson-colored animal. 120.2 pounds, 50.3 inches\n"
				+ "Ryan, a Brown-colored animal. 130.4 pounds, 55.2 inches\n", zoo.toString());
		
		zoo.expandZoo();
		Assert.assertEquals(50, zoo.getCapacity());
		
		
		
		
		
		
		
	}
}