

* Instance Variables (Status)
	* Hunger (1-15)
		* 1-5: Hungry
		* 6-10: Satiated
		* 11-15: Full

	* Mood (1-15)
		* 1-5: Bored
		* 6-10: Happy
		* 11-15: Manic

	* Energy (1-15)
		* 1-5: Tired
		* 6-10: Chipper
		* 11-15: "Bouncing off the walls"

* Input Methods (All status changes take tick degredation into account)

	* Feed()
		* +6 to hunger 
		* +2 to mood
			* (IF FULL) -2 to energy (IF FULL) / +4 to energy
	
	* Play()
		* +6 to Mood
		* -2 to Energy
		* -2 to Hunger
	
	* PutToBed()
		* +5 to Energy
		* -2 to Hunger
		* +2 to Mood
			

	* DoNothing()

* Result Methods

	* getStatus()

* Tick (Happens with every interaction):
	* -1 to energy  
	* -1 hunger
	* -1 to Mood

* Main
	* Implements game loop
	* asks for user input
	* writes output to console.