package virtualpet;

public class VirtualPet {
	
	/* Constructor */

	public VirtualPet (String name) {
		this.name = name;
		this.statNutrition = 10;
		this.statMood = 10;
		this.statEnergy = 10;
	}
	

	/* Pet Stats */
	
	private String name;
	private int statNutrition;
	private int statMood;
	private int statEnergy;
	

	/* Get/Set Methods */
	
	// Name

	public String getName() {
		return this.name;
	}
	
	// Nutrition
	
	public int getStatNutrition() {
		return statNutrition;
	}
	
	public void setStatNutrition(int amount) {
		this.statNutrition = amount;
	}
		
	public void subtractStatNutrition(int amount) {
		if (this.statNutrition < amount) {
			this.statNutrition -= this.statNutrition;
		} else {
			this.statNutrition -= amount;
		}
	}
	
	public void addStatNutrition(int amount) {
		this.statNutrition += amount;
		if (this.statNutrition > 16) {
			this.statNutrition = 16;
		}
	}
	
	// Mood
	
	public int getStatMood() {
		return statMood;
	}
	
	public void setStatMood(int amount) {
		this.statMood = amount;
	}
		
	public void subtractStatMood(int amount) {
		if (this.statMood < amount) {
			this.statMood -= this.statMood;
		} else {
			this.statMood -= amount;
		}
	}
	
	public void addStatMood(int amount) {
		this.statMood += amount;
		if (this.statMood > 16) {
			this.statMood = 16;
		}
	}
	
	// Energy
	
	public int getStatEnergy() {
		return statEnergy;
	}
	
	public void setStatEnergy(int amount) {
		this.statEnergy = amount;
	}
		
	public void subtractStatEnergy(int amount) {
		if (this.statEnergy < amount) {
			this.statEnergy -= this.statEnergy;
		} else {
			this.statEnergy -= amount;
		}
	}
	
	public void addStatEnergy(int amount) {
		this.statEnergy += amount;
		if (this.statEnergy > 16) {
			this.statEnergy = 16;
		}
	}
	

	/* Behavior Methods */
	
	public void inputFeed() {
		this.addStatNutrition(6);
		this.addStatMood(2);
	}
	
	public void inputPlay() {
		this.addStatMood(6);
		this.subtractStatEnergy(2);
		this.subtractStatNutrition(2);
	}
	
	public void inputSleep() {
		this.addStatEnergy(6);
		this.addStatMood(2);
		this.subtractStatNutrition(2);
	}
	
	
	
	/* On Tick */

}
