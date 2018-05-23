
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
		* +6 to hunger 
		* +2 to mood
			

	* Play()
		* +6 to Mood
		* -2 to Energy
		* -2 to Hunger

	
	* PutToBed()
		* +6 to Energy
		* -2 to Hunger
		* +2 to Mood
			

	* DoNothing()
		* idle message
		* tick


* Tick (Happens with every interaction):

	* -1 to energy  
	* -1 hunger
	* -1 to Mood

* Main
	* Implements game loop
	* asks for user input
	* writes output to console.

****************************************************************

VirtualPet Stretch Outlines

	Cumulative Tick (every 5 ticks)

		* Status
			* Sick
				* Death
			* Ran Away

			* Happy	

	Report Stats

		* if Nutrition < 8
			* doesn't want to play
			* puts toward sick/death count (+/-)
		* if Mood: < 8
			* gets sad (puts toward run away count)			
		* if Energy: < 8
			* can't play
			* put toward recovery count (+/-)
