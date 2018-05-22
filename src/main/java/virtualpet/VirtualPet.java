package virtualpet;

public class VirtualPet {

	// Instance Variables (Pet Stats)
	
	private String name;
	private int statusNutrition;
	private int statusMood;
	private int statusEnergy;
	
	// Pet Status

	// Constructor

	public VirtualPet (String name) {
		this.name = name;
		this.statusNutrition = 10;
		this.statusMood = 10;
		this.statusEnergy = 10;
	}
	
	/* Get/Set Methods */
	
	// Name

	public String getName() {
		return this.name;
	}
	
	// Nutrition
	
	public int getStatusHunger() {
		return statusNutrition;
	}
	
	public void setStatusHunger(int amount) {
		this.statusNutrition = amount;
	}
		
	public void subtractStatusHunger(int amount) {
		if (this.statusNutrition < amount) {
			this.statusNutrition -= this.statusNutrition;
		} else {
			this.statusNutrition -= amount;
		}
	}
	
	public void addStatusHunger(int amount) {
		if (this.statusNutrition > amount) {
			this.statusNutrition -= this.statusNutrition;
		} else {
			this.statusNutrition -= amount;
		}
	}
	
	// Mood
	
	public int getStatusMood() {
		
	}
	
	

	// Behavior Methods
	
	// Tick

}
