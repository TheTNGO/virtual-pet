package virtualpet;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import virtualpet.VirtualPet;

public class VirtualPetTest {

	// Status Tests

	@Test
	public void constructorShouldSetName() {
		VirtualPet underTest = new VirtualPet("Test");
		String name = underTest.getName();
		assertEquals("Test", name);
	}                        
	
	@Test
	public void constructorDefualtHungerShouldBe10() {
		VirtualPet underTest = new VirtualPet("Test");
		int hunger = underTest.getStatusHunger();
		assertEquals(10, hunger);
	}
	
	@Test
	public void constructorDefualtMoodShouldBe10() {
		VirtualPet underTest = new VirtualPet("Test");
		int mood = underTest.getStatusMood();
		assertEquals(10, mood);
	}

	@Test
	public void constructorDefualtEnergyShouldBe10() {
		VirtualPet underTest = new VirtualPet("Test");
		int energy = underTest.getStatusM
	}
//	@Test
//	public void cannotMakeHungerNegativeAfterSubtractingMoreHungerPointsThanCurrent() {
//		Vpet underTest = new Vpet("Test");
//		underTest.setStat
//		
//		assertEquals(0, underTest.getStatusHunger());
//	}



}
