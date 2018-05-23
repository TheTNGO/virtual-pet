
//INCOMPLETE
//Please don't grade me on this :D

package virtualpet;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import virtualpet.VirtualPet;

public class VirtualPetTest {

	// Stat Tests

	@Test
	public void constructorShouldSetName() {
		VirtualPet underTest = new VirtualPet("Test");
		String name = underTest.getName();
		assertEquals("Test", name);
	}                        
	
	@Test
	public void constructorDefualtNutritionShouldBe10() {
		VirtualPet underTest = new VirtualPet("Test");
		int hunger = underTest.getStatNutrition();
		assertEquals(10, hunger);
	}
	

	@Test
	public void constructorDefualtEnergyShouldBe10() {
		VirtualPet underTest = new VirtualPet("Test");
		int energy = underTest.getStatNutrition();
	}			
				
	@Test 
	
	//copying and pasting code from get/set section for each stat
	public void addStatAdditionShouldNotExceedMax(){
			VirtualPet underTest = new VirtualPet("Test");
			underTest.addStatNutrition(17);
			int nutrition = underTest.getStatNutrition();
			assertEquals(16, nutrition);
		}
	

	/* Behavior Method Tests */

	@Test
	public void inputFeedShouldAddNutrition() {
		VirtualPet underTest = new VirtualPet("Test");
		underTest.inputFeed();
		int nutrition = underTest.getStatNutrition();
		assertEquals(16, nutrition);
	}
	
	@Test
	public void inputFeedShouldAddMood() {
		VirtualPet underTest = new VirtualPet("Test");
		underTest.inputFeed();
		int mood = underTest.getStatMood();
		assertEquals(12, mood);
	}
	
	@Test
	public void inputFeedShouldAddNutritionAndNoMoreThanMax() {
		VirtualPet underTest = new VirtualPet("Test");
		underTest.setStatNutrition(15);
		underTest.inputFeed();
		int nutrition = underTest.getStatNutrition();
		assertEquals(16, nutrition);
	}
	
	@Test
	public void statMoodShouldNotGoPast16() {
		VirtualPet underTest = new VirtualPet("Test");
		underTest.setStatMood(15);
		underTest.addStatMood(16);
		int mood = underTest.getStatMood();
		assertEquals(16, mood );
	}
	
	@Test
	public void statEnergyShouldNotGoPast16() {
		VirtualPet underTest = new VirtualPet("Test");
		underTest.setStatEnergy(15);
		underTest.addStatEnergy(16);
		int energy = underTest.getStatEnergy();
		assertEquals(16, energy );
	}
	
	// TEST BEHAVIOR METHODS ON 5/22
	
}
	




