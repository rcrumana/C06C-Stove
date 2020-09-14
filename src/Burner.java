public class Burner {

	public enum Temperature{ BLAZING, HOT, WARM, COLD };
	private Temperature myTemperature;

	public Temperature getMyTemp() { 			//getter for mytemperature
		return myTemperature;
	}

	private Setting mySetting;  				//instance of the setting enum
	public int timer;

	public final static int TIME_DURATION = 2;  //time iterator as per instructions

	public Burner() {							//burner constructor
		myTemperature = Temperature.COLD;
		mySetting = Setting.OFF;
	}

	public void plusButton() {					//plus button method which increases the temperature and resets the timer
		switch(mySetting){
		   case OFF:
			   mySetting = Setting.LOW;
			   break;
		   case LOW:
			   mySetting = Setting.MEDIUM;
			   break;
		   case MEDIUM:
			   mySetting = Setting.HIGH;
			   break;
		   case HIGH:
			   // The burner is already at the highest setting     (It said to make a message but none was provided in the output)
			   break;
		}
		this.timer = 0;
	}

	public void minusButton() {					//minus button method which decreases the temperature and resets the timer
		switch(mySetting){
		   case OFF:
			   // The burner is already off		(It said to make a message but none was provided in the output)
			   break;
		   case LOW:
			   mySetting = Setting.OFF;
			   break;
		   case MEDIUM:
			   mySetting = Setting.LOW;
			   break;
		   case HIGH:
			   mySetting = Setting.MEDIUM;
			   break;
		}
		this.timer = 0;							//resetting timer
	}

	public void updateTemperature() {
		if(timer != 0)							// checks if there has been a passage of time since the last temperature change
		{
			switch(mySetting){					//switch to change the temperature of the burner
			case OFF:
				myTemperature = Temperature.COLD;
				break;
			case LOW:
				myTemperature = Temperature.WARM;
				break;
			case MEDIUM:
				myTemperature = Temperature.HOT;
				break;
			case HIGH:
				myTemperature = Temperature.BLAZING;
				break;
			}
		}
		this.timer += TIME_DURATION;			//incrementing of "time"
	}

	public void display() {						//Display method for burner
		System.out.print(mySetting + ".....");  // using setting toString
		switch(myTemperature){					// switch for the temperature related message
		   case COLD:
			   System.out.println("cooool");
			   break;
		   case WARM:
			   System.out.println("warm");
			   break;
		   case HOT:
			   System.out.println("CAREFUL");
			   break;
		   case BLAZING:
			   System.out.println("VERY HOT! DON'T TOUCH");
			   break;
		}
	}
}
