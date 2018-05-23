
PROJECT OUTLINE

* Instance Variables (Status)

	** ALL VALUES START AT 10

	* Nutrition (1-16)
		* 1-8: Hungry
		* 9-16: Not Hungry

	* Mood (1-15)
		* 1-8: Sad
		* 9-16: Happy

	* Energy (1-15)
		* 1-8: Tired
		* 9-16: Ready

* Input Methods (All status changes take tick degredation into account)

	* Feed()
		* +6 to Nutrition 
		* +9 to Mood
		* +3 to Energy
			

	* Play()
		* +9 to Mood
		* -4 to Energy
		* -4 to Hunger

	
	* PutToBed()
		* +6 to Energy
		* -4 to Hunger
		* +9 to Mood
			

	* DoNothing()
		* idle message
		* tick


* Tick (Happens with every interaction; mainly for "Do Nothing" input currently):

	* -1 to energy  
	* -1 hunger
	* -3 to Mood

* Main
	* Implements game loop
	* asks for user input
	* writes output to console.

