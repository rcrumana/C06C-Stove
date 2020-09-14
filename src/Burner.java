public class Burner {

	public enum Temperature{ BLAZING, HOT, WARM, COLD };
	private Temperature myTemperature;

	public Temperature getMyTemp() {
		return myTemperature;
	}

	private Setting mySetting;
	public int timer;

	public final static int TIME_DURATION = 2;

	public Burner() {
		myTemperature = Temperature.COLD;
		mySetting = Setting.OFF;
	}

	public void plusButton() {
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
			   // The burner is already at the highest setting
			   break;
		}
		this.timer = 0;
	}

	public void minusButton() {
		switch(mySetting){
		   case OFF:
			   System.out.println("The burner is already off");
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
		this.timer = 0;
	}

	public void updateTemperature() {
		if(timer != 0)
		{
			switch(mySetting){
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
		this.timer += TIME_DURATION;
	}

	public void display() {
		System.out.print(mySetting + ".....");
		switch(myTemperature){
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
